package com.example.ms1.model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "movies")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long movieId;
	private String movieName;
	@Column
    @ElementCollection(targetClass=String.class)
	private List<String> genres;
	@Column
    @ElementCollection(targetClass=String.class)
	private List<String> actors;
}
