package controller;

import dao.StudentMapper;
import dao.TeacherMapper;
import enumconst.Role;
import model.Student;
import model.StudentExample;
import model.Teacher;
import model.TeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class LoginController {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    @RequestMapping("/login")
    public String loginPage(String username, String password, String role, HttpSession session)
    {
        if(!StringUtils.isEmpty(role))
        {
            if(role.equals("学生"))
            {
                StudentExample studentExample = new StudentExample();
                studentExample.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
                List<Student> students = studentMapper.selectByExample(studentExample);
                if(students.size() != 0)
                {
                    session.setAttribute("role", Role.Student);
                    session.setAttribute("user", students.get(0));
                    return "redirect:/student/homework";
                }

            }else if(role.equals("教师"))
            {
                TeacherExample teacherExample = new TeacherExample();
                teacherExample.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
                List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
                if(teachers.size() != 0)
                {
                    session.setAttribute("role", Role.Teacher);
                    session.setAttribute("user", teachers.get(0));
                    return "redirect:/teacher/index.jsp";
                }
            }
        }
        return "login/login.jsp";
    }
}
