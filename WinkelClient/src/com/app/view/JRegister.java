package com.app.view;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JRegister extends JPanel {

	public JRegister() {
		setLayout(null);
		
		JLabel lblYourNewPassword = new JLabel("Your new password:");
		lblYourNewPassword.setBounds(28, 133, 133, 16);
		add(lblYourNewPassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(28, 97, 92, 16);
		add(lblUsername);
		
		JLabel lblAddAccountInformation = new JLabel("Create new account");
		lblAddAccountInformation.setBounds(95, 19, 210, 16);
		add(lblAddAccountInformation);
		
		TextField textField_username = new TextField();
		textField_username.setBounds(119, 97, 186, 22);
		add(textField_username);
		
		JLabel label_newPassword = new JLabel("");
		label_newPassword.setBounds(170, 133, 237, 16);
		add(label_newPassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(192, 217, 117, 29);
		add(btnRegister);
	}
}
