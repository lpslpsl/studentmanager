package serviceimpl;

import db.MyHibernateSeesionFactory;
import entity.StudentEntity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import service.StudentDAO;

import java.util.List;

/**
 * Created by li on 2016/9/1.
 */
public class StudentDaoImpl implements StudentDAO {
    @Override
    public List<StudentEntity> queryAllStudents() {
        Transaction transaction = null;
        List<StudentEntity> studentEntities = null;
        String hql = "";
        try {
            Session session = MyHibernateSeesionFactory.getinstance().openSession();
            transaction = session.beginTransaction();
            hql = "from StudentEntity ";
            Query query = session.createQuery(hql);
            studentEntities = query.list();
            transaction.commit();
            return studentEntities;
        } catch (HibernateException e) {
            e.printStackTrace();
            transaction.commit();
            return studentEntities;
        } finally {
            if (transaction != null) {
                transaction = null;
            }
        }
    }

    @Override
    public StudentEntity queryStudentBysid(int sid) {
        Transaction transaction = null;
        String hql;
        Session session = MyHibernateSeesionFactory.getinstance().openSession();
        transaction = session.beginTransaction();
        hql = "from StudentEntity  where sid=?";
        Query query = session.createQuery(hql);
        query.setParameter(0, sid);
//        query.
        return null;
    }

    @Override
    public boolean addStudent(StudentEntity studentEntity) {
        return false;
    }

    @Override
    public boolean updateStudent(StudentEntity studentEntity) {
        return false;
    }

    /**
     * 删除学生
     *
     * @param sid
     * @return
     */
    @Override
    public boolean deleteStudent(int sid) {
        Transaction transaction = null;
        try {

            Session session = MyHibernateSeesionFactory.getinstance().openSession();
            transaction = session.beginTransaction();
            Object o = session.get(StudentEntity.class, sid);
            session.delete(o);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            transaction.commit();
        } finally {
            if (transaction != null) {
                transaction = null;
            }
        }
        return false;
    }
}
