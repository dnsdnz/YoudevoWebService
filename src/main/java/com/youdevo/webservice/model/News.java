package com.youdevo.webservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class News {

    private @Id @GeneratedValue Long id;

  private String title;
  private String content;
  private String category;

  News() {}

  News(String title, String content, String category) {
    this.title = title;
    this.content = content;
    this.category = category;
  }
}