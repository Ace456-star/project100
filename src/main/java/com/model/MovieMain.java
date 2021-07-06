package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("movie-service.xml");
		MovieService movieService = (MovieService)applicationContext.getBean("movieService");
		
		//creating data
		Movie movie = new Movie();
		movie.setName("movie1");
		movie.setDirector("Omega");
		movie.setDuration(123);
		movie.setRating(10);
		movie.setYear(2021);
		movieService.save(movie);
		
		System.out.println("Ahhha movie is saved");
		
		Movie movie2 = movieService.findById(12);
		System.out.println(movie2);
		
	}

}
