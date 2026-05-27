package com.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class Q12_ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(Q12_ApplicationMain.class, args);
    }
}
