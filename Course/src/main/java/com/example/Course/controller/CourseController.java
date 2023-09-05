package com.example.Course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Course.intercomm.StudentClient;
import com.example.Course.model.Courses;
import com.example.Course.model.Student;
import com.example.Course.repository.CourseRepository;



@RestController
@RequestMapping("/home")

public class CourseController {
	
	@Autowired
	CourseRepository repository;
	
	@Autowired
	StudentClient studClient;
	
	@GetMapping("/service/stud/{studId}")
	public Student getStud(@PathVariable int studId) {
		return studClient.getStudent(studId);
	}
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		List<Courses> courseList = repository.findAll();
		return courseList;
		
	}
	
	
	@GetMapping("/courses/find")
	public Courses getCoursesById(@RequestParam("id")int id) {
		Optional<Courses> course = repository.findById(id);
		if(course.isPresent()) {
			return course.get();
		}
		else {
			return null;
	}
}
		
		@GetMapping("/courses/find/{id}")
		public Courses getCourseByIdd(@PathVariable("id")int id) {
			Optional<Courses> course = repository.findById(id);
			if(course.isPresent()) {
				return course.get();
			}
			else {
				return null;
		}
	

}

}
