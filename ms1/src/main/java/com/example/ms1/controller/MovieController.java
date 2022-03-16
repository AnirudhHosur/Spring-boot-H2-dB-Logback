package com.example.ms1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms1.model.Movie;
import com.example.ms1.service.MovieServiceInterface;

@RestController
@RequestMapping(path = "/api")
public class MovieController {
	
	private final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
	MovieServiceInterface movieServiceInterface;
	
	@RequestMapping(value = "/addMovie", method = RequestMethod.POST)
	public void add(@RequestBody Movie m) {
		logger.debug("Impl");
		logger.info("Check this out");
		logger.info("Hi");
		movieServiceInterface.createMovie(m);
	}
	
	@RequestMapping(value = "/getMovie/{id}", method = RequestMethod.GET)
	public Movie getById(@RequestParam("id") long id) {
		logger.trace("Getting movie");
		return movieServiceInterface.getMovie(id);
	}
	
}
