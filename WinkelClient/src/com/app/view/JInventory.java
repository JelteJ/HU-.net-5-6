package com.app.view;

import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import org.datacontract.schemas._2004._07.winkelservice.BoughtProduct;
import org.datacontract.schemas._2004._07.winkelservice.Product;

import com.app.connector.Connector;

@SuppressWarnings("serial")
public class JInventory extends JPanel {
	
	private JLabel lblMonyLeft;
	private DefaultListModel<String> model = new DefaultListModel<String>();
	
	public JInventory() {
		setLayout(null);
		
		JLabel lblProductOverview = new JLabel("Product inventory");
		lblProductOverview.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProductOverview.setBounds(207, 11, 135, 16);
		add(lblProductOverview);
		
		JLabel lblProducten = new JLabel("Producten");
		lblProducten.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblProducten.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblProducten.setBounds(10, 211, 310, -174);
		add(lblProducten);
		
		// add products onload
		for (BoughtProduct b : Connector.getLogisticsServiceInterface().getBoughtProducts(JLandingPane.getUs(), JLandingPane.getPass()).getBoughtProduct()) {
			Product product = Connector.getProductServiceInterface().getProductById(b.getProductId());
			model.addElement(product.getName() + ", €" + product.getPrice() + ", op " + b.getDateBought().getDay() + "-" + b.getDateBought().getMonth() + "-" + b.getDateBought().getYear());
		}
		
		final JList<String> productList = new JList<String>(model);
		
		productList.setBackground(SystemColor.window);
		productList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		productList.setBounds(13, 38, 329, 197);
		add(productList);
		
		lblMonyLeft = new JLabel("Money left: " + Connector.getLogisticsServiceInterface().getBalance(JLandingPane.getUs(), JLandingPane.getPass()));
		lblMonyLeft.setBounds(10, 12, 165, 14);
		add(lblMonyLeft);
	}
}
