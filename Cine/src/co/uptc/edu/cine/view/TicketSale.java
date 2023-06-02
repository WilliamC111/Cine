package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import co.uptc.edu.cine.model.Cinema;
import co.uptc.edu.cine.model.Movie;
import co.uptc.edu.cine.model.MovieFormat;
import co.uptc.edu.cine.model.Room;

public class TicketSale {
    private JFrame ticketsFrame;
    private JPanel ticketsPanel;
    private JLabel titleLabel;
    private JButton chooseMovieButton;
    private JComboBox<String> movieComboBox;
    private JLabel chooseMovieLabel;
    private JComboBox<String> roomComboBox;
    private JLabel chooseFormatLabel;
    private JComboBox<String> formatComboBox;
    private JButton compareTicketsButton;
    private JButton totalButton;

    private Font mainFont;
    private Color mainColor;
    private ImageIcon mainIcon;

    private Cinema cinema;

    public TicketSale(ActionListener actionListener) {
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
        cinema = new Cinema();
        sellTickets();
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

        String[] movieOptions = getMovieNamesFromCinema();
        movieComboBox = new JComboBox<>(movieOptions);
        movieComboBox.setBounds(80, 150, 200, 30);
        ticketsPanel.add(movieComboBox);

        JLabel chooseRoomLabel = new JLabel("Elegir Sala");
        chooseRoomLabel.setBounds(80, 200, 200, 30);
        chooseRoomLabel.setForeground(Color.WHITE);
        ticketsPanel.add(chooseRoomLabel);

        String[] roomOptions = getRoomNumbersFromCinema();
        roomComboBox = new JComboBox<>(roomOptions);
        roomComboBox.setBounds(80, 250, 200, 30);
        ticketsPanel.add(roomComboBox);

        chooseFormatLabel = new JLabel("Elegir Formato");
        chooseFormatLabel.setBounds(80, 300, 200, 30);
        chooseFormatLabel.setForeground(Color.WHITE);
        ticketsPanel.add(chooseFormatLabel);

        String[] formatOptions = getMovieFormatsFromCinema();
        formatComboBox = new JComboBox<>(formatOptions);
        formatComboBox.setBounds(80, 350, 200, 30);
        ticketsPanel.add(formatComboBox);

        compareTicketsButton = new JButton("Comprar Boletas");
        compareTicketsButton.setBounds(500, 220, 200, 30);
        ticketsPanel.add(compareTicketsButton);

        totalButton = new JButton("Total");
        totalButton.setBounds(500, 250, 200, 70);
        ticketsPanel.add(totalButton);

        ticketsFrame.getContentPane().add(ticketsPanel);

        compareTicketsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int roomNumber = Integer.parseInt(roomComboBox.getSelectedItem().toString());
                int movieNumber = movieComboBox.getSelectedIndex() + 1;
                MovieFormat movieFormat = MovieFormat.valueOf(formatComboBox.getSelectedItem().toString());

                ArrayList<Integer> availableTickets = cinema.getAvailableTickets(roomNumber, movieNumber, movieFormat);

                StringBuilder message = new StringBuilder("Boletas Disponibles:\n");
                for (Integer ticket : availableTickets) {
                    message.append(ticket).append("\n");
                }

                JOptionPane.showMessageDialog(ticketsFrame, message.toString(), "Boletas Disponibles",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String quantityTicketsString = JOptionPane.showInputDialog(ticketsFrame,
                        "Ingrese la cantidad de boletas:");
                if (quantityTicketsString != null && !quantityTicketsString.isEmpty()) {
                    try {
                        int quantityTickets = Integer.parseInt(quantityTicketsString);
                        int roomNumber = Integer.parseInt(roomComboBox.getSelectedItem().toString());
                        int movieNumber = movieComboBox.getSelectedIndex() + 1;
                        MovieFormat movieFormat = MovieFormat.valueOf(formatComboBox.getSelectedItem().toString());

                        int total = cinema.buyTickets(quantityTickets, roomNumber, movieNumber, movieFormat);
                        JOptionPane.showMessageDialog(ticketsFrame, "El total es: " + total, "Total",
                                JOptionPane.INFORMATION_MESSAGE);
                        Ticket ticket = new Ticket();
                        ticket.generateTicket(quantityTicketsString, roomNumber, quantityTicketsString, movieNumber,
                                quantityTicketsString, quantityTicketsString, quantityTicketsString,
                                quantityTicketsString, total);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(ticketsFrame,
                                "Ingrese un valor válido para la cantidad de boletas", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    private String[] getMovieNamesFromCinema() {
        ArrayList<Movie> movies = cinema.getMovies();
        String[] movieNames = new String[movies.size()];
        for (int i = 0; i < movies.size(); i++) {
            movieNames[i] = movies.get(i).getNameMovies();
        }
        return movieNames;
    }

    private String[] getRoomNumbersFromCinema() {
        ArrayList<Room> rooms = cinema.getRooms();
        String[] roomNumbers = new String[rooms.size()];
        for (int i = 0; i < rooms.size(); i++) {
            roomNumbers[i] = String.valueOf(rooms.get(i).getRoomNumber());
        }
        return roomNumbers;
    }

    private String[] getMovieFormatsFromCinema() {
        MovieFormat[] formats = MovieFormat.values();
        String[] formatNames = new String[formats.length];
        for (int i = 0; i < formats.length; i++) {
            formatNames[i] = formats[i].toString();
        }
        return formatNames;
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
}