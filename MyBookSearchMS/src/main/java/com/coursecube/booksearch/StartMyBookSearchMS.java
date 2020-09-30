package com.coursecube.booksearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StartMyBookSearchMS implements CommandLineRunner {
    static final Logger log = LoggerFactory.getLogger(StartMyBookSearchMS.class);

    public static void main(String[] args) {
        SpringApplication.run(StartMyBookSearchMS.class, args);
    }

    @Override
    public void run(String... args) {
        //Start-UP Tasks
        log.info(" MyBookPrice - Launched.... ");
    }

}
