package dev.vivek.springbootredisapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableCaching not important but good to have
@SpringBootApplication
public class SpringBootRedisAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisAppApplication.class, args);
    }

}
