	package com.pro.wing.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.wing.entity.Student;
import com.pro.wing.services.StudentService;

@RestController
@RequestMapping("/std-home")
public class StudentController {

	@Autowired
	StudentService service;
	@PostMapping("/insert")
	public Student createStudent(@RequestBody Student std ) {
		return service.createStudent(std);
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable("id") int id ) {
		return service.getstudentById(id);
	}
	
	@PutMapping("/insert/{id}")
	public Student updateStudentById(@PathVariable("id") int id,@RequestBody Student std ) {
		return service.updateStudentById(id,std);
	}
	@DeleteMapping("/delete/{id}")
	public Student deleteStudentById(@PathVariable("id") int id) {
		return service.deleteStudentById(id);
	}
	
	
	
}
