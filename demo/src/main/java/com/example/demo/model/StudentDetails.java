package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class StudentDetails {

    @Id
    private int id; // This should match the Student ID
    private String address;
    private String phoneNumber;

    @OneToOne(mappedBy = "studentDetails")
    private Student student;

    public StudentDetails(int id, String address, String phoneNumber) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public StudentDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}