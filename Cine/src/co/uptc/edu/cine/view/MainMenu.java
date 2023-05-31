package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;


import javax.swing.*;

public class MainMenu {
    ActionListener actionListener;

    private Font mainFont;
    private Color mainColor;
    private ImageIcon mainIcon;

    private JFrame mainFrame;
    private JPanel mainPanel;
    private JLabel titleLabel, loginLabel, userLabel, passwordLabel;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton loginButton, addButton,billBoardButton, saleButton, historyButton;
    private ImageViewer imageViewer;
    private AddMovieMenu addMovieMenu;

    public MainMenu(ActionListener actionListener) {
        this.actionListener = actionListener;

        mainFont = new Font("Arial", Font.BOLD, 50);
        mainColor = new Color(0, 0, 128);
        mainIcon = new ImageIcon("Cine/Cine/src/resources/Icons/Logo.png");

        mainFrame = new JFrame();
        mainFrame.setTitle("Cine");
        mainFrame.setSize(800, 600);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setIconImage(mainIcon.getImage());

        InitialMenu();

        mainFrame.setVisible(true);
    }

    public void InitialMenu() {
        mainPanel = new JPanel();
        mainPanel.setBackground(mainColor);
        mainPanel.setLayout(new GridBagLayout());

        titleLabel = new JLabel("Bienvenido");
        titleLabel.setFont(mainFont);
        titleLabel.setForeground(Color.WHITE);
        GridBagConstraints titleConstraints = new GridBagConstraints();
        titleConstraints.gridx = 0;
        titleConstraints.gridy = 0;
        titleConstraints.gridwidth = 0;
        titleConstraints.anchor = GridBagConstraints.NORTH;
        titleConstraints.insets.bottom = 75;
        mainPanel.add(titleLabel, titleConstraints);

        userLabel = new JLabel("UserName:");
        userLabel.setFont(new Font("Arial", Font.BOLD, 30));
        userLabel.setForeground(Color.WHITE);
        GridBagConstraints userLabelConstraints = new GridBagConstraints();
        userLabelConstraints.gridx = 0;
        userLabelConstraints.gridy = 1;
        userLabelConstraints.anchor = GridBagConstraints.LINE_END;
        userLabelConstraints.insets.left = 20;
        userLabelConstraints.insets.bottom = 75;
        mainPanel.add(userLabel, userLabelConstraints);

        userText = new JTextField(20);
        userText.setFont(new Font("Arial", 0, 20));
        userText.setForeground(Color.BLACK);
        GridBagConstraints userTextConstraints = new GridBagConstraints();
        userTextConstraints.gridx = 1;
        userTextConstraints.gridy = 1;
        userTextConstraints.anchor = GridBagConstraints.LINE_START;
        userTextConstraints.insets.right = 20;
        userTextConstraints.insets.bottom = 75;
        mainPanel.add(userText, userTextConstraints);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 30));
        passwordLabel.setForeground(Color.WHITE);
        GridBagConstraints passwordLabelConstraints = new GridBagConstraints();
        passwordLabelConstraints.gridx = 0;
        passwordLabelConstraints.gridy = 2;
        passwordLabelConstraints.anchor = GridBagConstraints.LINE_END;
        passwordLabelConstraints.insets.left = 20;
        passwordLabelConstraints.insets.bottom = 75;
        mainPanel.add(passwordLabel, passwordLabelConstraints);

        passwordText = new JPasswordField(20);
        passwordText.setFont(new Font("Arial", 0, 20));
        passwordText.setForeground(Color.BLACK);
        GridBagConstraints passwordTextConstraints = new GridBagConstraints();
        passwordTextConstraints.gridx = 1;
        passwordTextConstraints.gridy = 2;
        passwordTextConstraints.anchor = GridBagConstraints.LINE_START;
        passwordTextConstraints.insets.right = 20;
        passwordTextConstraints.insets.bottom = 75;
        mainPanel.add(passwordText, passwordTextConstraints);

        loginButton = new JButton("Iniciar sesión");
        loginButton.setFont(new Font("Arial", Font.BOLD, 30));
        loginButton.setForeground(mainColor);
        loginButton.setBackground(Color.WHITE);
        loginButton.setFocusPainted(false);
        GridBagConstraints loginButtonConstraints = new GridBagConstraints();
        loginButtonConstraints.gridx = 0;
        loginButtonConstraints.gridy = 3;
        loginButtonConstraints.gridwidth = 2;
        loginButtonConstraints.anchor = GridBagConstraints.CENTER;
        loginButtonConstraints.insets.top = 20;
        loginButton.addActionListener(actionListener);
        mainPanel.add(loginButton, loginButtonConstraints);

        mainFrame.setContentPane(mainPanel);
    }

    public void mainMenu() {
        mainFrame = new JFrame();
        mainFrame.setTitle("Menu principal");
        mainFrame.setSize(800, 600);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setIconImage(mainIcon.getImage());

        mainPanel = new JPanel();
        mainPanel.setBackground(mainColor);
        mainPanel.setLayout(new GridBagLayout());

        titleLabel = new JLabel("Cinema");
        titleLabel.setFont(mainFont);
        titleLabel.setForeground(Color.WHITE);
        GridBagConstraints titleConstraints = new GridBagConstraints();
        titleConstraints.gridx = 0;
        titleConstraints.gridy = 0;
        titleConstraints.gridwidth = 0;
        titleConstraints.anchor = GridBagConstraints.NORTH;
        titleConstraints.insets.bottom = 75;
        mainPanel.add(titleLabel, titleConstraints);

        addButton = new JButton("Agregar Película");
        addButton.setFont(new Font("Arial", Font.BOLD, 30));
        addButton.setForeground(mainColor);
        addButton.setBackground(Color.WHITE);
        addButton.setFocusPainted(false);
        GridBagConstraints addButtonConstraints = new GridBagConstraints();
        addButtonConstraints.gridx = 0;
        addButtonConstraints.gridy = 1;
        addButtonConstraints.gridwidth = 0;
        addButtonConstraints.anchor = GridBagConstraints.CENTER;
        addButtonConstraints.insets.bottom = 20;
        addButton.addActionListener(actionListener);
        mainPanel.add(addButton, addButtonConstraints);

        billBoardButton = new JButton("Cartelera");
        billBoardButton.setFont(new Font("Arial", Font.BOLD, 30));
        billBoardButton.setForeground(mainColor);
        billBoardButton.setBackground(Color.WHITE);
        billBoardButton.setFocusPainted(false);
        GridBagConstraints billBoardButtonConstraints = new GridBagConstraints();
        billBoardButtonConstraints.gridx = 0;
        billBoardButtonConstraints.gridy = 2;
        billBoardButtonConstraints.gridwidth = 0;
        billBoardButtonConstraints.anchor = GridBagConstraints.CENTER;
        billBoardButtonConstraints.insets.bottom = 20;
        mainPanel.add(billBoardButton, billBoardButtonConstraints);

        saleButton = new JButton("Venta de Boletas");
        saleButton.setFont(new Font("Arial", Font.BOLD, 30));
        saleButton.setForeground(mainColor);
        saleButton.setBackground(Color.WHITE);
        saleButton.setFocusPainted(false);
        GridBagConstraints saleButtonConstraints = new GridBagConstraints();
        saleButtonConstraints.gridx = 0;
        saleButtonConstraints.gridy = 3;
        saleButtonConstraints.gridwidth = 0;
        saleButtonConstraints.anchor = GridBagConstraints.CENTER;
        saleButtonConstraints.insets.bottom = 20;
        mainPanel.add(saleButton, saleButtonConstraints);

        historyButton = new JButton("Historial de Ventas");
        historyButton.setFont(new Font("Arial", Font.BOLD, 30));
        historyButton.setForeground(mainColor);
        historyButton.setBackground(Color.WHITE);
        historyButton.setFocusPainted(false);
        GridBagConstraints historyButtonConstraints = new GridBagConstraints();
        historyButtonConstraints.gridx = 0;
        historyButtonConstraints.gridy = 4;
        historyButtonConstraints.gridwidth = 0;
        historyButtonConstraints.anchor = GridBagConstraints.CENTER;
        historyButtonConstraints.insets.bottom = 20;
        mainPanel.add(historyButton, historyButtonConstraints);

        mainFrame.setContentPane(mainPanel);
        mainFrame.setVisible(true);
    }

    public void addMovieMenu() {
        addMovieMenu = new AddMovieMenu(actionListener);
    }

    public void viewMovieLists(){
        imageViewer = new ImageViewer();
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public AddMovieMenu getAddMovieMenu() {
        return  this.addMovieMenu;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public JLabel getLoginLabel() {
        return loginLabel;
    }

    public JLabel getUserLabel() {
        return userLabel;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public JTextField getUserText() {
        return userText;
    }

    public JPasswordField getPasswordText() {
        return passwordText;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getAddButton() {
        return addButton;
    }
    
     public JButton getBillBoardButton(){
     return billBoardButton;
    }
    public JButton getSaleButton() {
        return saleButton;
    }

    public JButton getHistoryButton() {
        return historyButton;
    }
}
