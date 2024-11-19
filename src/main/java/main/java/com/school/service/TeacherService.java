package main.java.com.school.service;

import main.java.com.school.repository.TeacherRepository;
import main.java.com.school.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository repository;

    @Cacheable("students")
    public List<Teacher> getAllTeachers() {
        return repository.findAll();
    }
}

