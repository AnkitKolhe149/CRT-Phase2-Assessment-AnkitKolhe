package com.question;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Q3_DTO {

    @NotBlank(message = "Name must not be blank")
    private String name;

    @Min(value = 18, message = "Age must be 18 or above")
    private int age;

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
