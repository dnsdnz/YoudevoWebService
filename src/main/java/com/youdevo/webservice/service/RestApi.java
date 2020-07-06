package com.youdevo.webservice.service;

public class RestApi {

    private final long id;
	private final String content;

	public RestApi(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
    
}