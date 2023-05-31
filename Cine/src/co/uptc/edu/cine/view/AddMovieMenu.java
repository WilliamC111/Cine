package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.jar.Manifest;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;

import co.uptc.edu.cine.model.*;

public class AddMovieMenu {
    private ActionListener actionListener;

    private Color mainColor;
    private ImageIcon mainIcon;

    private JFrame addMovieFrame;
    private JPanel addMoviePanel;
    private JButton addMovieButton, backButton, ediButton, deleteButton, addImageButton, createButton;
    private JLabel nameLabel, descriptionLabel, formatLabel, timeLabel, mainIconLabel, genderLabel;
    private JTextField nameMovie;
    private JTextArea descriptionMovie;
    private JCheckBox actionOption, adventureOption, animationOption, biographyOption, catastropheOption,
            comedyOption, crimeOption, documentaryOption, dramaOption, familyOption, fantasyOption, filmNoirOption,
            historyOption, horrorOption, musicOption, musicalOption, misteryOption, romanceOption, scifiOption,
            shortFilmOption, sportOption, superheroOption, thrillerOption, warOption, westernOption, TwoDOption,
            ThreeDOption, FourKOption, ImaxOption, UltraTwoDOption;
    private JFormattedTextField formattedTextField;

    private Cinema cinema;

    private ArrayList<String> movieFormats = new ArrayList<String>();
    private ArrayList<String> movieGenders = new ArrayList<String>();

