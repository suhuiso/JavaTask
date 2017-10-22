import com.suhuiso.ssm.model.Student;
import com.suhuiso.ssm.service.StudentService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.annotation.Resource;
import com.alibaba.fastjson.JSON;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
@Component
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    	private ApplicationContext ac = null;
    @Resource
    private StudentService studentService = null;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		studentService = (StudentService) ac.getBean("studentService");
	}

    @Test
    public void test1() {
        Student student = studentService.getStudentById(101);
//         System.out.println(student.toString());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(student));
    }
//    private static final Log log = (Log) LogFactory.getLog(TestMyBatis.class);
//    @Autowired
//	 private static StudentService studentService;
//    @Test
//	public void testSpring(){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//        StudentService studentService =(StudentService) ctx.getBean("studentService");
//        List<Student> list = studentService.getAllStudent();
//        log.info("get List data is" + list);
//
//    }

//    @Test
//    public void addStudentTest() {
//        Student student = new Student("lily", "java", 10, 20170811, 20170811, "hello");
//        studentService.addStudent(student);
//        System.out.println(student.toString());
//
//
//    }

}
