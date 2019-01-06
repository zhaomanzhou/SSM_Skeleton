import dao.StudentMapper;
import dao.TeacherStudentMapper;
import model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc-servlet.xml","classpath:ApplicationContext.xml"})
public class MybatisTest4 {
    @Autowired
    private StudentMapper sm;

    @Autowired
    private TeacherStudentMapper tsm;

    @Test
    public void addStudent()
    {
        Student s = new Student();
        s.setName("张三丰");
        s.setPassword("123");
        sm.insert(s);
    }

    @Test
    public void test02()
    {
        tsm.queryStudentTeacher(1);
    }
}
