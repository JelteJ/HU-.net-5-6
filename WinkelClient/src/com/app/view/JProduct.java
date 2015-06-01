package com.app.view;

import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import org.datacontract.schemas._2004._07.winkelservice.Product;

import com.app.connector.Connector;
import com.app.helper.MessageBox;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JProduct extends JPanel {
	
	private JLabel label_balance;
	private DefaultListModel<String> model = new DefaultListModel<String>();
	
	private void addProducts() {
		model.clear();
		
		for (Product p : Connector.getProductServiceInterface().getAllProducts().getProduct()) {
			model.addElement("ID: " + p.getId() + " || " + p.getName() + ", €" + p.getPrice() + ", Stock:" + p.getStock());
		}
	}
	
	public JProduct() {
		setLayout(null);
		
		JLabel lblProductOverview = new JLabel("Product overview");
		lblProductOverview.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProductOverview.setBounds(207, 11, 135, 16);
		add(lblProductOverview);
		
		JLabel lblProducten = new JLabel("Producten");
		lblProducten.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblProducten.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblProducten.setBounds(10, 211, 310, -174);
		add(lblProducten);
		
		// add products onload
		addProducts();
		
		final JList<String> productList = new JList<String>(model);
		
		productList.setBackground(SystemColor.window);
		productList.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// show question
				int choise = MessageBox.showOkOrCancel("Do you realy want to buy this product?" , "Buy product");
				
				// yes, i want to buy
				if (choise == 0) {
					String selected = productList.getSelectedValue().toString();
					String[] details = selected.split(" ");
					
					try {
						int productId = Integer.parseInt(details[1]);
						
						// buy product
						if (Connector.getLogisticsServiceInterface().buyProduct(productId, 1, JLandingPane.getUs(), JLandingPane.getPass())) {
							// succes
							MessageBox.showSuccess("You bought the product!", "Successfully bought");
							
							// set new balance
							label_balance = new JLabel("My balance: " + Connector.getLogisticsServiceInterface().getBalance(JLandingPane.getUs(), JLandingPane.getPass()));
						} else {
							// oops 
							MessageBox.showError("You didn't bought the product! Check your saldo and try again.", "Unsuccessful bought!");
						}
					} catch (NumberFormatException exception) {
						System.err.println(exception);
					}
				}
			}
		});
		productList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		productList.setToolTipText("Selecteer product");
		productList.setBounds(13, 38, 329, 197);
		add(productList);
		
		JButton btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addProducts();
			}
		});
		btnReload.setBounds(253, 244, 89, 23);
		add(btnReload);
		
		label_balance = new JLabel("My balance: " + Connector.getLogisticsServiceInterface().getBalance(JLandingPane.getUs(), JLandingPane.getPass()));
		label_balance.setBounds(10, 12, 165, 14);
		add(label_balance);
	}
}
