package com.hongying.service;

import java.util.List;
import java.util.Map;

import com.hongying.bean.student;

public interface StudentService {
	public int saveStudent(student area);
	public int deleteStudent(Map param);
	public int deleteStudentAll();
	public int updateStudent(student area);
	public List<student> queryStudentById(Map param);
}
