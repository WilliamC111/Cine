package co.uptc.edu.cine.model;

import java.util.ArrayList;

public class Cinema {
public String cinema;
	private int hour;
	private ArrayList<Room> rooms;
	private ArrayList<Movie> movies;
	private Customer customer;
	
	public String isTimeToMovie() {
		return cinema;
	}
	public boolean checkSeat () {
		return false;
		
	}
	public void cancelTicket() {
		
	}
	public String getCinema() {
		return cinema;
	}
	public int getHour() {
		return hour;
	}
	public void setCinema(String cinema) {
		this.cinema = cinema;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
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
	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


}
