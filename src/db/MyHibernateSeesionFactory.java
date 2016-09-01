package db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by li on 2016/8/31.
 */
public class MyHibernateSeesionFactory {
    private static SessionFactory sessionFactory;
    private MyHibernateSeesionFactory() {
    }
    public static SessionFactory getinstance(){
        if (sessionFactory==null){
            synchronized (MyHibernateSeesionFactory.class){
                if (sessionFactory==null){
                    Configuration configuration=new Configuration().configure();
                    ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
                    sessionFactory=configuration.buildSessionFactory(serviceRegistry);
                }
            }
        }
    return sessionFactory;
    }
}
