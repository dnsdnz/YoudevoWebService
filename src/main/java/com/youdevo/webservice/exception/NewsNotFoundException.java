package com.youdevo.webservice.exception;

public class NewsNotFoundException extends RuntimeException {

    /**
   *
   */
  private static final long serialVersionUID = 1L;

  public NewsNotFoundException(Long id) {
      super("Could not find any new " + id);
    }
  }