package com.youdevo.webservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.youdevo.webservice.model.News;
import com.youdevo.webservice.service.*;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
  
  
	@GetMapping("/News")
	List<News> all() {
	  return repository.findAll();
	}
  
	@PostMapping("/News")
	News newNew(@RequestBody News newNew) {
	  return repository.save(newNew);
	}
  
	// Single item
  
	@GetMapping("/News/{id}")
	News one(@PathVariable Long id) {
  
	  return repository.findById(id)
		.orElseThrow(() -> new NewNotFoundException(id));
	}
  
	@PutMapping("/News/{id}")
	News replaceNew(@RequestBody News newNew, @PathVariable Long id) {
  
	  return repository.findById(id)
		.map(New -> {
		  New.setName(newNew.getName());
		  New.setRole(newNew.getRole());
		  return repository.save(New);
		})
		.orElseGet(() -> {
		  newNew.setId(id);
		  return repository.save(newNew);
		});
	}
  
	@DeleteMapping("/News/{id}")
	void deleteNew(@PathVariable Long id) {
	  repository.deleteById(id);
	}
    
}