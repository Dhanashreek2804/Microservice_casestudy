package com.example.Course.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//JPA annotation

@Entity
public class Courses {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//for auto increment
	
	private int courseId;
	
	private String courseName;
	
	private String courseDuration;
	
	private double courseFees;
	
	
	public int getCourseId() {
		return courseId;
	}
	
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseDuration() {
		return courseDuration;
	}
	
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	
	
	// Default Constructor
	public Courses() {
		
	}
	
	

}
