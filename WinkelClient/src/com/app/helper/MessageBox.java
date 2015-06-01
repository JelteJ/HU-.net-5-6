package com.app.helper;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class MessageBox {

	 static ImageIcon icon = null;
	
	 public static void showError(String message, String title) {
		 // sound
		 Toolkit.getDefaultToolkit().beep();
		 // set custom icon
		 icon = new ImageIcon(MessageBox.class.getResource("/images/notification_error.png"));
		 // popup
	     JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE, icon);
    }
	
	 public static void showInfo(String message, String title) {
		 // sound
		 Toolkit.getDefaultToolkit().beep();
		 // set custom icon
		 icon = new ImageIcon(MessageBox.class.getResource("/images/notification_search.png"));
		 // popup
	     JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE, icon);
	 }
	 
	 public static void showSuccess(String message, String title) {
		 // sound
		 Toolkit.getDefaultToolkit().beep();
		 // set custom icon
		 icon = new ImageIcon(MessageBox.class.getResource("/images/notification_done.png"));
		 // popup
	     JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE, icon);
	 }
	 
	 public static void showWarning(String message, String title) {
		 // sound
		 Toolkit.getDefaultToolkit().beep();
		 // set custom icon
		 icon = new ImageIcon(MessageBox.class.getResource("/images/notification_warning.png"));
		 // popup
	     JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE, icon);
	 }
	    
	 public static void showQuestion(String message, String title) {
		 // sound
		 Toolkit.getDefaultToolkit().beep();
		 // set custom icon
		 icon = new ImageIcon(MessageBox.class.getResource("/images/notification_search.png"));
		 // popup
	     JOptionPane.showMessageDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, icon);
	 }
	 
	 public static int showOkOrCancel(String message, String title) {
		 // sound
		 Toolkit.getDefaultToolkit().beep(); 
		 // set custom icon
		 icon = new ImageIcon(MessageBox.class.getResource("/images/notification_record.png"));
		
		 // popup
		 Object[] options = {"Ja", "Nee"};
		 int outPut = JOptionPane.showOptionDialog(null,
	                message,
	                title,
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE,
	                icon,
	                options,
	                options[0]);
		 
		 return outPut;
	 }
}




