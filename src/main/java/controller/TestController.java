package controller;

import dao.TeacherStudentMapper;
import model.Student;
import model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test()
    {
        return "index.jsp";
    }


    @RequestMapping("/testlogin")
    public String loginPage()
    {

        return "login/login.jsp";
    }

    @Autowired
    private TeacherStudentMapper tsm;
    @RequestMapping("/testTeacher")
    public void test03()
    {
        List<Teacher> teachers = tsm.queryStudentTeacher(1);
        System.out.println(teachers);
    }
}
