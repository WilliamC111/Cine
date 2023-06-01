package co.uptc.edu.cine.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import co.uptc.edu.cine.model.Cinema;
import co.uptc.edu.cine.model.Movie;
import co.uptc.edu.cine.model.Room;

public class TicketSale {
    private ActionListener actionListener;

    private JFrame ticketsFrame;
    private JPanel ticketsPanel;
    private JLabel titleLabel;
    private JButton chooseMovieButton;
    private JComboBox<String> movieComboBox;
    private JLabel chooseMovieLabel;
    private JComboBox<String> roomComboBox; // Nuevo JComboBox para elegir la sala

    private Font mainFont;
    private Color mainColor;
    private ImageIcon mainIcon;

    public TicketSale(ActionListener actionListener) {
        this.actionListener = actionListener;

        mainFont = new Font("Arial", Font.BOLD, 50);
        mainColor = new Color(0, 0, 128);
        mainIcon = new ImageIcon("Cine/Cine/src/resources/Icons/Logo.png");

        ticketsFrame = new JFrame();
        ticketsFrame.setTitle("Vender Entradas");
        ticketsFrame.setSize(800, 600);
        ticketsFrame.setLocationRelativeTo(null);
        ticketsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticketsFrame.setResizable(false);
        ticketsFrame.setIconImage(mainIcon.getImage());

        sellTickets();

        ticketsFrame.setVisible(true);
    }

    public void sellTickets() {
        ticketsPanel = new JPanel();
        ticketsPanel.setLayout(null);
        ticketsPanel.setBackground(mainColor);

        titleLabel = new JLabel("Vender Entradas");
        titleLabel.setFont(mainFont);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(200, 50, 400, 50);
        ticketsPanel.add(titleLabel);

        chooseMovieLabel = new JLabel("Elegir Película");
        chooseMovieLabel.setBounds(80, 100, 200, 30);
        chooseMovieLabel.setForeground(Color.WHITE);
        ticketsPanel.add(chooseMovieLabel);

        String[] movieOptions = getMovieNamesFromCinema(); // Obtener nombres de películas del objeto Cinema
        movieComboBox = new JComboBox<>(movieOptions);
        movieComboBox.setBounds(80, 150, 200, 30);
        ticketsPanel.add(movieComboBox);

       

        JLabel chooseRoomLabel = new JLabel("Elegir Sala");
        chooseRoomLabel.setBounds(80, 200, 200, 30);
        chooseRoomLabel.setForeground(Color.WHITE);
        ticketsPanel.add(chooseRoomLabel);

        String[] roomOptions = getRoomNumbersFromCinema(); // Obtener números de salas del objeto Cinema
        roomComboBox = new JComboBox<>(roomOptions);
        roomComboBox.setBounds(80, 250, 200, 30);
        ticketsPanel.add(roomComboBox);

        ticketsFrame.add(ticketsPanel);
    }

    private String[] getMovieNamesFromCinema() {
        Cinema cinema = new Cinema();

        // Agregar películas al objeto Cinema
        Movie movie1 = new Movie();
        cinema.setMovies(movie1);
        Movie movie2 = new Movie();
        cinema.setMovies(movie2);

        ArrayList<Movie> movies = cinema.getMovies();
        String[] movieNames = new String[movies.size()];
        for (int i = 0; i < movies.size(); i++) {
            movieNames[i] = movies.get(i).getNameMovies();
        }

        return movieNames;
    }

    private String[] getRoomNumbersFromCinema() {
        Cinema cinema = new Cinema();

        // Agregar salas al objeto Cinema
        // ...

        ArrayList<Room> rooms = cinema.getRooms();
        String[] roomNumbers = new String[rooms.size()];
        for (int i = 0; i < rooms.size(); i++) {
            roomNumbers[i] = Integer.toString(rooms.get(i).getRoomNumber());
        }

        return roomNumbers;
    }

    public JFrame getTicketsFrame() {
        return ticketsFrame;
    }

    public JPanel getTicketsPanel() {
        return ticketsPanel;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public static void main(String[] args) {
        new TicketSale(null);
    }
}