package com.hongying.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hongying.bean.student;
import com.hongying.dao.studentMapper;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	studentMapper mapper;

	public int saveStudent(student area) {
		return mapper.saveStudent(area);
	}

	public int deleteStudent(int id) {
		return mapper.deleteStudent(id);
	}

	public int deleteStudentAll() {
		return mapper.deleteStudentAll();
	}

	public int updateStudent(student area) {
		return mapper.updateStudent(area);
	}

	public List<student> queryStudentById(Map param) {
		return mapper.queryStudentById(param);
	}

}
