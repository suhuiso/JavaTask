import model.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tools.DBTools;

public class StudentMyBatisTest {
    public SqlSession sqlSession;

    @Test
    public void findStudentByIdTest() {
        DBTools dbTools = new DBTools();
        sqlSession = dbTools.getSession();

        Student student = sqlSession.selectOne("mappers.StudentMapper.getStudentById", 100);
        System.out.println(student);
        sqlSession.close();
    }

}
