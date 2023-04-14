package co.uptc.edu.cine.model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Movie {
	private String nameMovie;
	private ImageIcon icon;
	private String timeMovie;
	private ArrayList<String> movieGenders;
	private ArrayList<String> movieFormat;
	private String description;

	public Movie() {
		movieGenders = new ArrayList<String>();
		movieFormat = new ArrayList<String>();
	}

	public String getNameMovies() {
		return nameMovie;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public String getTimeMovie() {
		return timeMovie;
	}

	public String getDescription() {
		return description;
	}

	public void setNameMovies(String nameMovie) {
		this.nameMovie = nameMovie;
	}

	public void setIcon(String icon) {
		this.icon = new ImageIcon(icon);
	}

	public void setTimeMovie(String timeMovie) {
		this.timeMovie = timeMovie;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getMovieGenders() {
		return movieGenders;
	}

	public void setMovieGenders(MovieGender movieGender) {
		this.movieGenders.add(movieGender.getName());
	}

	public ArrayList<String> getMovieFormat() {
		return movieFormat;
	}

	public void setMovieFormat(MovieFormat movieFormat) {
		this.movieFormat.add(movieFormat.getName());
	}

	@Override
	public String toString() {
		return "Pelicula: " + getNameMovies() + "\ndescripcion:\n" + getDescription() + "\nDuracion: " + getTimeMovie()
				+ "\nGeneros: "
				+ getMovieGenders() + "\nFormatos: " + getMovieFormat() + "\n" + getIcon() + "\n";
	}

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setNameMovies("El gato con botas");
		movie.setDescription(
				"""
						El Gato con Botas descubre que su pasión por la aventura le ha pasado factura: Ha agotado ocho de sus nueve vidas.
						El Gato con Botas se embarca en un viaje épico para encontrar al mítico Último Deseo y recuperar sus nueve vidas.
						""");
		movie.setTimeMovie("1h 42min");
		movie.setMovieGenders(MovieGender.ADVENTURE);
		movie.setMovieGenders(MovieGender.ANIMATION);
		movie.setMovieGenders(MovieGender.COMEDY);
		movie.setMovieFormat(MovieFormat.TWO_D);

		movie.setIcon("Cine/src/resources/El_Gato_Con_Botas.jpg");

		System.out.println(movie);
	}
}
