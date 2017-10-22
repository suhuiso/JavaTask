package com.suhuiso.ssm.service.impl;

import com.suhuiso.ssm.mapping.StudentMapper;
import com.suhuiso.ssm.pojo.Student;
import com.suhuiso.ssm.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by suhuiso on 2017/10/22.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(Student record) {
        return 0;
    }

    public int insertSelective(Student record) {
        return 0;
    }

    public Student selectByPrimaryKey(Integer id) {
        return this.studentMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Student record) {
        return 0;
    }

    public int updateByPrimaryKey(Student record) {
        return 0;
    }
}
