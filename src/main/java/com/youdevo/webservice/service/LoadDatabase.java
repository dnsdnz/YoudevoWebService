package com.youdevo.webservice.service;

import com.youdevo.webservice.model.News;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
  CommandLineRunner initDatabase(NewsRepository repository) {
    return args -> {
    
        System.out.println("Preloading " + repository.save(new News("New 1", "Content 1","Category 1")));
        System.out.println("Preloading " + repository.save(new News("New 2", "Content 2","Category 2")));
    };
  }
}