package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

import co.uptc.edu.cine.model.Cinema;

public class AddToRoomMenu {
    private ActionListener actionListener;

    private JFrame roomFrame;
    private JPanel roomPanel;
    private JLabel titleLabel, selectRoomNumber, selectMovie;
    private JButton createRoomButton, addMovieToRoomButton, backButton, createButton, createMovieinRoomButton;
    private JTextField roomNumberField;
    private JComboBox<Short> roomNumberBox;
    private JComboBox<String> movieBox;

    private Font mainFont;
    private Color mainColor;
    private ImageIcon mainIcon;

    public AddToRoomMenu(ActionListener actionListener) {
        this.actionListener = actionListener;
        mainFont = new Font("Arial", Font.BOLD, 50);
        mainColor = new Color(0, 0, 128);
        mainIcon = new ImageIcon("Cine/Cine/src/resources/Icons/Logo.png");

        roomFrame = new JFrame();
        roomFrame.setTitle("Agregar a Sala");
        roomFrame.setSize(800, 600);
        roomFrame.setLocationRelativeTo(null);
        roomFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        roomFrame.setResizable(false);
        roomFrame.setIconImage(mainIcon.getImage());

        createRoom();
        roomFrame.setVisible(true);

    }

    public void createRoom() {
        roomPanel = new JPanel();
        roomPanel.setLayout(null);
        roomPanel.setBackground(mainColor);

        titleLabel = new JLabel("Menu de Salas");
        titleLabel.setFont(mainFont);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(240, 50, 400, 60);
        roomPanel.add(titleLabel);

        createRoomButton = new JButton("Crear sala");
        createRoomButton.setBounds(300, 200, 200, 50);
        createRoomButton.setFont(new Font("Arial", Font.BOLD, 30));
        createRoomButton.setForeground(mainColor);
        createRoomButton.setFocusPainted(false);
        createRoomButton.setActionCommand("Create room");
        createRoomButton.addActionListener(actionListener);
        roomPanel.add(createRoomButton);

        addMovieToRoomButton = new JButton("Añadir película");
        addMovieToRoomButton.setBounds(280, 300, 260, 50);
        addMovieToRoomButton.setFont(new Font("Arial", Font.BOLD, 30));
        addMovieToRoomButton.setForeground(mainColor);
        addMovieToRoomButton.setFocusPainted(false);
        addMovieToRoomButton.setActionCommand("Add movie to room");
        addMovieToRoomButton.addActionListener(actionListener);
        roomPanel.add(addMovieToRoomButton);

        backButton = new JButton("Volver");
        backButton.setBounds(300, 400, 200, 50);
        backButton.setFont(new Font("Arial", Font.BOLD, 30));
        backButton.setForeground(mainColor);
        backButton.setFocusPainted(false);
        backButton.setActionCommand("Back menu");
        backButton.addActionListener(actionListener);
        roomPanel.add(backButton);

        roomFrame.add(roomPanel);
    }

    public void createRoomOption() {
        roomFrame = new JFrame();
        roomFrame.setTitle("Crear Sala");
        roomFrame.setSize(600, 300);
        roomFrame.setLocationRelativeTo(null);

        roomPanel = new JPanel();
        roomPanel.setLayout(null);
        roomPanel.setBackground(mainColor);

        titleLabel = new JLabel("Crear Sala");
        titleLabel.setFont(mainFont);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(150, 50, 400, 60);
        roomPanel.add(titleLabel);

        selectRoomNumber = new JLabel("Elija numero de sala:");
        selectRoomNumber.setFont(new Font("Arial", Font.BOLD, 20));
        selectRoomNumber.setForeground(Color.WHITE);
        selectRoomNumber.setBounds(50, 150, 200, 30);
        roomPanel.add(selectRoomNumber);

        roomNumberField = new JTextField();
        roomNumberField.setBounds(260, 150, 60, 30);
        roomNumberField.setFont(new Font("Arial", Font.BOLD, 20));
        roomNumberField.setForeground(mainColor);
        roomPanel.add(roomNumberField);

        createButton = new JButton("Crear");
        createButton.setBounds(350, 150, 100, 30);
        createButton.setFont(new Font("Arial", Font.BOLD, 20));
        createButton.setForeground(mainColor);
        createButton.setFocusPainted(false);
        createButton.setActionCommand("Create this room");
        createButton.addActionListener(actionListener);
        roomPanel.add(createButton);

        roomFrame.setContentPane(roomPanel);
        roomFrame.setVisible(true);
    }

