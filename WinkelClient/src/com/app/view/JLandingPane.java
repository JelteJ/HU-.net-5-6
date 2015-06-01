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
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class JLandingPane {

	private JFrame frame;
	private static JPanel contentPanel;
	
	private JLogin loginPanel;
	private JProduct productPanel;
	private JInventory inventoryPanel;
	private JRegister registerPanel;
	
	private static JMenuItem item_login;
	private static JMenuItem item_register;
	private static JMenuItem item_product;
	private static JMenuItem item_inventory;
	
	// mag eigenlijk niet :p
	private static String pass, us;
	public static String getPass() {return pass;}
	public static String getUs() {return us;}
	public static void setPass(String usPass) {pass = usPass;}
	public static void setUs(String usUs) {us = usUs;}
	
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
		setMenuBarsVisible(false);
	}
	
	public static void setMenuBarsVisible(boolean enableMenuItem) {
		// when logged in enableMenuItem will be true
		if (enableMenuItem) {
			item_login.setEnabled(false);
			item_register.setEnabled(false);
			item_product.setEnabled(true);
			item_inventory.setEnabled(true);
		} 
	}
	
	public static void cardPannel(JPanel addPanel) {
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
		frame.setBackground(SystemColor.window);
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 572, 301);
		frame.setTitle("Winkel App");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.window);
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
		
		item_login = new JMenuItem();
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
		
		item_register = new JMenuItem();
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
		
		JMenuBar menuBar_products = new JMenuBar();
		menuBar_products.setBounds(0, 80, 219, 40);
		desktopPanel.add(menuBar_products);
		
		item_product = new JMenuItem();
		item_product.setEnabled(false);
		item_product.setHorizontalAlignment(SwingConstants.LEFT);
		item_product.setText("Product");
		item_product.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productPanel = new JProduct();
				cardPannel(productPanel);
			}
		});
		item_product.setRolloverEnabled(true);
		item_product.setIcon(null);
		menuBar_products.add(item_product);
		
		JMenuBar menuBar_inventory = new JMenuBar();
		menuBar_inventory.setBounds(0, 120, 219, 40);
		desktopPanel.add(menuBar_inventory);
		
		item_inventory = new JMenuItem();
		item_inventory.setEnabled(false);
		item_inventory.setHorizontalAlignment(SwingConstants.LEFT);
		item_inventory.setText("Inventory");
		item_inventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryPanel = new JInventory();
				cardPannel(inventoryPanel);
			}
		});
		item_inventory.setRolloverEnabled(true);
		item_inventory.setIcon(null);
		menuBar_inventory.add(item_inventory);
		
		contentPanel = new JPanel();
		contentPanel.setBackground(SystemColor.window);
		contentPanel.setBounds(220, 0, 352, 278);
		desktopPane.add(contentPanel);
		contentPanel.setLayout(new CardLayout(0, 0));
	}
}
