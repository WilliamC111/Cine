package co.uptc.edu.cine.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Tickets {
	private Cinema infoCinema;

	public Cinema getInfoCinema() {
		return infoCinema;
	}

	public void setInfoCinema(Cinema infoCinema) {
		this.infoCinema = infoCinema;
	}

	public void writeNewTxT(String path) throws IOException, FileNotFoundException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.write(infoCinema.toString());
		bufferedWriter.close();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Tickets tickets = new Tickets();
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
		cinema.setTime(11, 30);
		System.out.println("La pelicula inicia " + cinema.getTime());

		tickets.setInfoCinema(cinema);
		tickets.writeNewTxT("Cine/Cine/src/resources/tickets.txt");
	}
}
