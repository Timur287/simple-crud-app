package com.example.simplecrudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SimpleCrudAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleCrudAppApplication.class, args);
    }

}
