package com.youdevo.webservice.service;

import com.youdevo.webservice.model.News;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {

}