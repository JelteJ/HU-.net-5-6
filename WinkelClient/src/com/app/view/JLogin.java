package com.app.view;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.app.connector.Connector;

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
		
		final TextField textField_username = new TextField();
		textField_username.setBounds(119, 97, 186, 22);
		add(textField_username);
		
		final TextField textField_password = new TextField();
		textField_password.setBounds(119, 130, 186, 22);
		add(textField_password);
		
		final JLabel label_error = new JLabel("");
		label_error.setBounds(119, 168, 186, 16);
		add(label_error);
		
		JButton button_login = new JButton("Login");
		button_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField_username.getText().isEmpty() && !textField_password.getText().isEmpty()) {
					// login by client
					boolean login = Connector.getLoginServiceInterface().login(textField_username.getText(), textField_password.getText());
					
					// check if login succesfully
					if (login) {
						// open new panel
						JProduct productPanel = new JProduct();
						JLandingPane.setMenuBarsVisible(true);
						JLandingPane.cardPannel(productPanel);
					} else {
						label_error.setText("Login failed!");
					}
				} else {
					label_error.setText("Fields are not filled!");
				}
			}
		});
		button_login.setBounds(192, 217, 117, 29);
		add(button_login);
	}
}
