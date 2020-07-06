package com.youdevo.webservice.service;

public class RestApi {

    private final long id;
    private final String content;
    private final String title;
    private final String category;

	public RestApi(long id, String content, String title, String category) {
		this.id = id;
        this.content = content;
        this.title = title;
        this.category = category;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

    public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}
}