package com.luv2code.com.springboot.siddharth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.com.springboot.siddharth.repository.StudentRepository;
import com.luv2code.springboot.siddharth.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student theStudent) {
		
		return studentRepository.save(theStudent);
	}

}
