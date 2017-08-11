package tools;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.Reader;

public class DBTools {

    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    private static Reader reader;


    static{
        try{
            reader = Resources.getResourceAsReader("Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

}
