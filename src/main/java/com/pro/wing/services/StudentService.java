package com.pro.wing.services;

import java.util.Optional;

import com.pro.wing.entity.Student;

public interface StudentService {

	Student createStudent(Student std);

	Student getstudentById(int id);

	Student updateStudentById(int id, Student std);

	Student deleteStudentById(int id);


	

	

	
	

}
