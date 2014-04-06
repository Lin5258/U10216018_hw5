import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.lang.*;
/**Let user can sign up and sign in.*/
public class AccountAndPassword extends JFrame {
	static AccountAndPassword frame2 = new AccountAndPassword(); //Construct AccountAndPassword.
	static Register frame3 = new Register();					 //Construct Register.
	JLabel l1 = new JLabel("Account ");
	JLabel l2 = new JLabel("Password");
	JTextField t1 = new JTextField(10);
	JPasswordField t2 = new JPasswordField(10);
	JButton btn1 = new JButton("Sign in");
	JButton btn2 = new JButton("Sign up");
	
	
	AccountAndPassword() {
		//Set layout manager.
		FlowLayout layout = new FlowLayout(FlowLayout.RIGHT, 10, 10);
		setLayout(layout);
		t2.setEchoChar('*');
		//Set label color.
		l1.setForeground(Color.BLUE);
		l2.setForeground(Color.BLUE);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(btn1);
		add(btn2);
		
		//Create listener.
		AccountListener accountListener = new AccountListener();
		btn1.addActionListener(accountListener);
		
		//when user press sign up button display register frame.
		btn2.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				frame3.setTitle("Register");
				frame3.pack();
				frame3.setLocationRelativeTo(null);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setVisible(true);	
			}
			
		}				
		);
	}
	
	public class AccountListener implements ActionListener  {
		java.io.File file = new java.io.File("Account.txt");
		@Override
		public void actionPerformed (ActionEvent e) {
			//Check account and password.
			String Account = t1.getText();
			String Password = t2.getText();
			boolean isAccount = false;
			try {
				Scanner input = new Scanner(file);
				while(input.hasNext()) {
					String Acc = input.next();
					String Pas = input.next();
					String email = input.next();
					if (Account.equals(Acc) && Password.equals(Pas)) {
						
						isAccount = true;
						break;
					}
				}
				input.close();
			} catch (FileNotFoundException e1) {
				
			}
			//if is correct then display computer frame.
			if(isAccount) {
				MyComputer frame = new MyComputer();
				frame.setTitle("Computer");
				frame.pack();
				//frame.setSize(300, 300);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame2.setVisible(false);
			}
		}	
	}
	
	public static void setRegister() {
		frame3.setVisible(false);
	}
	
	public static void main(String[] args)  {	
		//AccountAndPassword frame2 = new AccountAndPassword();
		frame2.setTitle("SIGN IN");
		frame2.setSize(210, 150);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
	}
}
