package dao;

import jdbc.JdbcUtil;

import java.util.*;
import java.sql.*;

public class StudentDaoImpl implements StudentDao {

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    JdbcUtil jdbcUtil = new JdbcUtil();

    public void addStudent(Student student) {
        String sql = "insert into student values (?,?,?,?,?,?,?)";
        try {
            conn = jdbcUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getType());
            pstmt.setInt(3, student.getNum());
            pstmt.setLong(4, student.getUpdateAt());
            pstmt.setLong(5, student.getCreateAt());
            pstmt.setString(6, student.getDeclaration());
            int count = pstmt.executeUpdate();
            System.out.println("添加记录条数:"+count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.closeAll(rs, pstmt, conn);
        }

    }

    public void updateStudent(Student student) {
        String sql = "update student set name = ?, type = ?, c_num = ?, update_at = ?, create_at = ?, declaration = ? where id = ?";
        try {
            conn = jdbcUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getType());
            pstmt.setInt(3, student.getNum());
            pstmt.setLong(4, student.getUpdateAt());
            pstmt.setLong(5, student.getCreateAt());
            pstmt.setString(6, student.getDeclaration());
            pstmt.setInt(7, student.getId());
            int count = pstmt.executeUpdate();
            System.out.println("更新记录条数:"+count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.closeAll(rs, pstmt, conn);
        }

    }

    public List<Student> getStudent() {
        List<Student> list = new ArrayList<Student>();
        String sql = "select * from student";
        conn = jdbcUtil.getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getLong(5), rs.getLong(6), rs.getString(7));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.closeAll(rs, pstmt, conn);
        }

        return list;
    }

    public void deleteStudent(int id) {
        String sql = "delete from student where id = ?";
        conn = jdbcUtil.getConnection();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            int count = pstmt.executeUpdate();
            System.out.println("删除记录条数:"+count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.closeAll(rs, pstmt, conn);
        }

    }
}
