package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>
 {
@Modifying
@Query("select a from Student a")
public List<Student> getAllStudents();



}
