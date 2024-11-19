package main.java.com.school.entity;

import jakarta.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false, unique = true)
    private String aadharNumber;
    @Column(nullable = false)
    private String qualification;
    @Column(nullable = false)
    private String designation;
    @Column(nullable = false)
    private Double salary;
    @Column(nullable = false)
    private String department;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Teacher setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public Teacher setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
        return this;
    }

    public String getQualification() {
        return qualification;
    }

    public Teacher setQualification(String qualification) {
        this.qualification = qualification;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public Teacher setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public Teacher setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Teacher setDepartment(String department) {
        this.department = department;
        return this;
    }
}

