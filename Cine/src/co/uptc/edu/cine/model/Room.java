package co.uptc.edu.cine.model;

import java.util.ArrayList;

public class Room {
	private short roomNumber;
	private ArrayList<Movie> movies;

	public void addMovie(Movie movie) {

	}

	public short getRoomNumber() {
		return roomNumber;
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setRoomNumber(short roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

}

