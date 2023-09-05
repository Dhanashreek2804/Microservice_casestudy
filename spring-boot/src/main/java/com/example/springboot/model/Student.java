package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//JPA annotation

@Entity

@Table(name="")
public class Student {
	 @Id

	 @GeneratedValue(strategy=GenerationType.AUTO)//for auto increment

	 private int studId;

	 private String studentName;

	 @Column(name="stud_grade")

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
