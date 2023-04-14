package co.uptc.edu.cine.model;

import java.util.ArrayList;

public class Cinema {
	private Time timeMovie;
	private ArrayList<Room> rooms;
	private ArrayList<Movie> movies;
	private ArrayList<Customer> customers;

	public Cinema() {
		rooms = new ArrayList<Room>();
		movies = new ArrayList<Movie>();
		customers = new ArrayList<Customer>();
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setTime(int hourMovie, int minuteMovie) {
		timeMovie = new Time();
		timeMovie.setTime(hourMovie, minuteMovie);
	}

	public String getTime() {
		return timeMovie.getFilmTime();
	}

	public void setMovies(Movie movie) {
		this.movies.add(movie);
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setCustomer(Customer customer) {
		this.customers.add(customer);
	}

	public ArrayList<Customer> getCustomer() {
		return customers;
	}
}
