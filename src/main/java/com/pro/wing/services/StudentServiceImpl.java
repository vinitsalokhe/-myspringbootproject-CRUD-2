package com.pro.wing.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.wing.dao.StudentDao;
import com.pro.wing.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao;
	@Override
	public Student createStudent(Student std) {
		
		return dao.save(std);
	}
	@Override
	public Student getstudentById(int id) {
		return dao.findById(id).get();
	}
	@Override
	public Student updateStudentById(int id, Student std) {
		Student s = dao.findById(id).get();
		s.setName(std.getName());
		s.setCity(std.getCity());
		dao.save(s);
		return s;
	}
	@Override
	public Student deleteStudentById(int id) {
		return dao.findById(id).get();
	}
	
	
	
	
	

}
