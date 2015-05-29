package com.app.view;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.app.connector.Connector;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		final TextField textField_username = new TextField();
		textField_username.setBounds(119, 97, 186, 22);
		add(textField_username);
		
		final JLabel label_newPassword = new JLabel("");
		label_newPassword.setBounds(170, 133, 237, 16);
		add(label_newPassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField_username.getText().isEmpty()) {
					
					String password = Connector.getLoginServiceInterface().register(textField_username.getText());
				
					// check if i retrieve a password
					if (!password.isEmpty()) {
						label_newPassword.setText(password);
					} else {
						label_newPassword.setText("Register failed!");
					}
				} else {
					label_newPassword.setText("Field is not filled!");
				}
			}
		});
		btnRegister.setBounds(192, 217, 117, 29);
		add(btnRegister);
	}
}
