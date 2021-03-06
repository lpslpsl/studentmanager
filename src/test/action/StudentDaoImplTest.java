package test.action; 

import entity.StudentEntity;
import org.junit.Assert;
import serviceimpl.StudentDaoImpl;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import service.StudentDAO;

import java.sql.Date;

/** 
* StudentDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 1, 2016</pre> 
* @version 1.0 
*/ 
public class StudentDaoImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: queryAllStudents() 
* 
*/ 
@Test
public void testQueryAllStudents() throws Exception {
    StudentDAO studentDAO=new StudentDaoImpl();
    System.out.println(studentDAO.queryAllStudents());
} 

/** 
* 
* Method: queryStudentBysid(int sid) 
* 
*/ 
@Test
public void testQueryStudentBysid() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addStudent(StudentEntity studentEntity) 
* 
*/ 
@Test
public void testAddStudent() throws Exception {
    StudentEntity studentEntity=new StudentEntity();
    studentEntity.setSname("李s四asadf");
    studentEntity.setGender(0);
    studentEntity.setBirthday(new Date(12,3,5));
    studentEntity.setAddress("四川巴中");
    StudentDAO studentDAO=new StudentDaoImpl();

    Assert.assertEquals(true,    studentDAO.addStudent(studentEntity));
} 

/** 
* 
* Method: updateStudent(StudentEntity studentEntity) 
* 
*/ 
@Test
public void testUpdateStudent() throws Exception {
    StudentEntity studentEntity=new StudentEntity();
    studentEntity.setSname("李s四adf");
    studentEntity.setSid(5);
    studentEntity.setGender(0);
    studentEntity.setBirthday(new Date(12,3,5));
    studentEntity.setAddress("四川巴中");
    StudentDAO studentDAO=new StudentDaoImpl();

    Assert.assertEquals(true,    studentDAO.updateStudent(studentEntity));
} 

/** 
* 
* Method: deleteStudent(int sid) 
* 
*/ 
@Test
public void testDeleteStudent() throws Exception { 
StudentDAO studentDAO=new StudentDaoImpl();
    boolean b = studentDAO.deleteStudent(6);
    Assert.assertEquals(true,b);

} 


} 
