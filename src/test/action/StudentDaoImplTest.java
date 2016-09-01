package test.action; 

import serviceimpl.StudentDaoImpl;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import service.StudentDAO;

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
//TODO: Test goes here... 
} 

/** 
* 
* Method: updateStudent(StudentEntity studentEntity) 
* 
*/ 
@Test
public void testUpdateStudent() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: deleteStudent(int sid) 
* 
*/ 
@Test
public void testDeleteStudent() throws Exception { 
//TODO: Test goes here... 
} 


} 
