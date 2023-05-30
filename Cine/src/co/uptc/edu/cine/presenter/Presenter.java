package co.uptc.edu.cine.presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.uptc.edu.cine.model.*;
import co.uptc.edu.cine.view.*;

public class Presenter implements ActionListener{
	Cinema cinema = new Cinema();
	Customer customer = new Customer();
	View view = new View();
	private MainMenu menu;


	public Presenter() {
		menu = new MainMenu(this);
		//init();
	}

	public void init() {
		String menu = "       .....BIENVENIDOS A CINE.....      " + "\n1 - Registar Cliente\n2 - Mostrar Cartelera"
				+ "\n3 - Ver usuarios\n4 - Salir";
		try {
			int option = view.readGraphicInt(menu + "\nSeleccione una opción:");
			switch (option) {
			case 1:
				createCustomer();
				break;
			case 2:
				;
				break;
			case 3:
                ShowCustomers();
				break;
			
			case 4:
				view.showGraphicMessage("----Adios----");
				System.exit(0);
				break;
			default:
				view.showErrorMessage("OPCION NO VALIDA");
				init();
				break;
			}
		} catch (Exception e) {
			view.showErrorMessage("OPCION NO VALIDA");
			init();
		}

	}

	public void initMenu(){
		menu.mainMenu();
	}

	public void addMenu(){
		menu.addMovieMenu();
	}

	public void createCustomer() {
		String menu1 = "       ...Registrar cliente...      "
				+ "\n1 - Ingrese Nombre\n2 - Ingrese identificacion del Cliente\n3 - Salir";

		view.showGraphicMessage(menu1);
		Customer customer = new Customer();
		customer.setName(view.readGraphicString("Ingrese nombre del cliente:"));
		customer.setID(view.readGraphicInt("Ingrese identificacion del cliente:"));
		view.showGraphicMessage("CLIENTE CREADO");
		init();
	}

	public void ShowBillboard() {
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

	public void ShowCustomers() {
		Customer customer = new Customer();
		customer.setName("Juan Ramirez");
		customer.setID(123456789);
		System.out.println(customer);
	}


	public static void main(String[] args) {
		new Presenter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals(menu.getLoginButton().getText())){
			if(customer.isAdmin(menu.getUserText().getText(), menu.getPasswordText().getName())){
				menu.getMainFrame().dispose();
				initMenu();
			}else{
				JOptionPane.showMessageDialog(menu.getMainFrame(), "Error, acceso no valido", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
			}
		}
		if(command.equals(menu.getAddButton().getText())){
			menu.getMainFrame().dispose();
			addMenu();
		}
		if(command.equals(menu.getAddMovieMenu().getAddMovieButton().getText())){
			Movie movie = new Movie();
			menu.getAddMovieMenu().addMovieOption();
			movie.setNameMovies(menu.getAddMovieMenu().getNameMovie().getText());
			movie.setDescription(menu.getAddMovieMenu().getDescriptionMovie().getText());
			movie.setTimeMovie(menu.getAddMovieMenu().getFormattedTextField().getText());
			cinema.setMovies(movie);
			
			
		}
	}
}

