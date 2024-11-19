package main.java.com.school.entity;

import jakarta.persistence.*;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String role; // Example: "SuperAdmin", "Manager"

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Admin setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Admin setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Admin setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getRole() {
        return role;
    }

    public Admin setRole(String role) {
        this.role = role;
        return this;
    }
}
