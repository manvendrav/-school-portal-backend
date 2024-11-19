package main.java.com.school.service;

import main.java.com.school.repository.StudentRepository;
import main.java.com.school.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    @Cacheable("students")
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}

