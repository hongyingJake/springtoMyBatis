package com.hongying.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hongying.bean.student;
@Repository
public interface studentMapper {
	    int saveStudent(student area);
	    int deleteStudent(int id);
	    int deleteStudentAll();
	    int updateStudent(student area);
	    List<student> queryStudentById(Map param);
}
