package test.serviceimpl; 

import db.MyHibernateSeesionFactory;
import entity.StudentEntity;
import entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import service.UsersDAO;
import serviceimpl.UsersDaoImpl;

import java.sql.Date;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/** 
* UsersDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 31, 2016</pre> 
* @version 1.0 
*/ 
public class UsersDaoImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: userLogin(UserEntity userEntity) 
* 
*/ 
@Test
public void testUserLogin() throws Exception {
    UserEntity userEntity=new UserEntity(1,"lps","123456");
    UsersDAO usersDAO=new UsersDaoImpl();
   Assert.assertEquals( true,usersDAO.userLogin(userEntity));
}
    @Test
    public void addStudent(){
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setSname("张三");
        studentEntity.setGender(0);
        studentEntity.setBirthday(new Date(2012,10,25));
        studentEntity.setAddress("四川巴中");
        Session session= MyHibernateSeesionFactory.getinstance().openSession();
        Transaction transaction=session.beginTransaction();
        session.save(studentEntity);
        transaction.commit();
        session.close();
    }


} 
