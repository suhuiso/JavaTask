import com.alibaba.fastjson.JSON;
import com.suhuiso.ssm.service.StudentService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.annotation.Resource;

import com.suhuiso.ssm.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by suhuiso on 2017/10/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
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
        Student student = studentService.selectByPrimaryKey(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(student));
    }
}
