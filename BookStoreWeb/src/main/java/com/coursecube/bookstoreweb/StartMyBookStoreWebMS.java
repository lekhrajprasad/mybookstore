package com.coursecube.bookstoreweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartMyBookStoreWebMS implements CommandLineRunner {
    static final Logger log = LoggerFactory.getLogger(StartMyBookStoreWebMS.class);

    public static void main(String[] args) {
        SpringApplication.run(StartMyBookStoreWebMS.class, args);
    }

    @Override
    public void run(String... args) {
        //Start-UP Tasks
        log.info(" MyBookStoreWeb - Launched.... ");
    }

}
