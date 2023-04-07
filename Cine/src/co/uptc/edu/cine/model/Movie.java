package co.uptc.edu.cine.model;

import javax.swing.ImageIcon;

public class Movie {
	private String nameMovies;
	private ImageIcon icon;
	private String timeMovie;

	public String getNameMovies() {
		return nameMovies;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public String getTimeMovie() {
		return timeMovie;
	}

	public void setNameMovies(String nameMovies) {
		this.nameMovies = nameMovies;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public void setTimeMovie(String timeMovie) {
		this.timeMovie = timeMovie;
	}

}
