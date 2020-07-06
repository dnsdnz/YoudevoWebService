package com.youdevo.webservice.service;

import java.io.Console;

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
    
        System.out.println("Preloading " + repository.save(new News("Bilbo Baggins", "burglar","")));
        System.out.println("Preloading " + repository.save(new News("Frodo Baggins", "thief","")));
    };
  }
}