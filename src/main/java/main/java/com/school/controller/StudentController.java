package main.java.com.school.controller;

import main.java.com.school.entity.Student;
import main.java.com.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }
}

