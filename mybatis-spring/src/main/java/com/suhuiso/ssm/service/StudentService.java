package com.suhuiso.ssm.service;

import com.suhuiso.ssm.pojo.Student;

/**
 * Created by suhuiso on 2017/10/22.
 */
public interface StudentService {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
