package com.example.ms1.service;

import com.example.ms1.model.Movie;

public interface MovieServiceInterface {
	void createMovie(Movie m);
	Movie getMovie(long id);
	void deleteMovie(long id);
	Movie editMovie(Movie m, long id);
}
