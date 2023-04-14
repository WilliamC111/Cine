package co.uptc.edu.cine.model;

import java.util.ArrayList;

public class Cinema {
	private Time timeMovie;
	private ArrayList<Room> rooms;
	private ArrayList<Movie> movies;
	private ArrayList<Customer> customers;
	public static final double TICKET_PRICE = 10000;

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

	public void showMovies() {
		for (int i = 0; i < movies.size(); i++) {
			System.out.println((i + 1) + ". " + movies.get(i).getNameMovies());
		}
	}

	public void addMovieForRoom(int roomNumber, int movieNumber){
		Movie movie = getMovies().get(movieNumber - 1);
		rooms.get(roomNumber - 1).addMovie(movie);
	}

	public static void main(String[] args) {
		Cinema cinema = new Cinema();

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

		Movie movie2 = new Movie();
		movie2.setNameMovies("Todo en todas partes al mismo tiempo");
		movie2.setDescription("""
				Una inmigrante china de mediana edad se ve envuelta en una loca aventura, donde ella sola puede
				salvar el mundo explorando otros universos que se conectan con sus vidas pasadas.
				""");
		movie2.setTimeMovie("2h 19min");
		movie2.setMovieGenders(MovieGender.COMEDY);
		movie2.setMovieGenders(MovieGender.ACTION);
		movie2.setMovieGenders(MovieGender.ADVENTURE);
		movie2.setMovieFormat(MovieFormat.TWO_D);
		movie2.setMovieFormat(MovieFormat.THREE_D);
		movie2.setMovieFormat(MovieFormat.IMAX);

		Room room = new Room();
		room.setRoomNumber((short) 1);
		room.showSeats();
		room.reserveSeats('C', 5);
		room.showSeats();

		cinema.addRoom(room);
		cinema.setMovies(movie);
		cinema.setMovies(movie2);
		cinema.addMovieForRoom(room.getRoomNumber(), 1);
		room.getMovies();
		System.out.println(room);
		cinema.showMovies();
	}
}
