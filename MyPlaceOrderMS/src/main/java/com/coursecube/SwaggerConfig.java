package com.coursecube;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@SpringBootApplication
public class SwaggerConfig {

   /* @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.any())
                .build();
    }*/

    @Bean
    public Docket apiDocket() {

        Contact contact = new Contact("Lekhraj Prasad", "https://java-deep-dive.blogspot.com/","lekh565@gmail.com");

        List<VendorExtension> vendorExtensions = new ArrayList<>();

        ApiInfo apiInfo = new ApiInfo(
                "JLC Book Store API",
                "Book Search API - part of JLC BOOk Store Application",
                "1.0",
                "https://java-deep-dive.blogspot.com/ ",
                contact,
                "API Under Free Licence",
                "https://java-deep-dive.blogspot.com/",
                vendorExtensions);

        Docket docket =  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .paths(PathSelectors.any())
                .apis(Predicate.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                .build();
        return docket;

    }

}
