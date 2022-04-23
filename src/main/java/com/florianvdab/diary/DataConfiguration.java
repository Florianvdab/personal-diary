package com.florianvdab.diary;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.florianvdab.diary.repositories")
@EntityScan(basePackages = "com.florianvdab.diary.entities")
public class DataConfiguration {
}