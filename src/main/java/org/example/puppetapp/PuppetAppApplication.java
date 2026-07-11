package org.example.puppetapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PuppetAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PuppetAppApplication.class, args);
    }


    @Bean
    public CommandLineRunner clr(String[] args){

    return runner -> {

        System.out.println("Hello");
        };
    }
}
