package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.springboot.model.Student;

// integer is the primary key ID
// all the CRAD(create, read,update,delete) related methods are imported by jpa repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
