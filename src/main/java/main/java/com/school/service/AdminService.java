package main.java.com.school.service;

import main.java.com.school.repository.AdminRepository;
import main.java.com.school.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repository;

    public List<Admin> getAllAdmins() {
        return repository.findAll();
    }

    public Admin getAdminByUsername(String username) {
        return repository.findByUsername(username);
    }

    public Admin addAdmin(Admin admin) {
        return repository.save(admin);
    }
}