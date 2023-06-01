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
    private JLabel titleLabel, selectRoomNumber;
    private JButton createRoomButton, addMovieToRoomButton, backButton, createButton;
    private JTextField roomNumberField;

    private Font mainFont;
    private Color mainColor;
    private ImageIcon mainIcon;

    public AddToRoomMenu() {
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
        //createRoomOption();

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
        createRoomButton.addActionListener(actionListener);
        roomPanel.add(createRoomButton);

        addMovieToRoomButton = new JButton("Añadir película");
        addMovieToRoomButton.setBounds(280, 300, 260, 50);
        addMovieToRoomButton.setFont(new Font("Arial", Font.BOLD, 30));
        addMovieToRoomButton.setForeground(mainColor);
        addMovieToRoomButton.setFocusPainted(false);
        addMovieToRoomButton.addActionListener(actionListener);
        roomPanel.add(addMovieToRoomButton);

        backButton = new JButton("Volver");
        backButton.setBounds(300, 400, 200, 50);
        backButton.setFont(new Font("Arial", Font.BOLD, 30));
        backButton.setForeground(mainColor);
        backButton.setFocusPainted(false);
        backButton.addActionListener(actionListener);
        roomPanel.add(backButton);

        roomFrame.add(roomPanel);
    }

    public void createRoomOption(){
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
        createButton.addActionListener(actionListener);
        roomPanel.add(createButton);

        roomFrame.setContentPane(roomPanel);
    }

    public void addMovieToRoomOption(Cinema cinema){
        roomPanel = new JPanel();
        roomPanel.setLayout(null);
        roomPanel.setBackground(mainColor);

        titleLabel = new JLabel("Añadir Película a sala");
        titleLabel.setFont(mainFont);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(150, 50, 400, 60);
        roomPanel.add(titleLabel);
        

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

    public static void main(String[] args) {
        new AddToRoomMenu();
    }
}
