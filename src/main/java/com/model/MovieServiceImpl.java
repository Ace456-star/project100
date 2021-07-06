package com.model;

public class MovieServiceImpl implements MovieService {
	

	@Override
	public void save(Movie movie) {
		System.out.println("saving movie into database");
		System.out.println("saving movie into database");

	}
	
	@Override
	public Movie findById(int mid) {
		Movie movie = new Movie();
		movie.setMid(mid);
		movie.setDirector("Albert");
		movie.setDuration(123);
		movie.setName("Hero!!");
		movie.setRating(12);
		movie.setYear(2021);
		return movie;

	}
	
	

}
