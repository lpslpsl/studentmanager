package action;

import entity.StudentEntity;
import service.StudentDAO;
import serviceimpl.StudentDaoImpl;

import java.util.List;

/**
 * Created by li on 2016/9/1.
 */
public class StudentAction extends SuperAction {
    public String queryall() {
        StudentDAO studentDAO = new StudentDaoImpl();
        List<StudentEntity> studentEntities = studentDAO.queryAllStudents();
        if (studentEntities != null && studentEntities.size() > 0) {
            httpSession.setAttribute("studentlist", studentEntities);
        }
        return "studentqueryall";
    }

    public String deleteStudentByid() {
        StudentDAO studentDAO = new StudentDaoImpl();
        int sid = Integer.valueOf(request.getParameter("sid"));
        boolean b = studentDAO.deleteStudent(sid);
        if (b) {
            return "delete_success";
        }
        return "";
    }
}
