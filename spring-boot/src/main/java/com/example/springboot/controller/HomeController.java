package com.example.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;

@RestController
@RequestMapping("/home")

public class HomeController {
	
	@Autowired
	StudentRepository repository;
	
	@GetMapping
	public String sayHi() {
		return "Heloo from spring boot!!";
	}
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		List<Student> studList = repository.findAll();
		return studList;
		
	}
	
	
	@PostMapping("/student/find")
	//@GettMapping("/student/find")
	//public Student getStudentById(@RequestParam("id" ) int id) 
	public Student getStudentById(@RequestBody int id) {
		Optional<Student> stud = repository.findById(id);
		if(stud.isPresent()) {
			return stud.get();
		}
		else {
			return null;
		}
	
	}
		
}
