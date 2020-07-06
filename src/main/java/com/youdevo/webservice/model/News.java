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

  public News(String title, String content, String category) {
    this.title = title;
    this.content = content;
    this.category = category;
  }

  public void setId(Long id) {
    this.id = id;
}

  public String getTitle() {
    return this.title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getContent() {
    return this.content;
}

public void setContent(String content) {
    this.content = content;
}
public String getCategory() {
    return this.category;
}

public void setCategory(String category) {
    this.category = category;
}
}