package mappers;

import model.Student;

import java.util.List;

public interface StudentMapper {

    public int addStudent(Student student);

    public boolean updateStudent(Student student);

    public boolean deleteStudent(int id);

    public Student getStudentById(int id);

    public List<Student> getAllStudent();

}
