package serviceimpl;

import db.MyHibernateSeesionFactory;
import entity.UserEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import service.UsersDAO;

import java.util.List;

/**
 * Created by li on 2016/8/31.
 */
public class UsersDaoImpl implements UsersDAO {
    @Override
    public boolean userLogin(UserEntity userEntity) {
        Transaction transaction = null;
        String hql = "";
        try {
            Session session = MyHibernateSeesionFactory.getinstance().openSession();
            transaction=session.beginTransaction();
            hql = " from UserEntity where uname=? and upass=?";
            Query query = session.createQuery(hql);
            query.setParameter(0, userEntity.getUname());
            query.setParameter(1, userEntity.getUpass());
            List list = query.list();
            transaction.commit();
            return list.size() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (transaction != null) {
                transaction = null;
            }
        }
    }
}
