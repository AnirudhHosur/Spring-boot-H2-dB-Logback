package com.example.ms1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ms1.model.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

}
