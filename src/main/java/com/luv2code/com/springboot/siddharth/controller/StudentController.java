package com.luv2code.com.springboot.siddharth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.com.springboot.siddharth.service.StudentService;
import com.luv2code.springboot.siddharth.model.Student;


@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public Student saveStudent(@RequestBody Student student) {
		
		student.setId(0);
		
		studentService.saveStudent(student);
		return student;
	}
}