package com.question;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Q5_Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department")
    private List<Q5_Employee> employees;

    // Getters and Setters
}