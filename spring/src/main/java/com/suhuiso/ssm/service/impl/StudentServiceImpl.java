package com.suhuiso.ssm.service.impl;

import com.suhuiso.ssm.mapper.StudentMapper;
import com.suhuiso.ssm.model.Student;
import com.suhuiso.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    public boolean updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    public boolean deleteStudent(int id) {
        return studentMapper.deleteStudent(id);
    }

    public Student getStudentById(int id) {
        return this.studentMapper.getStudentById(id);
    }

    public List<Student> getAllStudent() {
        List<Student> list = studentMapper.getAllStudent();
        return list;
    }
}
