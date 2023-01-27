package com.luv2code.com.springboot.siddharth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.siddharth.model.Student;
//@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
