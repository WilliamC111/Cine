package co.uptc.edu.cine.model;

import java.util.ArrayList;

public class Cinema {
	private Time timeMovie;
	private ArrayList<Room> rooms;
	private ArrayList<Movie> movies;
	private ArrayList<Customer> customers;
	private final int TWOD_PRICE = 9000;
	private final int THREED_PRICE = 12000;
	private final int IMAX_PRICE = 15000;
	private final int FOURK_PRICE = 15000;
	private final int ULTRATWOD_PRICE = 12000;


	public Cinema() {
		timeMovie= new Time();
		rooms = new ArrayList<Room>();
		movies = new ArrayList<Movie>();
		customers = new ArrayList<Customer>();
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		Movie movie3 = new Movie();

		movie1.setNameMovies("El gato con botas");
		movie1.setDescription("""
		El Gato con Botas descubre que su pasión por la aventura le ha pasado factura: Ha agotado ocho de sus nueve vidas.
		El Gato con Botas se embarca en un viaje épico para encontrar al mítico Último Deseo y recuperar sus nueve vidas.
		""");
		movie1.setTimeMovie("1h 42min");
		movie1.addMovieGenders(MovieGender.ADVENTURE);
		movie1.addMovieGenders(MovieGender.ANIMATION);
		movie1.addMovieGenders(MovieGender.COMEDY);
		movie1.addMovieFormat(MovieFormat.TWO_D);
		movie1.addMovieFormat(MovieFormat.THREE_D);
		movie1.setIcon("Cine/Cine/src/resources/Movies/El_Gato_Con_Botas.jpg");

		movie2.setNameMovies("Todo en todas partes al mismo tiempo");
		movie2.setDescription("""
			Una inmigrante china de mediana edad se ve envuelta en una loca aventura, donde ella sola puede
			salvar el mundo explorando otros universos que se conectan con sus vidas pasadas.
		""");
		movie2.setTimeMovie("2h 19min");
		movie2.addMovieGenders(MovieGender.COMEDY);
		movie2.addMovieGenders(MovieGender.ACTION);
		movie2.addMovieGenders(MovieGender.ADVENTURE);
		movie2.addMovieFormat(MovieFormat.TWO_D);
		movie2.addMovieFormat(MovieFormat.THREE_D);
		movie2.setIcon("Cine/Cine/src/resources/Movies/T_E_T_P.jpg");
		
		movies.add(movie1);
		movies.add(movie2);

		Room room1 = new Room();
		room1.setRoomNumber((short) 1);
		room1.addMovie(movie1);

		Room room2 = new Room();
		room2.setRoomNumber((short) 2);
		room2.addMovie(movie2);

		rooms.add(room1);
		rooms.add(room2);

		
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setTime(int hourMovie, int minuteMovie) {
		timeMovie.setTime(hourMovie, minuteMovie);
	}

	public Time getTimeMovie() {
		return timeMovie;
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

	public int buyTickets(int quantityTickets, int roomNumber, int movieNumber, MovieFormat movieFormat){
		int total = 0;
		Movie movie = getMovies().get(movieNumber - 1);
		Room room = rooms.get(roomNumber - 1);
		if (movie.getMovieFormat().contains(MovieFormat.TWO_D.getName()) && movieFormat == MovieFormat.TWO_D) {
			total += quantityTickets * TWOD_PRICE;
		}
		if (movie.getMovieFormat().contains(MovieFormat.THREE_D.getName()) && movieFormat == MovieFormat.THREE_D) {
			total += quantityTickets * THREED_PRICE;
		}
		if (movie.getMovieFormat().contains(MovieFormat.IMAX.getName()) && movieFormat == MovieFormat.IMAX) {
			total += quantityTickets * IMAX_PRICE;
		}
		if (movie.getMovieFormat().contains(MovieFormat.FOUR_K.getName()) && movieFormat == MovieFormat.FOUR_K) {
			total += quantityTickets * FOURK_PRICE;
		}
		if (movie.getMovieFormat().contains(MovieFormat.ULTRA_TWO_D.getName()) && movieFormat == MovieFormat.ULTRA_TWO_D) {
			total += quantityTickets * ULTRATWOD_PRICE;
		}
		return total;
	}

	@Override
	public String toString() {
		return "Cinema [timeMovie=" + timeMovie + ", rooms=" + rooms + ", movies=" + movies + ", customers=" + customers
				+ "]";
	}

	public static void main(String[] args) {
		Cinema cinema = new Cinema();

		Room room = new Room();
		room.setRoomNumber((short) 1);
		room.showSeats();
		room.reserveSeats('C', 5);
		room.showSeats();
		System.out.println(room);

		cinema.addRoom(room);
		cinema.addMovieForRoom(room.getRoomNumber(), 1);
		room.getMovies();
		System.out.println(room);
		cinema.showMovies();

		System.out.println(cinema.buyTickets(2, 1, 1, MovieFormat.THREE_D));
	}

	public void setRooms(Room room1) {
	}

	public ArrayList<MovieFormat> getFormats() {
		return null;
	}

	public String[] getMovieFormatsFromCinema() {
		return null;
	}

	public ArrayList<Integer> getAvailableTickets(int roomNumber, int movieNumber, MovieFormat movieFormat) {
		return null;
	}
}
