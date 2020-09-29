package com.coursecube.springboot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class StartMyBootApp {
    public static void main(String[] args) {
        SpringApplication.run(StartMyBootApp.class, args);
    }
}
