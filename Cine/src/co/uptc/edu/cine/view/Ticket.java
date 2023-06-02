package co.uptc.edu.cine.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ticket extends JFrame {

    private JPanel contentPane;
    private JLabel lblNameMovie;
    private JLabel lblNumeroSala;
    private JLabel lblFormate;
    private JLabel lblCantidad;
    private JLabel lblDurationpelicula;
    private JLabel lblUbicacion;
    private JLabel lblDate;
    private JLabel lblDate_1;
    private JLabel lblTotal_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ticket frame = new Ticket();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Ticket() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        setBounds(0, 0, 300, 683);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 266, 624);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Sala:");
        lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblNewLabel.setBounds(10, 60, 57, 28);
        panel.add(lblNewLabel);

        JLabel lblUsuario = new JLabel("Formato:");
        lblUsuario.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblUsuario.setBounds(10, 114, 75, 28);
        panel.add(lblUsuario);

        JLabel lblId = new JLabel("Cantidad:");
        lblId.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblId.setBounds(10, 286, 75, 28);
        panel.add(lblId);

        JLabel lblDuracion = new JLabel("Duracion:");
        lblDuracion.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblDuracion.setBounds(10, 167, 75, 28);
        panel.add(lblDuracion);

        JLabel lblAsiento = new JLabel("Asiento:");
        lblAsiento.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblAsiento.setBounds(10, 228, 75, 28);
        panel.add(lblAsiento);

        JLabel lblFechaVenta = new JLabel("Fecha Reproduccion");
        lblFechaVenta.setHorizontalAlignment(SwingConstants.CENTER);
        lblFechaVenta.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblFechaVenta.setBounds(10, 367, 227, 28);
        panel.add(lblFechaVenta);

        JLabel lblFechaVenta_1 = new JLabel("Fecha Venta");
        lblFechaVenta_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblFechaVenta_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblFechaVenta_1.setBounds(10, 459, 227, 28);
        panel.add(lblFechaVenta_1);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblTotal.setBounds(10, 537, 75, 28);
        panel.add(lblTotal);

        lblNameMovie = new JLabel("Nombre Pelicula");
        lblNameMovie.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblNameMovie.setHorizontalAlignment(SwingConstants.CENTER);
        lblNameMovie.setBounds(10, 11, 227, 28);
        panel.add(lblNameMovie);

        lblNumeroSala = new JLabel("Numero sala");
        lblNumeroSala.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblNumeroSala.setBounds(107, 60, 130, 28);
        panel.add(lblNumeroSala);

        lblFormate = new JLabel("Formato");
        lblFormate.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblFormate.setBounds(107, 114, 130, 28);
        panel.add(lblFormate);

        lblCantidad = new JLabel("Cantidad");
        lblCantidad.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblCantidad.setBounds(107, 286, 130, 28);
        panel.add(lblCantidad);

        lblDurationpelicula = new JLabel("DurationMovie");
        lblDurationpelicula.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblDurationpelicula.setBounds(107, 167, 130, 28);
        panel.add(lblDurationpelicula);

        lblUbicacion = new JLabel("Ubicacion");
        lblUbicacion.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblUbicacion.setBounds(107, 228, 130, 28);
        panel.add(lblUbicacion);

        lblDate = new JLabel("Date");
        lblDate.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblDate.setBounds(10, 420, 246, 28);
        panel.add(lblDate);

        lblDate_1 = new JLabel("Date");
        lblDate_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblDate_1.setBounds(10, 498, 246, 28);
        panel.add(lblDate_1);

        lblTotal_2 = new JLabel("Total");
        lblTotal_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
        lblTotal_2.setBounds(107, 537, 130, 28);
        panel.add(lblTotal_2);

        JButton btnValidate = new JButton("Aceptar");
        btnValidate.setBounds(52, 585, 108, 28);
        btnValidate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisibleFrame();
            }

        });
        panel.add(btnValidate);
    }

    private void setVisibleFrame() {
        this.setVisible(false);
    }

    public void generateTicket(String nameMovie, int numeroSala, String formate, int cantidad, String durationPelicula,
            String ubication, String dateSale, String datFunction, int total) {
        lblNameMovie.setText(nameMovie);
        lblNumeroSala.setText("" + numeroSala);
        lblFormate.setText(formate);
        lblCantidad.setText("" + cantidad);
        lblDurationpelicula.setText(durationPelicula);
        lblUbicacion.setText(ubication);
        lblDate.setText(dateSale);
        lblDate_1.setText(datFunction);
        lblTotal_2.setText(total + "");
        this.repaint();
    }
}