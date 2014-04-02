import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


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
	}
	
	public class RegisterListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
	/**public static void main(String[] args) {
		Register frame = new Register();
		frame.setTitle("Register");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}*/
}
