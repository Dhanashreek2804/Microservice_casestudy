package com.example.Course.model;

//JPA annotation

public class Student {
	

	 private int studId;

	 private String studentName;

	 private String grade;

	 private int age;

	 public int getStudid() {

	 return studId;

	 }

	 public void setStudid(int studId) {

	 this.studId = studId;

	 }

	 public String getStudentName() {

	 return studentName;

	 }

	 public void setStudentName(String studentName) {

	 this.studentName = studentName;

	 }

	 public String getGrade() {

	 return grade;

	 }

	 public void setGrade(String grade) {

	 this.grade = grade;

	 }

	 public int getAge() {

	 return age;

	 }

	 public void setAge(int age) {

	 this.age = age;

	 }

	 //default constructor

	 public Student() {

	 }

}
