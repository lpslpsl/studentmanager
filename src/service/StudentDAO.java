package service;

import entity.StudentEntity;

import java.util.List;

/**
 * Created by li on 2016/9/1.
 */
public interface StudentDAO {
    //    查询所有
    List<StudentEntity> queryAllStudents();

    //根据sid查询
    StudentEntity queryStudentBysid(int sid);

    //添加
    boolean addStudent(StudentEntity studentEntity);

    //修改
    boolean updateStudent(StudentEntity studentEntity);

    //    删除
    boolean deleteStudent(int sid);

}
