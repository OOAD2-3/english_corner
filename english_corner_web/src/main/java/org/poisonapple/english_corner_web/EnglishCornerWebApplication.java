package org.poisonapple.english_corner_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.poisonapple"})
@SpringBootApplication
public class EnglishCornerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnglishCornerWebApplication.class, args);
    }

}
