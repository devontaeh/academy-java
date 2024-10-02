package com.bptn.course.teachback;

public class Movie {
	// Define properties/attributes of the Movie class
	private String title;
	private String director;
	private String genre;
	private double rating;
    
    
    // Constructor to initialize the object
//	public Movie(String title, String director, String genre, double rating) {
//		this.title = title;
//		this.director= director;
//		this.genre = genre;
//		this.rating = rating;
//	}
	
	
	// Method to display movie details
	public void displayMovieInfo() {
		System.out.println("Title: " + title);
		System.out.println("Director: " + director);
		System.out.println("Genre: " + genre);
		System.out.println("Rating: " + rating);
	}
	
	public static void main(String[] args) {
		// initialize properties
		Movie joker = new Movie();
		joker.title = "joker";
		joker.director = "john";
		joker.genre = "crime/drama";
		joker.rating = 9.0;
		
		
		
		joker.displayMovieInfo();
		
		
		

	}

}
