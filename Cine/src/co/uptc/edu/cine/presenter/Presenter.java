package co.uptc.edu.cine.presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.uptc.edu.cine.model.*;
import co.uptc.edu.cine.view.*;

public class Presenter implements ActionListener {
	Cinema cinema = new Cinema();
	Customer customer = new Customer();
	View view = new View();
	DeleteWindow dWindow = new DeleteWindow(this);
	DataTableFrame dataFrame = new DataTableFrame(this);
	TicketSale ticketSale = new TicketSale(this, cinema, dataFrame);
	private MainMenu menu;

	public Presenter() {
		menu = new MainMenu(this);
	}

	public void initMenu() {
		menu.mainMenu();
	}

	public void addMenu() {
		menu.addMovieMenu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		// Admin inicio
		if (command.equals(menu.getLoginButton().getText())) {
			if (customer.isAdmin(menu.getUserText().getText(), menu.getPasswordText().getName())) {
				menu.getMainFrame().dispose();
				initMenu();
			} else {
				JOptionPane.showMessageDialog(menu.getMainFrame(), "Error, acceso no valido", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		// Agregar película
		if (command.equals("Add")) {
			menu.getMainFrame().dispose();
			addMenu();
		}
		// Mostrar cartelera
		if (command.equals("Show")) {
			menu.getMainFrame().dispose();
			menu.viewMovieLists();
		}
		// Venta Boletas
		if (command.equals("tickets")) {
			ticketSale.getTicketsFrame().setVisible(true);
			menu.getMainFrame().setVisible(false);
		}
		if (command.equals("Retrun menu2")) {
			ticketSale.getTicketsFrame().setVisible(false);
			menu.getMainFrame().setVisible(true);
		}
		// Creacion película
		if (command.equals("Create movie")) {
			menu.getAddMovieMenu().addMovieOption();
		}
		// Creacion pelicula - Agregar a sala
		if (command.equals("Add to room")) {
			menu.getAddMovieMenu().getAddMovieFrame().dispose();
			menu.getAddMovieMenu().addToRoomOption();
		}
		// Volver al menu
		if (command.equals("Retrun menu")) {
			menu.getAddMovieMenu().getAddMovieFrame().dispose();
			initMenu();
		}
		// Creacion pelicula - Crear película
		if (command.equals("Create")) {
			Movie movie = new Movie();
			movie.setNameMovies(menu.getAddMovieMenu().getNameMovie().getText());
			movie.setDescription(menu.getAddMovieMenu().getDescriptionMovie().getText());
			movie.setTimeMovie(menu.getAddMovieMenu().getFormattedTextField().getText());
			movie.setMovieGenders(menu.getAddMovieMenu().getMovieGenders());
			movie.setMovieFormat(menu.getAddMovieMenu().getMovieFormats());
			movie.setIcon(menu.getAddMovieMenu().getMainIconLabel().getText());
			cinema.setMovies(movie);
			System.out.println(cinema.getMovies());
			menu.getAddMovieMenu().getAddMovieFrame().dispose();
			addMenu();
		}

		// Creacion pelicula - Eliminar película
		if (command.equals("Delete")) {
			menu.chargeDataDeleteWindow(cinema.getMovies(), dWindow);
			dWindow.setVisible(true);
		}
		if (command.equals("Historial")) {
			dataFrame.setVisible(true);
			menu.getMainFrame().setVisible(false);
		}
		if (command.equals("Validate")) {
			dataFrame.setVisible(false);
			menu.getMainFrame().setVisible(true);
		}
		if (command.equals("Delete movie")) {
			menu.deleteMovie(cinema.getMovies(), dWindow);
			dWindow.setVisible(false);
			for (int i = 0; i < cinema.getMovies().size(); i++) {
				System.out.println(cinema.getMovies().get(i).toString());
			}
		}
		// Creacion pelicula - crear sala
		if (command.equals("Create room")) {
			menu.getAddMovieMenu().getAddToRoomMenu().createRoomOption();
		}
		// Creacion pelicula - crear sala - crear
		if (command.equals("Create this room")) {
			Room room = new Room();
			short roomNumber = Short
					.parseShort(menu.getAddMovieMenu().getAddToRoomMenu().getRoomNumberField().getText());
			boolean roomExists = false;
			for (int i = 0; i < cinema.getRooms().size(); i++) {
				if (cinema.getRooms().get(i).getRoomNumber() == roomNumber) {
					roomExists = true;
					break;
				}
			}
			if (roomExists) {
				JOptionPane.showMessageDialog(menu.getAddMovieMenu().getAddToRoomMenu().getRoomFrame(),
						"Error, ya existe una sala con ese número", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				room.setRoomNumber(roomNumber);
				cinema.addRoom(room);
				JOptionPane.showMessageDialog(menu.getAddMovieMenu().getAddToRoomMenu().getRoomFrame(),
						"Sala creada con exito", "EXITO", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		// Creacion pelicula - añadir pelicula a sala
		if (command.equals("Add movie to room")) {
			menu.getAddMovieMenu().getAddToRoomMenu().addMovieToRoomOption(cinema);
		}
		// Creacion pelicula - añadir pelicula a sala - añadir
		if (command.equals("Add movie in room")) {
			String selectedMovie = menu.getAddMovieMenu().getAddToRoomMenu().getMovieBox().getSelectedItem().toString();
			boolean movieExists = false;

			for (Room room : cinema.getRooms()) {
				for (Movie movie : room.getMovies()) {
					if (movie.getNameMovies().equals(selectedMovie)) {
						movieExists = true;
						break;
					}
				}
				if (movieExists) {
					break;
				}
			}
			if (movieExists) {
				JOptionPane.showMessageDialog(menu.getAddMovieMenu().getAddToRoomMenu().getRoomFrame(),
						"Error, la película ya está añadida en alguna sala", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				short roomNumber = Short.parseShort(
						menu.getAddMovieMenu().getAddToRoomMenu().getRoomNumberBox().getSelectedItem().toString());
				int movieIndex = menu.getAddMovieMenu().getAddToRoomMenu().getMovieBox().getSelectedIndex();
				cinema.addMovieForRoom(roomNumber, movieIndex + 1);
				JOptionPane.showMessageDialog(menu.getAddMovieMenu().getAddToRoomMenu().getRoomFrame(),
						"Película añadida con éxito", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
			}
			System.out.println(cinema.getRooms());
		}
		// Creacion pelicula - añadir pelicula a sala - volver
		if (command.equals("Back menu")) {
			menu.getAddMovieMenu().getAddToRoomMenu().getRoomFrame().dispose();
			addMenu();
		}
	}

	public static void main(String[] args) {
		new Presenter();
	}
}