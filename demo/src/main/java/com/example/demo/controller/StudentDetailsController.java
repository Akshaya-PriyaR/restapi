package com.example.demo.controller;

import com.example.demo.model.StudentDetails;
import com.example.demo.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-details")
public class StudentDetailsController {

    @Autowired
    private StudentDetailsService studentDetailsService;

    @GetMapping
    public List<StudentDetails> getAllStudentDetails() {
        return studentDetailsService.getAllStudentDetails();
    }

    @GetMapping("/{id}")
    public StudentDetails getStudentDetailsById(@PathVariable int id) {
        return studentDetailsService.getStudentDetailsById(id);
    }

    @PostMapping
    public StudentDetails createStudentDetails(@RequestBody StudentDetails studentDetails) {
        return studentDetailsService.saveStudentDetails(studentDetails);
    }

    @PutMapping("/{id}")
    public StudentDetails updateStudentDetails(@PathVariable int id, @RequestBody StudentDetails studentDetails) {
        return studentDetailsService.updateStudentDetails(id, studentDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentDetails(@PathVariable int id) {
        studentDetailsService.deleteStudentDetails(id);
    }
}