package main.java.com.school.entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String aadharNumber;
    @Column(nullable = false)
    private String parentName;
    @Column(nullable = false)
    private String studentClass;
    @Column(nullable = false)
    private Double feesPaid;
    @Column(nullable = false)
    private Double totalFees;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public Student setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
        return this;
    }

    public String getParentName() {
        return parentName;
    }

    public Student setParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public Student setStudentClass(String studentClass) {
        this.studentClass = studentClass;
        return this;
    }

    public Double getFeesPaid() {
        return feesPaid;
    }

    public Student setFeesPaid(Double feesPaid) {
        this.feesPaid = feesPaid;
        return this;
    }

    public Double getTotalFees() {
        return totalFees;
    }

    public Student setTotalFees(Double totalFees) {
        this.totalFees = totalFees;
        return this;
    }
}

