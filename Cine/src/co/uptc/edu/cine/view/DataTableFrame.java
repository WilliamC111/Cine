package co.uptc.edu.cine.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class DataTableFrame extends JFrame {
    private JTable dataTable;
    private DefaultTableModel model;

    public DataTableFrame(ActionListener listener) {
        setTitle("Datos de compra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 378);
        setLocationRelativeTo(null);

        String[] columnNames = { "Película", "Hora de compra", "Total" };
        model = new DefaultTableModel(columnNames, 0);
        getContentPane().setLayout(null);
        dataTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(dataTable);
        scrollPane.setBounds(0, 0, 386, 298);
        getContentPane().add(scrollPane);

        JButton btnNewButton = new JButton("Aceptar");
        btnNewButton.setBounds(130, 309, 89, 23);
        btnNewButton.setActionCommand("Validate");
        btnNewButton.addActionListener(listener);
        getContentPane().add(btnNewButton);
    }

    public void agregarFila(String movieName, String purchaseTime, double total) {
        Object[] rowData = { movieName, purchaseTime, total };
        model.addRow(rowData);
    }
}
