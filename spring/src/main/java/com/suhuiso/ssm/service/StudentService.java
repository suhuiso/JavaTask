package com.suhuiso.ssm.service;

import com.suhuiso.ssm.model.Student;

import java.util.List;

public interface StudentService {
    public int addStudent(Student student);

    public boolean updateStudent(Student student);

    public boolean deleteStudent(int id);

    public Student getStudentById(int id);

    public List<Student> getAllStudent();
}