    public void addMovieToRoomOption(Cinema cinema) {
        roomFrame = new JFrame();
        roomFrame.setTitle("Añadir Película a Sala");
        roomFrame.setSize(600, 400);

        roomPanel = new JPanel();
        roomPanel.setLayout(null);
        roomPanel.setBackground(mainColor);

        titleLabel = new JLabel("Añadir Película a sala");
        titleLabel.setFont(mainFont);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(70, 50, 500, 60);
        roomPanel.add(titleLabel);

        selectRoomNumber = new JLabel("Elija numero de sala:");
        selectRoomNumber.setFont(new Font("Arial", Font.BOLD, 20));
        selectRoomNumber.setForeground(Color.WHITE);
        selectRoomNumber.setBounds(50, 150, 200, 30);
        roomPanel.add(selectRoomNumber);

        roomNumberBox = new JComboBox<Short>();
        short[] roomNumbers = new short[cinema.getRooms().size()];
        for (int i = 0; i < cinema.getRooms().size(); i++) {
            roomNumbers[i] = cinema.getRooms().get(i).getRoomNumber();
            roomNumberBox.addItem(roomNumbers[i]);
        }
        roomNumberBox.setBounds(260, 150, 60, 30);
        roomNumberBox.setFont(new Font("Arial", Font.BOLD, 20));
        roomNumberBox.setForeground(mainColor);
        roomNumberBox.setActionCommand("Select room number");
        roomNumberBox.addActionListener(actionListener);
        roomPanel.add(roomNumberBox);

        selectMovie = new JLabel("Elija película a añadir:");
        selectMovie.setFont(new Font("Arial", Font.BOLD, 20));
        selectMovie.setForeground(Color.WHITE);
        selectMovie.setBounds(50, 200, 250, 30);
        roomPanel.add(selectMovie);

        movieBox = new JComboBox<String>();
        String[] movies = new String[cinema.getMovies().size()];
        for (int i = 0; i < cinema.getMovies().size(); i++) {
            movies[i] = cinema.getMovies().get(i).getNameMovies();
            movieBox.addItem(movies[i]);
        }
        movieBox.setBounds(300, 200, 200, 30);
        movieBox.setFont(new Font("Arial", Font.BOLD, 20));
        movieBox.setForeground(mainColor);
        movieBox.setActionCommand("Select movie to add");
        movieBox.addActionListener(actionListener);
        roomPanel.add(movieBox);

        createMovieinRoomButton = new JButton("Añadir");
        createMovieinRoomButton.setBounds(220, 300, 100, 30);
        createMovieinRoomButton.setFont(new Font("Arial", Font.BOLD, 20));
        createMovieinRoomButton.setForeground(mainColor);
        createMovieinRoomButton.setFocusPainted(false);
        createMovieinRoomButton.setActionCommand("Add movie in room");
        createMovieinRoomButton.addActionListener(actionListener);
        roomPanel.add(createMovieinRoomButton);

        roomFrame.setContentPane(roomPanel);
        roomFrame.setVisible(true);

        System.out.println(cinema.getRooms());
    }

    public JFrame getRoomFrame() {
        return roomFrame;
    }

    public JPanel getRoomPanel() {
        return roomPanel;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public JLabel getSelectRoomNumber() {
        return selectRoomNumber;
    }

    public JLabel getSelectMovie() {
        return selectMovie;
    }

    public JButton getCreateRoomButton() {
        return createRoomButton;
    }

    public JButton getAddMovieToRoomButton() {
        return addMovieToRoomButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JTextField getRoomNumberField() {
        return roomNumberField;
    }

    public JButton getCreateButton() {
        return createButton;
    }

    public JButton getCreateMovieinRoomButton() {
        return createMovieinRoomButton;
    }

    public JComboBox<Short> getRoomNumberBox() {
        return roomNumberBox;
    }

    public JComboBox<String> getMovieBox() {
        return movieBox;
    }
}
