package org.example.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@Configuration
public class SpringbootAppApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootAppApplication.class, args);
    }

}
