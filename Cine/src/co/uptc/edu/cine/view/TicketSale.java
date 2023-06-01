package co.uptc.edu.cine.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TicketSale {
    private ActionListener actionListener;

    private JFrame ticketsFrame;
    private JPanel ticketsPanel;
    private JLabel titleLabel;

    private Font mainFont;
    private Color mainColor;
    private ImageIcon mainIcon;

    public TicketSale(ActionListener actionListener) {
        this.actionListener = actionListener;

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

        sellTickets();

        ticketsFrame.setVisible(true);
    }

    public void sellTickets(){
        ticketsPanel = new JPanel();
        ticketsPanel.setLayout(null);
        ticketsPanel.setBackground(mainColor);

        titleLabel = new JLabel("Vender Entradas");
        titleLabel.setFont(mainFont);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(200, 50, 400, 50);
        ticketsPanel.add(titleLabel);

        

        ticketsFrame.add(ticketsPanel);
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

    public static void main(String[] args) {
        new TicketSale(null);
    }
}
