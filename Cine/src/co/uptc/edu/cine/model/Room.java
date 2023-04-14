package co.uptc.edu.cine.model;

import java.util.ArrayList;

public class Room {
	private short roomNumber;
	private ArrayList<Movie> movies;

	public Room() {
		movies = new ArrayList<Movie>();
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
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

	@Override
	public String toString() {
		return "Sala " + getRoomNumber() + "\n\nCintas:\n\n" + getMovies() + "\n";
	}

	public static void main(String[] args) {
		Room room = new Room();
		room.setRoomNumber((short) 1);
		Movie movie1 = new Movie();
		movie1.setNameMovies("Titanic");
		movie1.setDescription("""
							Una aristócrata de diecisiete años se enamora de un amable pero pobre artista a bordo del lujoso y 
							desafortunado R.M.S. Titanic.
							""");
		movie1.setTimeMovie("3h 14min");
		movie1.setMovieGenders(MovieGender.DRAMA);
		movie1.setMovieGenders(MovieGender.ROMANCE);
		movie1.setMovieFormat(MovieFormat.THREE_D);
		movie1.setMovieFormat(MovieFormat.TWO_D);

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

		room.addMovie(movie1);
		room.addMovie(movie2);

		System.out.println(room);

		Room room2 = new Room();
		room2.setRoomNumber((short) 2);
		Movie movie3 = new Movie();
		movie3.setNameMovies("El rey león");
		movie3.setDescription("""
							Un joven león llamado Simba sueña con ser rey de la sabana. Pero su tío Scar, el actual rey, 
							le niega el trono y lo culpa de la muerte de su padre. Simba huye y conoce a un divertido 
							y simpático grupo de animales que le enseñarán a vivir la vida.
							""");
		movie3.setTimeMovie("1h 58min");
		movie3.setMovieGenders(MovieGender.ANIMATION);
		movie3.setMovieGenders(MovieGender.ADVENTURE);
		movie3.setMovieGenders(MovieGender.DRAMA);
		movie3.setMovieFormat(MovieFormat.TWO_D);
		movie3.setMovieFormat(MovieFormat.THREE_D);
		movie3.setMovieFormat(MovieFormat.IMAX);

		room2.addMovie(movie3);
		System.out.println(room2);
	}

}
