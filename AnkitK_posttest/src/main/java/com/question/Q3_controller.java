package com.question;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class Q3_controller {

    @PostMapping
    public ResponseEntity<String> createStudent(@Valid @RequestBody Q3_DTO student) {
        // Normally you would save to DB here
        return new ResponseEntity<>("Student created successfully", HttpStatus.CREATED);
    }
}
