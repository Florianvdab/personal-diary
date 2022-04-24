package com.florianvdab.diary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@Configuration
@EnableJpaAuditing
public class DiaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiaryApplication.class, args);
    }
}