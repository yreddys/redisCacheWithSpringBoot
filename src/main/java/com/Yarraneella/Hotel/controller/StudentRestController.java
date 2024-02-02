package com.Yarraneella.Hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Yarraneella.Hotel.entity.Student;
import com.Yarraneella.Hotel.repository.StudentRepository;
@RestController
public class StudentRestController {
	@Autowired
	private StudentRepository srepo;
	
	@GetMapping("/students")
	public Iterable<Student> getAllStudents(){
		return srepo.findAll();
	}
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		srepo.save(student);
		return "Student Saved";
	}
}
