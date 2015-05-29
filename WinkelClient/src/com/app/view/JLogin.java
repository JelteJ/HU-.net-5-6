package com.app.view;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JLogin extends JPanel {

	public JLogin() {
		setLayout(null);
		
		JLabel label_pass = new JLabel("Password:");
		label_pass.setBounds(28, 133, 92, 16);
		add(label_pass);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(28, 97, 92, 16);
		add(lblUsername);
		
		JLabel lblAddAccountInformation = new JLabel("Add account information");
		lblAddAccountInformation.setBounds(95, 19, 210, 16);
		add(lblAddAccountInformation);
		
		TextField textField_username = new TextField();
		textField_username.setBounds(119, 97, 186, 22);
		add(textField_username);
		
		TextField textField_password = new TextField();
		textField_password.setBounds(119, 130, 186, 22);
		add(textField_password);
		
		JLabel label_error = new JLabel("");
		label_error.setBounds(119, 168, 186, 16);
		add(label_error);
		
		JButton button_login = new JButton("Login");
		button_login.setBounds(192, 217, 117, 29);
		add(button_login);
	}
}
