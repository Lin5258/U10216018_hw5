import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.io.*;

/**Build register.*/
public class Register extends JFrame {
	JLabel l1 = new JLabel("Account");
	JLabel l2 = new JLabel("Password");
	JLabel l3 = new JLabel("Email");
	JTextField t1 = new JTextField(15);
	JTextField t2 = new JTextField(15);
	JTextField t3 = new JTextField(15);
	JButton btn1 = new JButton("Create");
	JButton btn2 = new JButton("Cancel");
	
	Register() {
		//Set layout manager.
		GridLayout layout = new GridLayout(4, 2);
		setLayout(layout);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(btn1);
		add(btn2);
		
		//Create listener.
		RegisterListener registerListener = new RegisterListener();
		btn1.addActionListener(registerListener);
		
		CancelListener cancelListener = new CancelListener();
		btn2.addActionListener(cancelListener);
	}
	
	public class RegisterListener implements ActionListener {
		java.io.File file = new java.io.File("Account.txt");
		@Override
		public void actionPerformed(ActionEvent e) {
			//Let user can create account and record users account and password.
			try {
				FileWriter output = new FileWriter(file, true);
				output.write(t1.getText() + " ");
				output.write(t2.getText() + " "); 
				output.write(t3.getText() + " ");
				AccountAndPassword.setRegister();
				output.close();
			}catch(Exception ex) {
				
			}
		}
	}
	
	public class CancelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			btn1.setText(null);
			btn2.setText(null);
			AccountAndPassword.setRegister();
		}
	}
}
