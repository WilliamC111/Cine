package co.uptc.edu.cine.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DeleteWindow extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JButton btnDelete;

	public DeleteWindow(ActionListener listener) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 143);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		comboBox = new JComboBox<>();
		comboBox.setBounds(44, 11, 180, 33);
		contentPane.add(comboBox);

		btnDelete = new JButton("Eliminar");
		btnDelete.setBounds(77, 62, 100, 33);
		btnDelete.setActionCommand("Delete movie");
		btnDelete.addActionListener(listener);
		contentPane.add(btnDelete);
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

}
