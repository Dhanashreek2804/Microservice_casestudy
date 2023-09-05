package com.example.Course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Course.model.Courses;



public interface CourseRepository extends JpaRepository<Courses, Integer> {

}
