package com.jenk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class JenkApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkApplication.class, args);
    }

}