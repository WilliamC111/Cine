package co.uptc.edu.cine.model;

import java.util.ArrayList;

public class Cinema {
	private Time timeMovie;
	private ArrayList<Room> rooms;
	private ArrayList<Movie> movies;
	private ArrayList<Customer> customers;

	public boolean checkSeat() {
		return false;
	}

	public void cancelTicket() {

	}

	public Time getTime() {
		return timeMovie;
	}

	public void setTime(Time timeMovie) {
		this.timeMovie = timeMovie;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Movie movie) {
		this.movies.add(movie);
	}

	public ArrayList<Customer> getCustomer() {
		return customers;
	}

	public void setCustomer(Customer customer) {
		this.customers.add(customer);
	}

}
