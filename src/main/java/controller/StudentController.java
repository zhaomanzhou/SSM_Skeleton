package controller;

import dao.HomeworkMapper;
import dao.HwStudentMapper;
import dao.MarkMapper;
import dao.TeacherStudentMapper;
import entity.TeacherMark;
import model.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private HwStudentMapper hwStudentMapper;
    @Autowired
    private HomeworkMapper hm;
    @Autowired
    private TeacherStudentMapper teacherStudentMapper;

    @Autowired
    private MarkMapper markMapper;

    @RequestMapping("/student/homework")
    public ModelAndView queryHomework(HttpSession session) {
        //TODO
        Student s = new Student();
        s.setId(1);
        session.setAttribute("user", s);
        ModelAndView mv = new ModelAndView();
        List<HomeworkItem> list = new ArrayList<>();
        List<Teacher> teachers = teacherStudentMapper.queryStudentTeacher(((Student) session.getAttribute("user")).getId());
        for (Teacher t : teachers) {
            HomeworkExample e = new HomeworkExample();
            e.createCriteria().andTeacherIdEqualTo(t.getId());
            List<Homework> homework = hm.selectByExample(e);
            for (Homework h : homework) {
                HomeworkItem item = new HomeworkItem();
                BeanUtils.copyProperties(h, item);
                item.setTeacherName(t.getName());
                list.add(item);
            }
        }
        //System.out.println(list);
        mv.addObject("list", list);
        mv.setViewName("student/index");
        return mv;
    }


    @RequestMapping("/student/teacher_mark")
    public ModelAndView getAllTeacher(HttpSession session)
    {
        //TODO
        Student s = new Student();
        s.setId(1);
        session.setAttribute("user", s);
        List<TeacherMark> list = new ArrayList<>();
        List<Teacher> teachers = teacherStudentMapper.queryStudentTeacher(((Student) session.getAttribute("user")).getId());
        for(Teacher t: teachers)
        {
            TeacherMark tm = new TeacherMark();
            BeanUtils.copyProperties(t, tm);
            TeacherStudent ts = teacherStudentMapper.getTeacherMark(t.getId(),s.getId()).get(0);
            tm.setMark(ts.getMark()+"");
            list.add(tm);
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("list", list);
        mv.setViewName("/student/teacher");
        return mv;
    }

    @RequestMapping("/student/student_mark")
    public ModelAndView getAllMark(HttpSession session)
    {
        //TODO
        Student s = new Student();
        s.setId(1);
        session.setAttribute("user", s);
        List<Teacher> teachers = teacherStudentMapper.queryStudentTeacher(((Student) session.getAttribute("user")).getId());
        ModelAndView mv = new ModelAndView();
        MarkExample e = new MarkExample();
        e.createCriteria().andStudentIdEqualTo(s.getId());
        List<Mark> marks = markMapper.selectByExample(e);
        mv.addObject("list", marks);
        mv.setViewName("/student/mark");
        return mv;
    }
}
