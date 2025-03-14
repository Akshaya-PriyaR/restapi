package com.example.demo.service;

import com.example.demo.model.StudentDetails;
import com.example.demo.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailsService {

    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    public List<StudentDetails> getAllStudentDetails() {
        return studentDetailsRepository.findAll();
    }

    public StudentDetails getStudentDetailsById(int id) {
        return studentDetailsRepository.findById(id).orElse(null);
    }

    public StudentDetails saveStudentDetails(StudentDetails studentDetails) {
        return studentDetailsRepository.save(studentDetails);
    }

    public StudentDetails updateStudentDetails(int id, StudentDetails studentDetails) {
        if (studentDetailsRepository.existsById(id)) {
            studentDetails.setId(id);
            return studentDetailsRepository.save(studentDetails);
        }
        return null;
    }

    public void deleteStudentDetails(int id) {
        studentDetailsRepository.deleteById(id);
    }
}