    public AddMovieMenu(ActionListener actionListener) {
        this.actionListener = actionListener;
        cinema = new Cinema();

        mainColor = new Color(0, 0, 128);
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

        addMovieButton = new JButton("Crear Película");
        addMovieButton.setFont(new Font("Arial", Font.BOLD, 30));
        addMovieButton.setForeground(Color.WHITE);
        addMovieButton.setBackground(mainColor);
        addMovieButton.setFocusPainted(false);
        addMovieButton.setBounds(100, 100, 280, 40);
        addMovieButton.addActionListener(actionListener);
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

        addMovieFrame.setSize(1000, 1000);
        addMovieFrame.setLocationRelativeTo(null);

        addMoviePanel = new JPanel(null);
        addMoviePanel.setBackground(mainColor);

        nameLabel = new JLabel("Nombre:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(50, 50, 100, 40);
        addMoviePanel.add(nameLabel);

        nameMovie = new JTextField();
        nameMovie.setFont(new Font("Arial", Font.BOLD, 20));
        nameMovie.setForeground(Color.WHITE);
        nameMovie.setBackground(mainColor);
        nameMovie.setBounds(150, 50, 400, 40);
        addMoviePanel.add(nameMovie);

        descriptionLabel = new JLabel("Descripción:");
        descriptionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        descriptionLabel.setForeground(Color.WHITE);
        descriptionLabel.setBounds(50, 120, 120, 40);
        addMoviePanel.add(descriptionLabel);

        descriptionMovie = new JTextArea();
        descriptionMovie.setFont(new Font("Arial", Font.BOLD, 15));
        descriptionMovie.setForeground(Color.WHITE);
        descriptionMovie.setBackground(mainColor);
        descriptionMovie.setBorder(new LineBorder(Color.WHITE));
        descriptionMovie.setBounds(190, 120, 360, 100);
        addMoviePanel.add(descriptionMovie);

        formatLabel = new JLabel("Formatos:");
        formatLabel.setFont(new Font("Arial", Font.BOLD, 20));
        formatLabel.setForeground(Color.WHITE);
        formatLabel.setBounds(50, 240, 100, 40);
        addMoviePanel.add(formatLabel);

        TwoDOption = new JCheckBox("2D");
        TwoDOption.setFont(new Font("Arial", Font.BOLD, 20));
        TwoDOption.setForeground(Color.WHITE);
        TwoDOption.setBackground(mainColor);
        TwoDOption.setBounds(160, 240, 60, 40);
        addMoviePanel.add(TwoDOption);

        TwoDOption.addItemListener(new ItemListener() {
            MovieFormat movieFormat;

            public void itemStateChanged(ItemEvent e) {
                if (TwoDOption.isSelected()) {
                    movieFormat = movieFormat.TWO_D;
                    movieFormats.add(movieFormat.getName());
                }
            }
        });

        ThreeDOption = new JCheckBox("3D");
        ThreeDOption.setFont(new Font("Arial", Font.BOLD, 20));
        ThreeDOption.setForeground(Color.WHITE);
        ThreeDOption.setBackground(mainColor);
        ThreeDOption.setBounds(220, 240, 60, 40);
        addMoviePanel.add(ThreeDOption);

        ThreeDOption.addItemListener(new ItemListener() {
            MovieFormat movieFormat;

            public void itemStateChanged(ItemEvent e) {
                if (ThreeDOption.isSelected()) {
                    movieFormat = movieFormat.THREE_D;
                    movieFormats.add(movieFormat.getName());
                }
            }
        });

        FourKOption = new JCheckBox("4K");
        FourKOption.setFont(new Font("Arial", Font.BOLD, 20));
        FourKOption.setForeground(Color.WHITE);
        FourKOption.setBackground(mainColor);
        FourKOption.setBounds(280, 240, 60, 40);
        addMoviePanel.add(FourKOption);
        FourKOption.addItemListener(new ItemListener() {
            MovieFormat movieFormat;

            public void itemStateChanged(ItemEvent e) {
                if (FourKOption.isSelected()) {
                    movieFormat = movieFormat.FOUR_K;
                    movieFormats.add(movieFormat.getName());
                }
            }
        });

        ImaxOption = new JCheckBox("IMAX");
        ImaxOption.setFont(new Font("Arial", Font.BOLD, 20));
        ImaxOption.setForeground(Color.WHITE);
        ImaxOption.setBackground(mainColor);
        ImaxOption.setBounds(340, 240, 80, 40);
        addMoviePanel.add(ImaxOption);

        ImaxOption.addItemListener(new ItemListener() {
            MovieFormat movieFormat;

            public void itemStateChanged(ItemEvent e) {
                if (ImaxOption.isSelected()) {
                    movieFormat = movieFormat.IMAX;
                    movieFormats.add(movieFormat.getName());
                }
            }
        });

        UltraTwoDOption = new JCheckBox("Ultra 2D");
        UltraTwoDOption.setFont(new Font("Arial", Font.BOLD, 20));
        UltraTwoDOption.setForeground(Color.WHITE);
        UltraTwoDOption.setBackground(mainColor);
        UltraTwoDOption.setBounds(420, 240, 120, 40);
        addMoviePanel.add(UltraTwoDOption);

        UltraTwoDOption.addItemListener(new ItemListener() {
            MovieFormat movieFormat;

            public void itemStateChanged(ItemEvent e) {
                if (UltraTwoDOption.isSelected()) {
                    movieFormat = movieFormat.ULTRA_TWO_D;
                    movieFormats.add(movieFormat.getName());
                }
            }
        });

        timeLabel = new JLabel("Duración (h:mm):");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setBounds(50, 300, 200, 40);
        addMoviePanel.add(timeLabel);

        try {
            MaskFormatter formatter = new MaskFormatter("#h:##min");
            formattedTextField = new JFormattedTextField(formatter);
            formattedTextField.setColumns(5);
            formattedTextField.setBounds(250, 300, 100, 40);
            formattedTextField.setFont(new Font("Arial", Font.BOLD, 20));
            formattedTextField.setForeground(Color.WHITE);
            formattedTextField.setBackground(mainColor);
            addMoviePanel.add(formattedTextField);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        mainIconLabel = new JLabel();
        mainIconLabel.setBorder(new LineBorder(Color.WHITE));
        mainIconLabel.setBounds(300, 400, 300, 400);
        addMoviePanel.add(mainIconLabel);

        addImageButton = new JButton("Agregar Imagen");
        addImageButton.setFont(new Font("Arial", Font.BOLD, 20));
        addImageButton.setForeground(Color.WHITE);
        addImageButton.setBackground(mainColor);
        addImageButton.setFocusPainted(false);
        addImageButton.setBounds(50, 450, 190, 40);
        addMoviePanel.add(addImageButton);
        addImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif"));
                int result = fileChooser.showOpenDialog(addMovieFrame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                    Image scaled = imageIcon.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);  
                    ImageIcon scaledImage = new ImageIcon(scaled);                  
                    mainIconLabel.setIcon(scaledImage);
                    
                }
            }
        });

        genderLabel = new JLabel("Generos:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 20));
        genderLabel.setForeground(Color.WHITE);
        genderLabel.setBounds(800, 50, 90, 40);
        addMoviePanel.add(genderLabel);

        actionOption = new JCheckBox("Acción");
        actionOption.setFont(new Font("Arial", Font.BOLD, 10));
        actionOption.setForeground(Color.WHITE);
        actionOption.setBackground(mainColor);
        actionOption.setFocusPainted(false);
        actionOption.setBounds(750, 100, 80, 40);
        addMoviePanel.add(actionOption);

        actionOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (actionOption.isSelected()) {
                    movieGender = movieGender.ACTION;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        adventureOption = new JCheckBox("Aventura");
        adventureOption.setFont(new Font("Arial", Font.BOLD, 10));
        adventureOption.setForeground(Color.WHITE);
        adventureOption.setBackground(mainColor);
        adventureOption.setFocusPainted(false);
        adventureOption.setBounds(750, 130, 80, 40);
        addMoviePanel.add(adventureOption);

        adventureOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (adventureOption.isSelected()) {
                    movieGender = movieGender.ADVENTURE;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        animationOption = new JCheckBox("Animación");
        animationOption.setFont(new Font("Arial", Font.BOLD, 10));
        animationOption.setForeground(Color.WHITE);
        animationOption.setBackground(mainColor);
        animationOption.setFocusPainted(false);
        animationOption.setBounds(750, 160, 80, 40);
        addMoviePanel.add(animationOption);

        animationOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (animationOption.isSelected()) {
                    movieGender = movieGender.ANIMATION;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        biographyOption = new JCheckBox("Biografía");
        biographyOption.setFont(new Font("Arial", Font.BOLD, 10));
        biographyOption.setForeground(Color.WHITE);
        biographyOption.setBackground(mainColor);
        biographyOption.setFocusPainted(false);
        biographyOption.setBounds(750, 190, 80, 40);
        addMoviePanel.add(biographyOption);

        biographyOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (biographyOption.isSelected()) {
                    movieGender = movieGender.BIOGRAPHY;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        catastropheOption = new JCheckBox("Catastrofe");
        catastropheOption.setFont(new Font("Arial", Font.BOLD, 10));
        catastropheOption.setForeground(Color.WHITE);
        catastropheOption.setBackground(mainColor);
        catastropheOption.setFocusPainted(false);
        catastropheOption.setBounds(750, 220, 80, 40);
        addMoviePanel.add(catastropheOption);

        catastropheOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (catastropheOption.isSelected()) {
                    movieGender = movieGender.CATASTROPHE;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        comedyOption = new JCheckBox("Comedia");
        comedyOption.setFont(new Font("Arial", Font.BOLD, 10));
        comedyOption.setForeground(Color.WHITE);
        comedyOption.setBackground(mainColor);
        comedyOption.setFocusPainted(false);
        comedyOption.setBounds(750, 250, 80, 40);
        addMoviePanel.add(comedyOption);

        comedyOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (comedyOption.isSelected()) {
                    movieGender = movieGender.COMEDY;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        crimeOption = new JCheckBox("Crimen");
        crimeOption.setFont(new Font("Arial", Font.BOLD, 10));
        crimeOption.setForeground(Color.WHITE);
        crimeOption.setBackground(mainColor);
        crimeOption.setFocusPainted(false);
        crimeOption.setBounds(750, 280, 80, 40);
        addMoviePanel.add(crimeOption);

        crimeOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (crimeOption.isSelected()) {
                    movieGender = movieGender.CRIME;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        documentaryOption = new JCheckBox("Documental");
        documentaryOption.setFont(new Font("Arial", Font.BOLD, 10));
        documentaryOption.setForeground(Color.WHITE);
        documentaryOption.setBackground(mainColor);
        documentaryOption.setFocusPainted(false);
        documentaryOption.setBounds(750, 310, 80, 40);
        addMoviePanel.add(documentaryOption);

        documentaryOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (documentaryOption.isSelected()) {
                    movieGender = movieGender.DOCUMENTARY;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        dramaOption = new JCheckBox("Drama");
        dramaOption.setFont(new Font("Arial", Font.BOLD, 10));
        dramaOption.setForeground(Color.WHITE);
        dramaOption.setBackground(mainColor);
        dramaOption.setFocusPainted(false);
        dramaOption.setBounds(750, 340, 80, 40);
        addMoviePanel.add(dramaOption);

        dramaOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (dramaOption.isSelected()) {
                    movieGender = movieGender.DRAMA;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        familyOption = new JCheckBox("Familiar");
        familyOption.setFont(new Font("Arial", Font.BOLD, 10));
        familyOption.setForeground(Color.WHITE);
        familyOption.setBackground(mainColor);
        familyOption.setFocusPainted(false);
        familyOption.setBounds(750, 370, 80, 40);
        addMoviePanel.add(familyOption);

        familyOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (familyOption.isSelected()) {
                    movieGender = movieGender.FAMILY;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        fantasyOption = new JCheckBox("Fantasía");
        fantasyOption.setFont(new Font("Arial", Font.BOLD, 10));
        fantasyOption.setForeground(Color.WHITE);
        fantasyOption.setBackground(mainColor);
        fantasyOption.setFocusPainted(false);
        fantasyOption.setBounds(750, 400, 80, 40);
        addMoviePanel.add(fantasyOption);

        fantasyOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (fantasyOption.isSelected()) {
                    movieGender = movieGender.FANTASY;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        filmNoirOption = new JCheckBox("Fantasía");
        filmNoirOption.setFont(new Font("Arial", Font.BOLD, 10));
        filmNoirOption.setForeground(Color.WHITE);
        filmNoirOption.setBackground(mainColor);
        filmNoirOption.setFocusPainted(false);
        filmNoirOption.setBounds(750, 430, 80, 40);
        addMoviePanel.add(filmNoirOption);

        filmNoirOption.addItemListener(new ItemListener() {
            MovieGender movieGender;

            public void itemStateChanged(ItemEvent e) {
                if (filmNoirOption.isSelected()) {
                    movieGender = movieGender.FILM_NOIR;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        historyOption = new JCheckBox("Historia");
        historyOption.setFont(new Font("Arial", Font.BOLD, 10));
        historyOption.setForeground(Color.WHITE);
        historyOption.setBackground(mainColor);
        historyOption.setFocusPainted(false);
        historyOption.setBounds(750, 460, 80, 40);
        addMoviePanel.add(historyOption);

        historyOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (historyOption.isSelected()) {
                    movieGender = movieGender.HISTORY;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        horrorOption = new JCheckBox("Horror");
        horrorOption.setFont(new Font("Arial", Font.BOLD, 10));
        horrorOption.setForeground(Color.WHITE);
        horrorOption.setBackground(mainColor);
        horrorOption.setFocusPainted(false);
        horrorOption.setBounds(850, 100, 80, 40);
        addMoviePanel.add(horrorOption);

        horrorOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (horrorOption.isSelected()) {
                    movieGender = movieGender.HORROR;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        musicOption = new JCheckBox("Musica");
        musicOption.setFont(new Font("Arial", Font.BOLD, 10));
        musicOption.setForeground(Color.WHITE);
        musicOption.setBackground(mainColor);
        musicOption.setFocusPainted(false);
        musicOption.setBounds(850, 130, 80, 40);
        addMoviePanel.add(musicOption);

        musicOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (musicOption.isSelected()) {
                    movieGender = movieGender.MUSIC;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        musicalOption = new JCheckBox("Musical");
        musicalOption.setFont(new Font("Arial", Font.BOLD, 10));
        musicalOption.setForeground(Color.WHITE);
        musicalOption.setBackground(mainColor);
        musicalOption.setFocusPainted(false);
        musicalOption.setBounds(850, 160, 80, 40);
        addMoviePanel.add(musicalOption);

        musicalOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (musicalOption.isSelected()) {
                    movieGender = movieGender.MUSICAL;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        misteryOption = new JCheckBox("Misterio");
        misteryOption.setFont(new Font("Arial", Font.BOLD, 10));
        misteryOption.setForeground(Color.WHITE);
        misteryOption.setBackground(mainColor);
        misteryOption.setFocusPainted(false);
        misteryOption.setBounds(850, 190, 80, 40);
        addMoviePanel.add(misteryOption);

        misteryOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (misteryOption.isSelected()) {
                    movieGender = movieGender.MISTERY;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        romanceOption = new JCheckBox("Romance");
        romanceOption.setFont(new Font("Arial", Font.BOLD, 10));
        romanceOption.setForeground(Color.WHITE);
        romanceOption.setBackground(mainColor);
        romanceOption.setFocusPainted(false);
        romanceOption.setBounds(850, 220, 80, 40);
        addMoviePanel.add(romanceOption);

        romanceOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (romanceOption.isSelected()) {
                    movieGender = movieGender.ROMANCE;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        scifiOption = new JCheckBox("Ciencia Ficción");
        scifiOption.setFont(new Font("Arial", Font.BOLD, 10));
        scifiOption.setForeground(Color.WHITE);
        scifiOption.setBackground(mainColor);
        scifiOption.setFocusPainted(false);
        scifiOption.setBounds(850, 250, 120, 40);
        addMoviePanel.add(scifiOption);

        scifiOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (scifiOption.isSelected()) {
                    movieGender = movieGender.SCIFI;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        shortFilmOption = new JCheckBox("Cortos");
        shortFilmOption.setFont(new Font("Arial", Font.BOLD, 10));
        shortFilmOption.setForeground(Color.WHITE);
        shortFilmOption.setBackground(mainColor);
        shortFilmOption.setFocusPainted(false);
        shortFilmOption.setBounds(850, 280, 80, 40);
        addMoviePanel.add(shortFilmOption);

        shortFilmOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (shortFilmOption.isSelected()) {
                    movieGender = movieGender.SHORT_FILM;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        sportOption = new JCheckBox("Deportes");
        sportOption.setFont(new Font("Arial", Font.BOLD, 10));
        sportOption.setForeground(Color.WHITE);
        sportOption.setBackground(mainColor);
        sportOption.setFocusPainted(false);
        sportOption.setBounds(850, 310, 80, 40);
        addMoviePanel.add(sportOption);

        sportOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (sportOption.isSelected()) {
                    movieGender = movieGender.SPORT;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        superheroOption = new JCheckBox("Superheroes");
        superheroOption.setFont(new Font("Arial", Font.BOLD, 10));
        superheroOption.setForeground(Color.WHITE);
        superheroOption.setBackground(mainColor);
        superheroOption.setFocusPainted(false);
        superheroOption.setBounds(850, 340, 100, 40);
        addMoviePanel.add(superheroOption);

        superheroOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (superheroOption.isSelected()) {
                    movieGender = movieGender.SUPERHERO;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        thrillerOption = new JCheckBox("Suspenso");
        thrillerOption.setFont(new Font("Arial", Font.BOLD, 10));
        thrillerOption.setForeground(Color.WHITE);
        thrillerOption.setBackground(mainColor);
        thrillerOption.setFocusPainted(false);
        thrillerOption.setBounds(850, 370, 80, 40);
        addMoviePanel.add(thrillerOption);

        thrillerOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (thrillerOption.isSelected()) {
                    movieGender = movieGender.THRILLER;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        warOption = new JCheckBox("Guerra");
        warOption.setFont(new Font("Arial", Font.BOLD, 10));
        warOption.setForeground(Color.WHITE);
        warOption.setBackground(mainColor);
        warOption.setFocusPainted(false);
        warOption.setBounds(850, 400, 80, 40);
        addMoviePanel.add(warOption);

        warOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (warOption.isSelected()) {
                    movieGender = movieGender.WAR;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        westernOption = new JCheckBox("Oeste");
        westernOption.setFont(new Font("Arial", Font.BOLD, 10));
        westernOption.setForeground(Color.WHITE);
        westernOption.setBackground(mainColor);
        westernOption.setFocusPainted(false);
        westernOption.setBounds(850, 430, 80, 40);
        addMoviePanel.add(westernOption);

        westernOption.addItemListener(new ItemListener() {
            MovieGender movieGender;
            public void itemStateChanged(ItemEvent e) {
                if (westernOption.isSelected()) {
                    movieGender = movieGender.WESTERN;
                    movieGenders.add(movieGender.getName());
                }
            }
        });

        createButton = new JButton("Crear");
        createButton.setFont(new Font("Arial", Font.BOLD, 30));
        createButton.setForeground(Color.WHITE);
        createButton.setBackground(mainColor);
        createButton.setFocusPainted(false);
        createButton.setBounds(800, 780, 120, 40);
        createButton.addActionListener(actionListener);
        addMoviePanel.add(createButton);

        addMovieFrame.setContentPane(addMoviePanel);
    }

    public ArrayList<String> getMovieFormats() {
        return movieFormats;
    }

    public ArrayList<String> getMovieGenders(){
        return movieGenders;
    }

    public String getTime(String time) {
        String timeAux = "";
        try {
            String hh = time.substring(0, 2);
            String mm = time.substring(3, 5);
            timeAux = hh + "h " + mm + "min";
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(timeAux);
        return timeAux;
    }

    public void deleteMovieOption() {
        System.out.println(cinema.getMovies().get(0).getNameMovies());

        JComboBox<Movie> movieList = new JComboBox<>(cinema.getMovies().toArray(new Movie[0]));
        movieList.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Movie) {
                    Movie movie = (Movie) value;
                    setText(movie.getNameMovies());
                }
                return this;
            }
        });
        JOptionPane.showMessageDialog(null, movieList, "Seleccione la película a eliminar",
                JOptionPane.QUESTION_MESSAGE);
        cinema.getMovies().remove(movieList.getSelectedItem());

        System.out.println((cinema.getMovies().isEmpty()) ? "No hay peliculas" : "Hay peliculas");
    }

    public void editMovieOption() {
        JComboBox<Movie> movieList = new JComboBox<>(cinema.getMovies().toArray(new Movie[0]));
        movieList.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Movie) {
                    Movie movie = (Movie) value;
                    setText(movie.getNameMovies());
                }
                return this;
            }
        });
        JOptionPane.showMessageDialog(null, movieList, "Seleccione la película a editar",
                JOptionPane.QUESTION_MESSAGE);

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

    public JButton getCreateButton(){
        return createButton;
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

    public JFormattedTextField getFormattedTextField() {
        return formattedTextField;
    }
}
