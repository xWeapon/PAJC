package it.unibs.pajc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFCombo {

	private JFrame frame;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFCombo window = new JFCombo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JFCombo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox cB01 = new JComboBox();
		cB01.setBounds(209, 103, 144, 22);
		frame.getContentPane().add(cB01);
		cB01.addItem("");
		cB01.addItem("Leone");
		cB01.addItem("Tigre");
		cB01.addItem("Pantera");
		
		JButton btnCarica = new JButton("Select");
		btnCarica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cB01.getSelectedIndex()<1) {
					JOptionPane.showMessageDialog(null, "Non hai selezionato niente...");
				}
				else {
					JOptionPane.showMessageDialog(null,  cB01.getSelectedItem().toString());
				}
			}
		});
		btnCarica.setBounds(72, 103, 89, 23);
		frame.getContentPane().add(btnCarica);
		
		btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnNewButton.setBounds(72, 137, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}