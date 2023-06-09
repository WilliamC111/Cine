package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import co.uptc.edu.cine.model.Movie; 
import co.uptc.edu.cine.model.MovieFormat;
import co.uptc.edu.cine.model.MovieGender;

public class ImageViewer {
    private JFrame frame;
    private JTabbedPane tabbedPane;
    private int imageWidth = 280;
    private int imageHeight = 400;

    public ImageViewer() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("CARTELERA");
        frame.setBounds(80, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        frame.getContentPane().add(tabbedPane);
        showImages();

        frame.setVisible(true);
    }
    

    private void showImages() {
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 3));

        Movie movie1 = new Movie();
        movie1.setNameMovies("John Wick");
        movie1.setTimeMovie("1h 42min");
        movie1.addMovieGenders(MovieGender.ACTION);
        movie1.addMovieFormat(MovieFormat.TWO_D);
        movie1.setIcon("/resources/action/image1.jpg");

        ImageIcon image1 = new ImageIcon(getClass().getResource(movie1.getIcon().getDescription()));
        Image scaledImage1 = image1.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
        JLabel label1 = new JLabel(scaledIcon1);
        panel1.add(label1);

        JPanel descriptionPanel1 = new JPanel();
        descriptionPanel1.setLayout(new GridLayout(3, 1));
        JLabel nameLabel1 = new JLabel(movie1.getNameMovies());
        nameLabel1.setForeground(Color.white);
        JLabel timeLabel1 = new JLabel("Duración: " + movie1.getTimeMovie());
        timeLabel1.setForeground(Color.white);
        JLabel formatLabel1 = new JLabel("Formato: " + movie1.getMovieFormat().toString());
        formatLabel1.setForeground(Color.white);
        descriptionPanel1.add(nameLabel1);
        descriptionPanel1.add(timeLabel1);
        descriptionPanel1.add(formatLabel1);
        descriptionPanel1.setBackground(new Color(0,0,128));
        panel1.add(descriptionPanel1);

        Movie movie2 = new Movie();
        movie2.setNameMovies("Ghosteado");
        movie2.setTimeMovie("1h 42min");
        movie2.addMovieGenders(MovieGender.ACTION);
        movie2.addMovieFormat(MovieFormat.TWO_D);
        movie2.setIcon("/resources/action/image2.jpg");

        ImageIcon image2 = new ImageIcon(getClass().getResource(movie2.getIcon().getDescription()));
        Image scaledImage2 = image2.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
        JLabel label2 = new JLabel(scaledIcon2);
        panel1.add(label2);

        JPanel descriptionPanel2 = new JPanel();
        descriptionPanel2.setLayout(new GridLayout(3, 1));
        JLabel nameLabel2 = new JLabel(movie2.getNameMovies());
        nameLabel2.setForeground(Color.white);
        JLabel timeLabel2 = new JLabel("Duración: " + movie2.getTimeMovie());
        timeLabel2.setForeground(Color.white);
        JLabel formatLabel2 = new JLabel("Formato: " + movie2.getMovieFormat().toString());
        formatLabel2.setForeground(Color.white);
        descriptionPanel2.add(nameLabel2);
        descriptionPanel2.add(timeLabel2);
        descriptionPanel2.add(formatLabel2);
        descriptionPanel2.setBackground(new Color(0,0,128));
        panel1.add(descriptionPanel2);

        Movie movie3 = new Movie();
        movie3.setNameMovies("Al borde de la extinción");
        movie3.setTimeMovie("1h 42min");
        movie3.addMovieGenders(MovieGender.ACTION);
        movie3.addMovieFormat(MovieFormat.TWO_D);
        movie3.setIcon("/resources/action/image3.jpg");

        ImageIcon image3 = new ImageIcon(getClass().getResource(movie3.getIcon().getDescription()));
        Image scaledImage3 = image3.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(scaledImage3);
        JLabel label3 = new JLabel(scaledIcon3);
        panel1.add(label3);

        JPanel descriptionPanel3 = new JPanel();
        descriptionPanel3.setLayout(new GridLayout(3, 1));
        JLabel nameLabel3 = new JLabel(movie3.getNameMovies());
        nameLabel3.setForeground(Color.white);
        JLabel timeLabel3 = new JLabel("Duración: " + movie3.getTimeMovie());
        timeLabel3.setForeground(Color.white);
        JLabel formatLabel3 = new JLabel("Formato: " + movie3.getMovieFormat().toString());
        formatLabel3.setForeground(Color.white);
        descriptionPanel3.add(nameLabel3);
        descriptionPanel3.add(timeLabel3);
        descriptionPanel3.setBackground(new Color(0,0,128));
        descriptionPanel3.add(formatLabel3);
        
        panel1.add(descriptionPanel3);

        panel1.setBackground(new Color(0, 0, 128));
        tabbedPane.addTab("ACCIÓN", panel1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 3));

        Movie movie4 = new Movie();
        movie4.setNameMovies("El gato con botas");
        movie4.setTimeMovie("1h 42min");
        movie4.addMovieGenders(MovieGender.ACTION);
        movie4.addMovieFormat(MovieFormat.TWO_D);
        movie4.setIcon("/resources/animation/image4.jpg");

        ImageIcon image4 = new ImageIcon(getClass().getResource(movie4.getIcon().getDescription()));
        Image scaledImage4 = image4.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);
        JLabel label4 = new JLabel(scaledIcon4);
        panel2.add(label4);

        JPanel descriptionPanel4= new JPanel();
        descriptionPanel4.setLayout(new GridLayout(3, 1));
        JLabel nameLabel4 = new JLabel(movie4.getNameMovies());
        nameLabel4.setForeground(Color.white);
        JLabel timeLabel4 = new JLabel("Duración: " + movie4.getTimeMovie());
        timeLabel4.setForeground(Color.white);
        JLabel formatLabel4 = new JLabel("Formato: " + movie4.getMovieFormat().toString());
        formatLabel4.setForeground(Color.white);
        descriptionPanel4.add(nameLabel4);
        descriptionPanel4.add(timeLabel4);
        descriptionPanel4.add(formatLabel4);
        descriptionPanel4.setBackground(new Color(0,0,128));
        panel2.add(descriptionPanel4);

        Movie movie5 = new Movie();
        movie5.setNameMovies("Mario Bros");
        movie5.setTimeMovie("1h 42min");
        movie5.addMovieGenders(MovieGender.ACTION);
        movie5.addMovieFormat(MovieFormat.TWO_D);
        movie5.setIcon("/resources/animation/image5.jpg");

        ImageIcon image5 = new ImageIcon(getClass().getResource(movie5.getIcon().getDescription()));
        Image scaledImage5 = image5.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);
        JLabel label5 = new JLabel(scaledIcon5);
        panel2.add(label5);

        JPanel descriptionPanel5 = new JPanel();
        descriptionPanel5.setLayout(new GridLayout(3, 1));
        JLabel nameLabel5 = new JLabel(movie5.getNameMovies());
        nameLabel5.setForeground(Color.white);
        JLabel timeLabel5 = new JLabel("Duración: " + movie5.getTimeMovie());
        timeLabel5.setForeground(Color.white);
        JLabel formatLabel5 = new JLabel("Formato: " + movie5.getMovieFormat().toString());
        formatLabel5.setForeground(Color.white);
        descriptionPanel5.add(nameLabel5);
        descriptionPanel5.add(timeLabel5);
        descriptionPanel5.add(formatLabel5);
        descriptionPanel5.setBackground(new Color(0,0,128));
        panel2.add(descriptionPanel5);

        Movie movie6 = new Movie();
        movie6.setNameMovies("Pinocho");
        movie6.setTimeMovie("1h 42min");
        movie6.addMovieGenders(MovieGender.ACTION);
        movie6.addMovieFormat(MovieFormat.TWO_D);
        movie6.setIcon("/resources/animation/image6.jpg");

        ImageIcon image6 = new ImageIcon(getClass().getResource(movie6.getIcon().getDescription()));
        Image scaledImage6 = image6.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(scaledImage6);
        JLabel label6 = new JLabel(scaledIcon6);
        panel2.add(label6);

        JPanel descriptionPanel6 = new JPanel();
        descriptionPanel6.setLayout(new GridLayout(3, 1));
        JLabel nameLabel6 = new JLabel(movie6.getNameMovies());
        nameLabel6.setForeground(Color.white);
        JLabel timeLabel6 = new JLabel("Duración: " + movie6.getTimeMovie());
        timeLabel6.setForeground(Color.white);
        JLabel formatLabel6 = new JLabel("Formato: " + movie6.getMovieFormat().toString());
        formatLabel6.setForeground(Color.white);
        descriptionPanel6.add(nameLabel6);
        descriptionPanel6.add(timeLabel6);
        descriptionPanel6.add(formatLabel6);
        descriptionPanel6.setBackground(new Color(0,0,128));
        panel2.add(descriptionPanel6);

        panel2.setBackground(new Color(0, 0, 128));
        tabbedPane.addTab("ANIMACIÓN", panel2);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 3));

        Movie movie7 = new Movie();
        movie7.setNameMovies("La monja");
        movie7.setTimeMovie("1h 42min");
        movie7.addMovieGenders(MovieGender.ACTION);
        movie7.addMovieFormat(MovieFormat.TWO_D);
        movie7.setIcon("/resources/horror/image7.jpg");

        ImageIcon image7 = new ImageIcon(getClass().getResource(movie7.getIcon().getDescription()));
        Image scaledImage7 = image7.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon(scaledImage7);
        JLabel label7 = new JLabel(scaledIcon7);
        panel3.add(label7);

        JPanel descriptionPanel7= new JPanel();
        descriptionPanel7.setLayout(new GridLayout(3, 1));
        JLabel nameLabel7 = new JLabel(movie7.getNameMovies());
        nameLabel7.setForeground(Color.white);
        JLabel timeLabel7 = new JLabel("Duración: " + movie7.getTimeMovie());
        timeLabel7.setForeground(Color.white);
        JLabel formatLabel7 = new JLabel("Formato: " + movie7.getMovieFormat().toString());
        formatLabel7.setForeground(Color.white);
        descriptionPanel7.add(nameLabel7);
        descriptionPanel7.add(timeLabel7);
        descriptionPanel7.add(formatLabel7);
        descriptionPanel7.setBackground(new Color(0,0,128));
        panel3.add(descriptionPanel7);

        Movie movie8 = new Movie();
        movie8.setNameMovies("El exorcista del papa");
        movie8.setTimeMovie("1h 42min");
        movie8.addMovieGenders(MovieGender.ACTION);
        movie8.addMovieFormat(MovieFormat.TWO_D);
        movie8.setIcon("/resources/horror/image8.jpg");

        ImageIcon image8 = new ImageIcon(getClass().getResource(movie8.getIcon().getDescription()));
        Image scaledImage8 = image8.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8 = new ImageIcon(scaledImage8);
        JLabel label8 = new JLabel(scaledIcon8);
        panel3.add(label8);

        JPanel descriptionPanel8 = new JPanel();
        descriptionPanel8.setLayout(new GridLayout(3, 1));
        JLabel nameLabel8 = new JLabel(movie8.getNameMovies());
        nameLabel8.setForeground(Color.white);
        JLabel timeLabel8 = new JLabel("Duración: " + movie8.getTimeMovie());
        timeLabel8.setForeground(Color.white);
        JLabel formatLabel8 = new JLabel("Formato: " + movie8.getMovieFormat().toString());
        formatLabel8.setForeground(Color.white);
        descriptionPanel8.add(nameLabel8);
        descriptionPanel8.add(timeLabel8);
        descriptionPanel8.add(formatLabel8);
        descriptionPanel8.setBackground(new Color(0,0,128));
        panel3.add(descriptionPanel8);

        Movie movie9 = new Movie();
        movie9.setNameMovies("Winnie the Pooh, Sangre y Miel");
        movie9.setTimeMovie("1h 42min");
        movie9.addMovieGenders(MovieGender.ACTION);
        movie9.addMovieFormat(MovieFormat.TWO_D);
        movie9.setIcon("/resources/horror/image9.jpg");

        ImageIcon image9 = new ImageIcon(getClass().getResource(movie9.getIcon().getDescription()));
        Image scaledImage9 = image9.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon9 = new ImageIcon(scaledImage9);
        JLabel label9 = new JLabel(scaledIcon9);
        panel3.add(label9);

        JPanel descriptionPanel9 = new JPanel();
        descriptionPanel9.setLayout(new GridLayout(3, 1));
        JLabel nameLabel9 = new JLabel(movie9.getNameMovies());
        nameLabel9.setForeground(Color.white);
        JLabel timeLabel9 = new JLabel("Duración: " + movie9.getTimeMovie());
        timeLabel9.setForeground(Color.white);
        JLabel formatLabel9 = new JLabel("Formato: " + movie9.getMovieFormat().toString());
        formatLabel9.setForeground(Color.white);
        descriptionPanel9.add(nameLabel9);
        descriptionPanel9.add(timeLabel9);
        descriptionPanel9.add(formatLabel9);
        descriptionPanel9.setBackground(new Color(0,0,128));
        panel3.add(descriptionPanel9);

        panel3.setBackground(new Color(0, 0, 128));
        tabbedPane.addTab("HORROR", panel3);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(1, 3));

        Movie movie10 = new Movie();
        movie10.setNameMovies("Avatar");
        movie10.setTimeMovie("1h 42min");
        movie10.addMovieGenders(MovieGender.ACTION);
        movie10.addMovieFormat(MovieFormat.TWO_D);
        movie10.setIcon("/resources/sciencefiction/image10.jpg");

        ImageIcon image10 = new ImageIcon(getClass().getResource(movie10.getIcon().getDescription()));
        Image scaledImage10 = image10.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon10 = new ImageIcon(scaledImage10);
        JLabel label10 = new JLabel(scaledIcon10);
        panel4.add(label10);

        JPanel descriptionPanel10= new JPanel();
        descriptionPanel10.setLayout(new GridLayout(3, 1));
        JLabel nameLabel10= new JLabel(movie10.getNameMovies());
        nameLabel10.setForeground(Color.white);
        JLabel timeLabel10 = new JLabel("Duración: " + movie10.getTimeMovie());
        timeLabel10.setForeground(Color.white);
        JLabel formatLabel10 = new JLabel("Formato: " + movie10.getMovieFormat().toString());
        formatLabel10.setForeground(Color.white);
        descriptionPanel10.add(nameLabel10);
        descriptionPanel10.add(timeLabel10);
        descriptionPanel10.add(formatLabel10);
        descriptionPanel10.setBackground(new Color(0,0,128));
        panel4.add(descriptionPanel10);

        Movie movie11 = new Movie();
        movie11.setNameMovies("Guardianes de la Galaxia");
        movie11.setTimeMovie("1h 42min");
        movie11.addMovieGenders(MovieGender.ACTION);
        movie11.addMovieFormat(MovieFormat.TWO_D);
        movie11.setIcon("/resources/sciencefiction/image11.jpg");

        ImageIcon image11= new ImageIcon(getClass().getResource(movie11.getIcon().getDescription()));
        Image scaledImage11 = image11.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon11 = new ImageIcon(scaledImage11);
        JLabel label11 = new JLabel(scaledIcon11);
        panel4.add(label11);

        JPanel descriptionPanel11 = new JPanel();
        descriptionPanel11.setLayout(new GridLayout(3, 1));
        JLabel nameLabel11 = new JLabel(movie11.getNameMovies());
        nameLabel11.setForeground(Color.white);
        JLabel timeLabel11 = new JLabel("Duración: " + movie11.getTimeMovie());
        timeLabel11.setForeground(Color.white);
        JLabel formatLabel11 = new JLabel("Formato: " + movie11.getMovieFormat().toString());
        formatLabel11.setForeground(Color.white);
        descriptionPanel11.add(nameLabel11);
        descriptionPanel11.add(timeLabel11);
        descriptionPanel11.add(formatLabel11);
        descriptionPanel11.setBackground(new Color(0,0,128));
        panel4.add(descriptionPanel11);

        Movie movie12 = new Movie();
        movie12.setNameMovies("Todo en todas partes al mismo tiempo");
        movie12.setTimeMovie("1h 42min");
        movie12.addMovieGenders(MovieGender.ACTION);
        movie12.addMovieFormat(MovieFormat.TWO_D);
        movie12.setIcon("/resources/sciencefiction/image12.jpg");

        ImageIcon image12 = new ImageIcon(getClass().getResource(movie12.getIcon().getDescription()));
        Image scaledImage12 = image12.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon12 = new ImageIcon(scaledImage12);
        JLabel label12 = new JLabel(scaledIcon12);
        panel4.add(label12);

        JPanel descriptionPanel12 = new JPanel();
        descriptionPanel12.setLayout(new GridLayout(3, 1));
        JLabel nameLabel12= new JLabel(movie12.getNameMovies());
        nameLabel12.setForeground(Color.white);
        JLabel timeLabel12 = new JLabel("Duración: " + movie9.getTimeMovie());
        timeLabel12.setForeground(Color.white);
        JLabel formatLabel12 = new JLabel("Formato: " + movie9.getMovieFormat().toString());
        formatLabel12.setForeground(Color.white);
        descriptionPanel12.add(nameLabel12);
        descriptionPanel12.add(timeLabel12);
        descriptionPanel12.add(formatLabel12);
        descriptionPanel12.setBackground(new Color(0,0,128));
        panel4.add(descriptionPanel12);

        panel4.setBackground(new Color(0, 0, 128));
        tabbedPane.addTab("CIENCIA FICCIÓN", panel4);

    }

}