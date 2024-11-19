package main.java.com.school.controller;

import main.java.com.school.entity.Admin;
import main.java.com.school.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService service;

    @GetMapping
    public List<Admin> getAllAdmins() {
        return service.getAllAdmins();
    }

    @GetMapping("/{username}")
    public Admin getAdminByUsername(@PathVariable String username) {
        return service.getAdminByUsername(username);
    }

    @PostMapping
    public Admin addAdmin(@RequestBody Admin admin) {
        return service.addAdmin(admin);
    }
}
