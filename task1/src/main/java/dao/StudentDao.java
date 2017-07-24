package dao;

import java.util.List;

/**
 * Created by suhuiso on 2017/7/20.
 */
public interface StudentDao {

    public void addStudent(Student student);

    public void updateStudent(Student student);

    public List<Student> getStudent();

    public void deleteStudent(int id);



}
