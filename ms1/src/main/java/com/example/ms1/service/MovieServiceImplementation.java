package com.example.ms1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms1.model.Movie;
import com.example.ms1.repository.MovieRepository;

@Service
public class MovieServiceImplementation implements MovieServiceInterface {
	
	@Autowired
	MovieRepository movieRepository;
	
	@Override
	public void createMovie(Movie m) {
		Movie m1 = Movie.builder().movieName(m.getMovieName()).actors(m.getActors())
				.genres(m.getGenres()).build();
		movieRepository.save(m1);
	}

	@Override
	public Movie getMovie(long id) {
		return movieRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteMovie(long id) {
		movieRepository.deleteById(id);
	}

	@Override
	public Movie editMovie(Movie m, long id) {
		Movie new_m = movieRepository.findById(id).orElse(null);
		if(id==m.getMovieId()) {
			new_m = Movie.builder().movieName(m.getMovieName()).genres(m.getGenres())
					.actors(m.getActors()).build();
			movieRepository.save(new_m);
		}
		return new_m;
	}

}
