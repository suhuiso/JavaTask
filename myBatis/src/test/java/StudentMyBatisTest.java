import mappers.StudentMapper;
import model.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tools.DBTools;

import java.util.List;

public class StudentMyBatisTest {
    private SqlSession sqlSession;

    @Test
    public void getStudentByIdTest() {
        // 获取Session连接
        sqlSession = DBTools.getSession();
        // 获取Mapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        try {
            Student student = studentMapper.getStudentById(100);
            System.out.println(student.toString());
            // 提交事务
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
        }
    }

    @Test
    public void getAllStudentTest() {
        sqlSession = DBTools.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        try {
            List<Student> list = studentMapper.getAllStudent();
            System.out.println(list.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
    }

    @Test
    public void addStudentTest() {
        sqlSession = DBTools.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student("王五", "java", 10, 20170811, 20170811, "hello");
        try {
            studentMapper.addStudent(student);
            System.out.println(student.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
    }

    @Test
    public void deleteStudentTest() {
        sqlSession = DBTools.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        try {
            studentMapper.deleteStudent(100);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
    }

    @Test
    public void updateStudentTest() {
        sqlSession = DBTools.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.getStudentById(1);
        student.setDeclaration("bye");
        try {
            studentMapper.updateStudent(student);
            System.out.println(student.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }

    }

}
