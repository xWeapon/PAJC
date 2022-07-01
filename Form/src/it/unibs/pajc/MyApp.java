package it.unibs.pajc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class MyApp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp window = new MyApp();
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
	public MyApp() {
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
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(20, 37, 100, 30);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(20, 94, 100, 30);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblstatus = new JLabel("--");
		lblstatus.setBounds(229, 179, 142, 30);
		frame.getContentPane().add(lblstatus);
		
		textField_1 = new JPasswordField();
		((JPasswordField) textField_1).setEchoChar('*');
		textField_1.setColumns(10);
		textField_1.setBounds(130, 99, 241, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnLogin = new JButton("LOG IN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblstatus.setText(textField_1.getText());
			}
		});
		btnLogin.setBounds(130, 183, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(130, 42, 241, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblstatus.setText("--");
			}
		});
		btnClear.setBounds(130, 217, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnNewButton = new JButton("Esci");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnNewButton.setBounds(284, 217, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
