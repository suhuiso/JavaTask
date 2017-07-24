import dao.Student;
import dao.StudentDao;
import dao.StudentDaoImpl;
import jdbc.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

/**
 * Created by suhuiso on 2017/7/20.
 */
public class HelloWorld {

    public static void main(String[] args) {

        StudentDao sd = new StudentDaoImpl();
        sd.addStudent(new Student("张三", "java", 15, 20170724, 20170724, "老大最帅"));

        sd.updateStudent(new Student(10, "李四", "java", 15, 20170724, 20170724, "老大最帅"));

        sd.deleteStudent(10);

        List<Student> list = sd.getStudent();
        Iterator<Student> it = list.iterator();
        while(it.hasNext()) {
            Student student = it.next();
            System.out.println("ID: "+student.getId()+", Name");
        }

    }
}
