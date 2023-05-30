package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ImageViewer {
    private JFrame frame;
    private JTabbedPane tabbedPane;
    private int imageWidth = 200;
    private int imageHeight = 300;

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
        ImageIcon image1 = new ImageIcon(getClass().getResource("/resources/action/image1.jpg"));
        Image scaledImage1 = image1.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(scaledImage1);
        JLabel label1 = new JLabel(scaledIcon1);
        panel1.add(label1);
        panel1.setBackground(new Color(42, 42, 42));

        ImageIcon image2 = new ImageIcon(getClass().getResource("/resources/action/image2.jpg"));
        Image scaledImage2 = image2.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
        JLabel label2 = new JLabel(scaledIcon2);
        panel1.add(label2);

        ImageIcon image3 = new ImageIcon(getClass().getResource("/resources/action/image3.jpg"));
        Image scaledImage3 = image3.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(scaledImage3);
        JLabel label3 = new JLabel(scaledIcon3);
        panel1.add(label3);

        tabbedPane.addTab("Acción", panel1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 3));
        ImageIcon image4 = new ImageIcon(getClass().getResource("/resources/sciencefiction/image10.jpg"));
        Image scaledImage4 = image4.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(scaledImage4);
        JLabel label4 = new JLabel(scaledIcon4);
        panel2.add(label4);
        panel2.setBackground(new Color(42, 42, 42));

        ImageIcon image5 = new ImageIcon(getClass().getResource("/resources/sciencefiction/image11.jpg"));
        Image scaledImage5 = image5.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(scaledImage5);
        JLabel label5 = new JLabel(scaledIcon5);
        panel2.add(label5);

        ImageIcon image6 = new ImageIcon(getClass().getResource("/resources/sciencefiction/image12.jpg"));
        Image scaledImage6 = image6.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon(scaledImage6);
        JLabel label6 = new JLabel(scaledIcon6);
        panel2.add(label6);

        tabbedPane.addTab("Ciencia Ficción", panel2);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 3));
        ImageIcon image7 = new ImageIcon(getClass().getResource("/resources/animation/image4.jpg"));
        Image scaledImage7 = image7.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon(scaledImage7);
        JLabel label7 = new JLabel(scaledIcon7);
        panel3.add(label7);
        panel3.setBackground(new Color(42, 42, 42));

        ImageIcon image8 = new ImageIcon(getClass().getResource("/resources/animation/image5.jpg"));
        Image scaledImage8 = image8.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8 = new ImageIcon(scaledImage8);
        JLabel label8 = new JLabel(scaledIcon8);
        panel3.add(label8);

        ImageIcon image9 = new ImageIcon(getClass().getResource("/resources/animation/image6.jpg"));
        Image scaledImage9 = image9.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon9 = new ImageIcon(scaledImage9);
        JLabel label9 = new JLabel(scaledIcon9);
        panel3.add(label9);

        tabbedPane.addTab("Animación", panel3);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(1, 3));
        ImageIcon image10 = new ImageIcon(getClass().getResource("/resources/horror/image7.jpg"));
        Image scaledImage10 = image10.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon10 = new ImageIcon(scaledImage10);
        JLabel label10 = new JLabel(scaledIcon10);
        panel4.add(label10);
        panel4.setBackground(new Color(42, 42, 42));

        ImageIcon image11 = new ImageIcon(getClass().getResource("/resources/horror/image8.jpg"));
        Image scaledImage11 = image11.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon11 = new ImageIcon(scaledImage11);
        JLabel label11 = new JLabel(scaledIcon11);
        panel4.add(label11);

        ImageIcon image12 = new ImageIcon(getClass().getResource("/resources/horror/image9.jpg"));
        Image scaledImage12 = image12.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon12 = new ImageIcon(scaledImage12);
        JLabel label12 = new JLabel(scaledIcon12);
        panel4.add(label12);

        tabbedPane.addTab("Terror", panel4);
    }

    public static void main(String[] args) {
        new ImageViewer();
    }
}

