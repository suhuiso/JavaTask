//package com.suhuiso.ssm.JunitTest;
//
//import com.suhuiso.ssm.model.Student;
//import com.suhuiso.ssm.service.StudentService;
//import org.apache.commons.logging.Log;
//import org.junit.Test;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
///**
// * Created by suhuiso on 2017/10/22.
// */
//@Component
//public class JunitTest {
//    private static final Log log = (Log) LogFactory.getLog(JunitTest.class);
//    @Autowired
//    private static StudentService studentService;
//    @Test
//    public void testSpring(){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//        StudentService studentService =(StudentService) ctx.getBean("studentService");
//        List<Student> list = studentService.getAllStudent();
//        log.info("get List data is" + list);
//
//    }
//}
