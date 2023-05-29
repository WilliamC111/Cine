package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AddMovieMenu {
    private Font mainFont;
    private Color mainColor;
    private ImageIcon mainIcon;

    private JFrame addMovieFrame;
    private JPanel addMoviePanel;

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

        createMovie();

        addMovieFrame.setVisible(true);
    }

    public void createMovie() {
        addMoviePanel = new JPanel();
        addMoviePanel.setBackground(mainColor);

        addMovieFrame.add(addMoviePanel);
    }

    public static void main(String[] args) {
        new AddMovieMenu();
    }
}
