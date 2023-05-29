package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddMovieMenu {
    private Font mainFont;
    private Color mainColor;
    private ImageIcon mainIcon;

    private JFrame addMovieFrame;
    private JPanel addMoviePanel;
    private JButton addMovieButton, backButton, ediButton, deleteButton;

    public AddMovieMenu() {
        mainFont = new Font("Arial", Font.BOLD, 50);
        mainColor = new Color(42, 42, 42);
        mainIcon = new ImageIcon("Cine/Cine/src/resources/Icons/Logo.png");

        addMovieFrame = new JFrame();
        addMovieFrame.setTitle("Agregar Películas");
        addMovieFrame.setSize(800, 600);
        addMovieFrame.setLocationRelativeTo(null);
        addMovieFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMovieFrame.setResizable(false);
        addMovieFrame.setIconImage(mainIcon.getImage());

        createMovie();

        addMovieFrame.setVisible(true);
    }

    public void createMovie() {
        addMoviePanel = new JPanel(null);
        addMoviePanel.setBackground(mainColor);

        addMovieButton = new JButton("Agregar Película");
        addMovieButton.setFont(new Font("Arial", Font.BOLD, 30));
        addMovieButton.setForeground(Color.WHITE);
        addMovieButton.setBackground(mainColor);
        addMovieButton.setFocusPainted(false);
        addMovieButton.setBounds(100, 100, 280, 40);
        addMoviePanel.add(addMovieButton);

        backButton = new JButton("Volver");
        backButton.setFont(new Font("Arial", Font.BOLD, 30));
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(mainColor);
        backButton.setFocusPainted(false);
        backButton.setBounds(100, 400, 280, 40);
        addMoviePanel.add(backButton);

        ediButton = new JButton("Editar Película");
        ediButton.setFont(new Font("Arial", Font.BOLD, 30));
        ediButton.setForeground(Color.WHITE);
        ediButton.setBackground(mainColor);
        ediButton.setFocusPainted(false);
        ediButton.setBounds(100, 200, 280, 40);
        addMoviePanel.add(ediButton);

        deleteButton = new JButton("Eliminar Película");
        deleteButton.setFont(new Font("Arial", Font.BOLD, 30));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setBackground(mainColor);
        deleteButton.setFocusPainted(false);
        deleteButton.setBounds(100, 300, 280, 40);
        addMoviePanel.add(deleteButton);

        ImageIcon image1 = new ImageIcon("Cine/Cine/src/resources/Icons/AddMenuImage.jpg");
        Image scaledImage1 = image1.getImage().getScaledInstance(300, 425, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
        JLabel label1 = new JLabel(scaledIcon1);
        label1.setBounds(435, 75, 300, 425);
        addMoviePanel.add(label1);

        addMovieFrame.setContentPane(addMoviePanel);
    }

    public static void main(String[] args) {
        new AddMovieMenu();
    }
}
