package com.question;

import jakarta.persistence.*;

@Entity
public class Q5_Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Q5_Department department;

    // Getters and Setters
}