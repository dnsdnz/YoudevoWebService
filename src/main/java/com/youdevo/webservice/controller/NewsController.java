package com.youdevo.webservice.controller;



import com.youdevo.webservice.exception.NewsNotFoundException;
import com.youdevo.webservice.model.News;
import com.youdevo.webservice.service.*;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class NewsController {

	private final NewsRepository repository;

	NewsController(NewsRepository repository) {
	  this.repository = repository;
	}
  
  
	@GetMapping("/news")
	List<News> all() {
	  return repository.findAll();
	}
  
	@PostMapping("/news")
	News newNew(@RequestBody News newNew) {
	  return repository.save(newNew);
	}
  
  
	@GetMapping("/news/{id}")
	News one(@PathVariable Long id) {
  
	  return repository.findById(id)
		.orElseThrow(() -> new NewsNotFoundException(id));
	}
  
	@PutMapping("/news/{id}")
	News replaceData(@RequestBody News newData, @PathVariable Long id) {
  
	  return repository.findById(id)
		.map(data -> {
		  data.setTitle(newData.getTitle());
		  data.setContent(newData.getContent());
		  data.setCategory(newData.getCategory());
		  return repository.save(data);
		})
		.orElseGet(() -> {
		  newData.setId(id);
		  return repository.save(newData);
		});
	}
  
	@DeleteMapping("/news/{id}")
	void deleteNew(@PathVariable Long id) {
	  repository.deleteById(id);
	}
    
}