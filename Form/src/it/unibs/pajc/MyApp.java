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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Font;


public class MyApp {

	private JFrame frame;
	private JTextField userTextField;
	private JTextField passwdTextField;
	private String username = "pippo";
	private String password = "pluto";

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
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(20, 65, 100, 30);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(20, 110, 100, 30);
		frame.getContentPane().add(lblPassword);
		
		passwdTextField = new JPasswordField();
		((JPasswordField) passwdTextField).setEchoChar('*');
		passwdTextField.setColumns(10);
		passwdTextField.setBounds(130, 115, 241, 20);
		frame.getContentPane().add(passwdTextField);
		
		JButton btnLogin = new JButton("LOG IN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(userTextField.equals(username.toString()) && passwdTextField.equals(password.toString())) {
					JOptionPane.showMessageDialog(null, "Logged");
					
				}else JOptionPane.showMessageDialog(null, "Not valid.");
			}
		});
		btnLogin.setBounds(191, 166, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		userTextField = new JTextField();
		userTextField.setBounds(130, 70, 241, 20);
		frame.getContentPane().add(userTextField);
		userTextField.setColumns(10);
		
		JButton btnNewButton = new JButton("Esci");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnNewButton.setBounds(31, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ACCESS FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(170, 11, 124, 48);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
