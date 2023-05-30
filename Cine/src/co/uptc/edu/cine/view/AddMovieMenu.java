package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class AddMovieMenu {
    private Color mainColor;
    private ImageIcon mainIcon;

    private JFrame addMovieFrame;
    private JPanel addMoviePanel;
    private JButton addMovieButton, backButton, ediButton, deleteButton, addImageButton, createButton;
    private JLabel nameLabel, descriptionLabel, formatLabel, mainIconLabel, genderLabel;
    private JTextField nameMovie;
    private JTextArea descriptionMovie;
    private JCheckBox actionOption, adventureOption, animationOption, biographyOption, catastropheOption,
            comedyOption, crimeOption, documentaryOption, dramaOption, familyOption, fantasyOption, filmNoirOption,
            historyOption, horrorOption, musicOption, musicalOption, misteryOption, romanceOption, scifiOption,
            shortFilmOption, sportOption, superheroOption, thrillerOption, warOption, westernOption, TwoDOption,
            ThreeDOption, FourKOption, ImaxOption, UltraTwoDOption;

    public AddMovieMenu() {
        mainColor = new Color(0, 0, 128);
        mainIcon = new ImageIcon("Cine/Cine/src/resources/Icons/Logo.png");

        addMovieFrame = new JFrame();
        addMovieFrame.setTitle("Agregar Películas");
        addMovieFrame.setSize(800, 600);
        addMovieFrame.setLocationRelativeTo(null);
        addMovieFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMovieFrame.setResizable(false);
        addMovieFrame.setIconImage(mainIcon.getImage());

        //createMovie();
        addMovieOption();

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
        label1.setBorder(new LineBorder(Color.WHITE, 5));
        label1.setBounds(435, 75, 300, 425);
        addMoviePanel.add(label1);

        addMovieFrame.setContentPane(addMoviePanel);
    }

    public void addMovieOption() {

        addMoviePanel = new JPanel(null);
        addMoviePanel.setBackground(mainColor);

        nameLabel = new JLabel("Nombre:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(50, 50, 70, 40);
        addMoviePanel.add(nameLabel);

        nameMovie = new JTextField();
        nameMovie.setFont(new Font("Arial", Font.BOLD, 15));
        nameMovie.setForeground(Color.WHITE);
        nameMovie.setBackground(mainColor);
        nameMovie.setBounds(160, 50, 300, 40);
        addMoviePanel.add(nameMovie);

        descriptionLabel = new JLabel("Descripción:");
        descriptionLabel.setFont(new Font("Arial", Font.BOLD, 15));
        descriptionLabel.setForeground(Color.WHITE);
        descriptionLabel.setBounds(50, 100, 100, 40);
        addMoviePanel.add(descriptionLabel);

        descriptionMovie = new JTextArea();
        descriptionMovie.setFont(new Font("Arial", Font.BOLD, 10));
        descriptionMovie.setForeground(Color.WHITE);
        descriptionMovie.setBackground(mainColor);
        descriptionMovie.setBorder(new LineBorder(Color.WHITE));
        descriptionMovie.setBounds(160, 100, 300, 80);
        addMoviePanel.add(descriptionMovie);

        formatLabel = new JLabel("Formatos:");
        formatLabel.setFont(new Font("Arial", Font.BOLD, 15));
        formatLabel.setForeground(Color.WHITE);
        formatLabel.setBounds(50, 200, 80, 40);
        addMoviePanel.add(formatLabel);

        TwoDOption = new JCheckBox("2D");
        TwoDOption.setFont(new Font("Arial", Font.BOLD, 15));
        TwoDOption.setForeground(Color.WHITE);
        TwoDOption.setBackground(mainColor);
        TwoDOption.setBounds(130, 200, 50, 40);
        addMoviePanel.add(TwoDOption);

        ThreeDOption = new JCheckBox("3D");
        ThreeDOption.setFont(new Font("Arial", Font.BOLD, 15));
        ThreeDOption.setForeground(Color.WHITE);
        ThreeDOption.setBackground(mainColor);
        ThreeDOption.setBounds(180, 200, 50, 40);
        addMoviePanel.add(ThreeDOption);

        FourKOption = new JCheckBox("4K");
        FourKOption.setFont(new Font("Arial", Font.BOLD, 15));
        FourKOption.setForeground(Color.WHITE);
        FourKOption.setBackground(mainColor);
        FourKOption.setBounds(230, 200, 50, 40);
        addMoviePanel.add(FourKOption);

        ImaxOption = new JCheckBox("IMAX");
        ImaxOption.setFont(new Font("Arial", Font.BOLD, 15));
        ImaxOption.setForeground(Color.WHITE);
        ImaxOption.setBackground(mainColor);
        ImaxOption.setBounds(280, 200, 70, 40);
        addMoviePanel.add(ImaxOption);

        UltraTwoDOption = new JCheckBox("Ultra 2D");
        UltraTwoDOption.setFont(new Font("Arial", Font.BOLD, 15));
        UltraTwoDOption.setForeground(Color.WHITE);
        UltraTwoDOption.setBackground(mainColor);
        UltraTwoDOption.setBounds(350, 200, 100, 40);
        addMoviePanel.add(UltraTwoDOption);

        mainIconLabel = new JLabel();
        mainIconLabel.setBorder(new LineBorder(Color.WHITE));
        mainIconLabel.setBounds(300, 250, 200, 300);
        addMoviePanel.add(mainIconLabel);

        addImageButton = new JButton("Agregar Imagen");
        addImageButton.setFont(new Font("Arial", Font.BOLD, 15));
        addImageButton.setForeground(Color.WHITE);
        addImageButton.setBackground(mainColor);
        addImageButton.setFocusPainted(false);
        addImageButton.setBounds(50, 250, 200, 40);
        addMoviePanel.add(addImageButton);

        genderLabel = new JLabel("Generos:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 15));
        genderLabel.setForeground(Color.WHITE);
        genderLabel.setBounds(600, 50, 70, 40);
        addMoviePanel.add(genderLabel);

        actionOption = new JCheckBox("Acción");
        actionOption.setFont(new Font("Arial", Font.BOLD, 10));
        actionOption.setForeground(Color.WHITE);
        actionOption.setBackground(mainColor);
        actionOption.setFocusPainted(false);
        actionOption.setBounds(550, 100, 80, 40);
        addMoviePanel.add(actionOption);

        adventureOption = new JCheckBox("Aventura");
        adventureOption.setFont(new Font("Arial", Font.BOLD, 10));
        adventureOption.setForeground(Color.WHITE);
        adventureOption.setBackground(mainColor);
        adventureOption.setFocusPainted(false);
        adventureOption.setBounds(550, 130, 80, 40);
        addMoviePanel.add(adventureOption);

        animationOption = new JCheckBox("Animación");
        animationOption.setFont(new Font("Arial", Font.BOLD, 10));
        animationOption.setForeground(Color.WHITE);
        animationOption.setBackground(mainColor);
        animationOption.setFocusPainted(false);
        animationOption.setBounds(550, 160, 80, 40);
        addMoviePanel.add(animationOption);

        biographyOption = new JCheckBox("Biografía");
        biographyOption.setFont(new Font("Arial", Font.BOLD, 10));
        biographyOption.setForeground(Color.WHITE);
        biographyOption.setBackground(mainColor);
        biographyOption.setFocusPainted(false);
        biographyOption.setBounds(550, 190, 80, 40);
        addMoviePanel.add(biographyOption);

        catastropheOption = new JCheckBox("Catastrofe");
        catastropheOption.setFont(new Font("Arial", Font.BOLD, 10));
        catastropheOption.setForeground(Color.WHITE);
        catastropheOption.setBackground(mainColor);
        catastropheOption.setFocusPainted(false);
        catastropheOption.setBounds(550, 220, 80, 40);
        addMoviePanel.add(catastropheOption);

        comedyOption = new JCheckBox("Comedia");
        comedyOption.setFont(new Font("Arial", Font.BOLD, 10));
        comedyOption.setForeground(Color.WHITE);
        comedyOption.setBackground(mainColor);
        comedyOption.setFocusPainted(false);
        comedyOption.setBounds(550, 250, 80, 40);
        addMoviePanel.add(comedyOption);

        crimeOption = new JCheckBox("Crimen");
        crimeOption.setFont(new Font("Arial", Font.BOLD, 10));
        crimeOption.setForeground(Color.WHITE);
        crimeOption.setBackground(mainColor);
        crimeOption.setFocusPainted(false);
        crimeOption.setBounds(550, 280, 80, 40);
        addMoviePanel.add(crimeOption);

        documentaryOption = new JCheckBox("Documental");
        documentaryOption.setFont(new Font("Arial", Font.BOLD, 10));
        documentaryOption.setForeground(Color.WHITE);
        documentaryOption.setBackground(mainColor);
        documentaryOption.setFocusPainted(false);
        documentaryOption.setBounds(550, 310, 80, 40);
        addMoviePanel.add(documentaryOption);

        dramaOption = new JCheckBox("Drama");
        dramaOption.setFont(new Font("Arial", Font.BOLD, 10));
        dramaOption.setForeground(Color.WHITE);
        dramaOption.setBackground(mainColor);
        dramaOption.setFocusPainted(false);
        dramaOption.setBounds(550, 340, 80, 40);
        addMoviePanel.add(dramaOption);

        familyOption = new JCheckBox("Familiar");
        familyOption.setFont(new Font("Arial", Font.BOLD, 10));
        familyOption.setForeground(Color.WHITE);
        familyOption.setBackground(mainColor);
        familyOption.setFocusPainted(false);
        familyOption.setBounds(550, 370, 80, 40);
        addMoviePanel.add(familyOption);

        fantasyOption = new JCheckBox("Fantasía");
        fantasyOption.setFont(new Font("Arial", Font.BOLD, 10));
        fantasyOption.setForeground(Color.WHITE);
        fantasyOption.setBackground(mainColor);
        fantasyOption.setFocusPainted(false);
        fantasyOption.setBounds(550, 400, 80, 40);
        addMoviePanel.add(fantasyOption);

        filmNoirOption = new JCheckBox("Fantasía");
        filmNoirOption.setFont(new Font("Arial", Font.BOLD, 10));
        filmNoirOption.setForeground(Color.WHITE);
        filmNoirOption.setBackground(mainColor);
        filmNoirOption.setFocusPainted(false);
        filmNoirOption.setBounds(550, 430, 80, 40);
        addMoviePanel.add(filmNoirOption);

        historyOption = new JCheckBox("Historia");
        historyOption.setFont(new Font("Arial", Font.BOLD, 10));
        historyOption.setForeground(Color.WHITE);
        historyOption.setBackground(mainColor);
        historyOption.setFocusPainted(false);
        historyOption.setBounds(550, 460, 80, 40);
        addMoviePanel.add(historyOption);

        horrorOption = new JCheckBox("Horror");
        horrorOption.setFont(new Font("Arial", Font.BOLD, 10));
        horrorOption.setForeground(Color.WHITE);
        horrorOption.setBackground(mainColor);
        horrorOption.setFocusPainted(false);
        horrorOption.setBounds(650, 100, 80, 40);
        addMoviePanel.add(horrorOption);

        musicOption = new JCheckBox("Musica");
        musicOption.setFont(new Font("Arial", Font.BOLD, 10));
        musicOption.setForeground(Color.WHITE);
        musicOption.setBackground(mainColor);
        musicOption.setFocusPainted(false);
        musicOption.setBounds(650, 130, 80, 40);
        addMoviePanel.add(musicOption);

        musicalOption = new JCheckBox("Musical");
        musicalOption.setFont(new Font("Arial", Font.BOLD, 10));
        musicalOption.setForeground(Color.WHITE);
        musicalOption.setBackground(mainColor);
        musicalOption.setFocusPainted(false);
        musicalOption.setBounds(650, 160, 80, 40);
        addMoviePanel.add(musicalOption);

        misteryOption = new JCheckBox("Misterio");
        misteryOption.setFont(new Font("Arial", Font.BOLD, 10));
        misteryOption.setForeground(Color.WHITE);
        misteryOption.setBackground(mainColor);
        misteryOption.setFocusPainted(false);
        misteryOption.setBounds(650, 190, 80, 40);
        addMoviePanel.add(misteryOption);

        romanceOption = new JCheckBox("Romance");
        romanceOption.setFont(new Font("Arial", Font.BOLD, 10));
        romanceOption.setForeground(Color.WHITE);
        romanceOption.setBackground(mainColor);
        romanceOption.setFocusPainted(false);
        romanceOption.setBounds(650, 220, 80, 40);
        addMoviePanel.add(romanceOption);

        scifiOption = new JCheckBox("Ciencia Ficción");
        scifiOption.setFont(new Font("Arial", Font.BOLD, 10));
        scifiOption.setForeground(Color.WHITE);
        scifiOption.setBackground(mainColor);
        scifiOption.setFocusPainted(false);
        scifiOption.setBounds(650, 250, 120, 40);
        addMoviePanel.add(scifiOption);

        shortFilmOption = new JCheckBox("Cortos");
        shortFilmOption.setFont(new Font("Arial", Font.BOLD, 10));
        shortFilmOption.setForeground(Color.WHITE);
        shortFilmOption.setBackground(mainColor);
        shortFilmOption.setFocusPainted(false);
        shortFilmOption.setBounds(650, 280, 80, 40);
        addMoviePanel.add(shortFilmOption);

        sportOption = new JCheckBox("Deportes");
        sportOption.setFont(new Font("Arial", Font.BOLD, 10));
        sportOption.setForeground(Color.WHITE);
        sportOption.setBackground(mainColor);
        sportOption.setFocusPainted(false);
        sportOption.setBounds(650, 310, 80, 40);
        addMoviePanel.add(sportOption);

        superheroOption = new JCheckBox("Superheroes");
        superheroOption.setFont(new Font("Arial", Font.BOLD, 10));
        superheroOption.setForeground(Color.WHITE);
        superheroOption.setBackground(mainColor);
        superheroOption.setFocusPainted(false);
        superheroOption.setBounds(650, 340, 100, 40);
        addMoviePanel.add(superheroOption);

        thrillerOption = new JCheckBox("Suspenso");
        thrillerOption.setFont(new Font("Arial", Font.BOLD, 10));
        thrillerOption.setForeground(Color.WHITE);
        thrillerOption.setBackground(mainColor);
        thrillerOption.setFocusPainted(false);
        thrillerOption.setBounds(650, 370, 80, 40);
        addMoviePanel.add(thrillerOption);

        warOption = new JCheckBox("Guerra");
        warOption.setFont(new Font("Arial", Font.BOLD, 10));
        warOption.setForeground(Color.WHITE);
        warOption.setBackground(mainColor);
        warOption.setFocusPainted(false);
        warOption.setBounds(650, 400, 80, 40);
        addMoviePanel.add(warOption);

        westernOption = new JCheckBox("Oeste");
        westernOption.setFont(new Font("Arial", Font.BOLD, 10));
        westernOption.setForeground(Color.WHITE);
        westernOption.setBackground(mainColor);
        westernOption.setFocusPainted(false);
        westernOption.setBounds(650, 430, 80, 40);
        addMoviePanel.add(westernOption);

        createButton = new JButton("Crear");
        createButton.setFont(new Font("Arial", Font.BOLD, 15));
        createButton.setForeground(Color.WHITE);
        createButton.setBackground(mainColor);
        createButton.setFocusPainted(false);
        createButton.setBounds(650, 500, 80, 40);
        addMoviePanel.add(createButton);

        addMovieFrame.setContentPane(addMoviePanel);
    }

    public JButton getAddMovieButton() {
        return addMovieButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getEdiButton() {
        return ediButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JButton getAddImageButton() {
        return addImageButton;
    }

    public JLabel getMainIconLabel() {
        return mainIconLabel;
    }

    public JTextField getNameMovie() {
        return nameMovie;
    }

    public JTextArea getDescriptionMovie() {
        return descriptionMovie;
    }

    public JCheckBox getActionOption() {
        return actionOption;
    }

    public JCheckBox getAdventureOption() {
        return adventureOption;
    }

    public JCheckBox getAnimationOption() {
        return animationOption;
    }

    public JCheckBox getBiographyOption() {
        return biographyOption;
    }

    public JCheckBox getCatastropheOption() {
        return catastropheOption;
    }

    public JCheckBox getComedyOption() {
        return comedyOption;
    }

    public JCheckBox getCrimeOption() {
        return crimeOption;
    }

    public JCheckBox getDocumentaryOption() {
        return documentaryOption;
    }

    public JCheckBox getDramaOption() {
        return dramaOption;
    }

    public JCheckBox getFamilyOption() {
        return familyOption;
    }

    public JCheckBox getFantasyOption() {
        return fantasyOption;
    }

    public JCheckBox getFilmNoirOption() {
        return filmNoirOption;
    }

    public JCheckBox getHistoryOption() {
        return historyOption;
    }

    public JCheckBox getHorrorOption() {
        return horrorOption;
    }

    public JCheckBox getMusicOption() {
        return musicOption;
    }

    public JCheckBox getMusicalOption() {
        return musicalOption;
    }

    public JCheckBox getMisteryOption() {
        return misteryOption;
    }

    public JCheckBox getRomanceOption() {
        return romanceOption;
    }

    public JCheckBox getScifiOption() {
        return scifiOption;
    }

    public JCheckBox getShortFilmOption() {
        return shortFilmOption;
    }

    public JCheckBox getSportOption() {
        return sportOption;
    }

    public JCheckBox getSuperheroOption() {
        return superheroOption;
    }

    public JCheckBox getThrillerOption() {
        return thrillerOption;
    }

    public JCheckBox getWarOption() {
        return warOption;
    }

    public JCheckBox getWesternOption() {
        return westernOption;
    }

    public JCheckBox getTwoDOption() {
        return TwoDOption;
    }

    public JCheckBox getThreeDOption() {
        return ThreeDOption;
    }

    public JCheckBox getFourKOption() {
        return FourKOption;
    }

    public JCheckBox getImaxOption() {
        return ImaxOption;
    }

    public JCheckBox getUltraTwoDOption() {
        return UltraTwoDOption;
    }

    public static void main(String[] args) {
        new AddMovieMenu();
    }
}
