package com.keminapera.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    }
}
