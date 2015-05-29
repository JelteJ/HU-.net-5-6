package com.app.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class JLandingPane {

	private JFrame frame;
	private JPanel contentPanel;
	
	private JLogin loginPanel;
	private JRegister registerPanel;;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLandingPane window = new JLandingPane();
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
	public JLandingPane() {
		initialize();
	}
	
	private void cardPannel(JPanel addPanel) {
		// removing old pannel
		contentPanel.removeAll();
		contentPanel.repaint();
		contentPanel.revalidate();
		
		// adding new pannel
		contentPanel.add(addPanel);
		contentPanel.repaint();
		contentPanel.revalidate(); 
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 301);
		frame.setTitle("Winkel App");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDesktopPane desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JDesktopPane desktopPanel = new JDesktopPane();
		desktopPanel.setDragMode(1);
		desktopPanel.setBackground(SystemColor.window);
		desktopPanel.setBounds(0, 0, 219, 278);
		desktopPane.add(desktopPanel);
		desktopPanel.setLayout(null);
		
		JMenuBar menuBar_login = new JMenuBar();
		menuBar_login.setBounds(0, 0, 219, 40);
		desktopPanel.add(menuBar_login);
		
		JMenuItem item_login = new JMenuItem();
		item_login.setHorizontalAlignment(SwingConstants.LEFT);
		item_login.setSelected(true);
		item_login.setText("Login");
		item_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel = new JLogin();
				cardPannel(loginPanel);
			}
		});
		item_login.setRolloverEnabled(true);
		item_login.setIcon(new ImageIcon(JLandingPane.class.getResource("/images/add_icon.png")));
		menuBar_login.add(item_login);
		
		JMenuBar menuBar_register = new JMenuBar();
		menuBar_register.setBounds(0, 40, 219, 40);
		desktopPanel.add(menuBar_register);
		
		JMenuItem item_register = new JMenuItem();
		item_register.setHorizontalAlignment(SwingConstants.LEFT);
		item_register.setText("Register");
		item_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerPanel = new JRegister();
				cardPannel(registerPanel);
			}
		});
		item_register.setRolloverEnabled(true);
		item_register.setIcon(new ImageIcon(JLandingPane.class.getResource("/images/lock_icon.png")));
		menuBar_register.add(item_register);
		
		contentPanel = new JPanel();
		contentPanel.setBackground(UIManager.getColor("Desktop.background"));
		contentPanel.setBounds(220, 0, 352, 278);
		desktopPane.add(contentPanel);
		contentPanel.setLayout(new CardLayout(0, 0));
	}
}
