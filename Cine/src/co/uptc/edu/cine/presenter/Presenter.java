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
		if (command.equals(menu.getAddButton().getText())) {
			menu.getMainFrame().dispose();
			addMenu();
		}
		// Mostrar cartelera
		if (command.equals(menu.getBillBoardButton().getText())) {
			menu.getMainFrame().dispose();
			menu.viewMovieLists();
		}
		// Creacion película
		if (command.equals(menu.getAddMovieMenu().getAddMovieButton().getText())) {
			menu.getAddMovieMenu().addMovieOption();
		}
		// Volver al menu
		if (command.equals(menu.getAddMovieMenu().getBackButton().getText())) {
			menu.getAddMovieMenu().getAddMovieFrame().dispose();
			initMenu();
		}
		// Creacion pelicula - Crear película
		if (command.equals(menu.getAddMovieMenu().getCreateButton().getText())) {
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
	}

	public static void main(String[] args) {
		new Presenter();
	}
}
