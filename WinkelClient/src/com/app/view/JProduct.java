package com.app.view;

import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import org.datacontract.schemas._2004._07.winkelservice.Product;

import com.app.connector.Connector;


@SuppressWarnings("serial")
public class JProduct extends JPanel {

	private JPanel productPanel;
//	private static DefaultListModel<String> listModel = new DefaultListModel<String>();
//	
//	public static void addElementsToList() {
//		
//		List<Product> productsList = Connector.getProductServiceInterface().getAllProducts().getProduct(); 
//		
//		if (productsList.size() > 0) {
//			for (Product product : productsList) {
//				listModel.addElement(product.getName() + "  -  " + product.getPrice() + "  -  " + product.getStock());
//			}
//		}
//	}
	
	public JProduct() {
		setLayout(null);
		
		JLabel label_alleProducten = new JLabel("Alle producten");
		label_alleProducten.setBounds(237, 11, 83, 16);
		add(label_alleProducten);
		
		JLabel lblProducten = new JLabel("Producten");
		lblProducten.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblProducten.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblProducten.setBounds(167, 211, 153, -79);
		add(lblProducten);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		
		final JList<String> productList = new JList<String>(model);
		
		for (Product p : Connector.getProductServiceInterface().getAllProducts().getProduct()) {
			model.addElement(p.getName() + ", €" + p.getPrice() + ", Stock:" + p.getStock());
		}
		
		productList.setBackground(SystemColor.window);
		productList.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String selected = productList.getSelectedValue().toString();
				
				System.out.println(selected);
			}
		});
		productList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		productList.setToolTipText("Selecteer product");
		productList.setBounds(13, 38, 307, 226);
		add(productList);
		
		
		
	}
}
