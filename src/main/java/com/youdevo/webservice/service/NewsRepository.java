package com.youdevo.webservice.service;

import com.youdevo.webservice.model.News;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<News, Long> {

}