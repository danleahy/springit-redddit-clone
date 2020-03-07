package com.example.springit;

import com.example.springit.config.SpringITProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringITProperties.class)
public class SpringitApplication {


    @Autowired
    private SpringITProperties springITProperties;


    public static void main(String[] args) {

        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Hello SpringIt");
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("Welcome message is: " + springITProperties.getWelcomeMsg());
        };
    }



}
