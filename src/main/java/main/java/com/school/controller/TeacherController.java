package main.java.com.school.controller;

import main.java.com.school.entity.Teacher;
import main.java.com.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private TeacherService service;

    @GetMapping
    public List<Teacher> getAll() {
        return service.getAllTeachers();
    }
}

