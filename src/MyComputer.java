
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class MyComputer extends JFrame {
	JTextField t1 = new JTextField();
	JLabel l1 = new JLabel();
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn0 = new JButton("0");
	JButton btn00 = new JButton("00");
	JButton btnEqual = new JButton("=");
	JButton btnPlus = new JButton("+");
	JButton btnMinus = new JButton("-");
	JButton btnTimes = new JButton("*");
	JButton btnDivided = new JButton("/");
	JButton btnSin = new JButton("Sin");
	JButton btnCos = new JButton("Cos");
	JButton btnTan = new JButton("Tan");
	JButton btnLog = new JButton("Log");
	JButton btnPower = new JButton("^");
	JButton btnOrder = new JButton("!");
	JButton btnC = new JButton("C");
	JButton btnDelete = new JButton("<--");
	JButton btnDot = new JButton(".");
	
	Compute c = new Compute();
	
	
	MyComputer() {
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		setLayout(layout);
		//Font f1 = new Font("SansSerif", Font.BOLD, 16);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(5, 3));
		p1.setPreferredSize(new Dimension(200, 225));
		p1.add(btn7);
		p1.add(btn8);
		p1.add(btn9);
		p1.add(btn4);
		p1.add(btn5);
		p1.add(btn6);
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn0);
		p1.add(btn00);
		p1.add(btnEqual);
		p1.add(btnC);
		p1.add(btnDelete);
		p1.add(btnDot);

		JPanel p2 = new JPanel(new GridLayout(5, 2));
		p2.setPreferredSize(new Dimension(120, 225));
		p2.add(btnPlus);
		p2.add(btnSin);
		p2.add(btnMinus);
		p2.add(btnCos);
		p2.add(btnTimes);
		p2.add(btnTan);
		p2.add(btnDivided);
		p2.add(btnLog);
		p2.add(btnPower);
		p2.add(btnOrder);
		
		JPanel p3 = new JPanel(new GridLayout(2, 1));
		t1.setBackground(Color.WHITE);
		t1.setPreferredSize(new Dimension(180, 35));
		t1.setHorizontalAlignment(JTextField.RIGHT);
		l1.setBackground(Color.WHITE);
		l1.setPreferredSize(new Dimension(180, 35));
		l1.setHorizontalAlignment(JLabel.RIGHT);
		p3.add(l1);
		p3.add(t1);
		
		
		JPanel p4 = new JPanel(new BorderLayout());
		p4.add(p3, BorderLayout.NORTH);
		p4.add(p1, BorderLayout.CENTER);
		p4.add(p2, BorderLayout.EAST);
		
		add(p4);
		
		NumberListener numberListener = new NumberListener();
		btn1.addActionListener(numberListener);
		btn2.addActionListener(numberListener);
		btn3.addActionListener(numberListener);
		btn4.addActionListener(numberListener);
		btn5.addActionListener(numberListener);
		btn6.addActionListener(numberListener);
		btn7.addActionListener(numberListener);
		btn8.addActionListener(numberListener);
		btn9 .addActionListener(numberListener);
		btn0 .addActionListener(numberListener);
		btn00 .addActionListener(numberListener);
		btnC.addActionListener(numberListener);
		btnDelete.addActionListener(numberListener);
		btnDot.addActionListener(numberListener);
		
		SignalListener signalListener = new SignalListener();
		btnPlus.addActionListener(signalListener);
		btnMinus.addActionListener(signalListener);
		btnTimes.addActionListener(signalListener);
		btnDivided.addActionListener(signalListener);
		btnEqual.addActionListener(signalListener);
		
		SpecialListener specialListener = new SpecialListener();
		btnPower.addActionListener(specialListener);
	}
	
	public class NumberListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn1) {
				t1.setText(t1.getText() + "1");
				l1.setText(l1.getText() + "1");
			} else if(e.getSource() == btn2) {
				t1.setText(t1.getText() + "2"); 
				l1.setText(l1.getText() + "2");
			} else if(e.getSource() == btn3) {
				t1.setText(t1.getText() + "3");
				l1.setText(l1.getText() + "3");
			} else if(e.getSource() == btn4) {
				t1.setText(t1.getText() + "4");
				l1.setText(l1.getText() + "4");
			} else if(e.getSource() == btn5) {
				t1.setText(t1.getText() + "5");
				l1.setText(l1.getText() + "5");
			} else if(e.getSource() == btn6) {
				t1.setText(t1.getText() + "6");
				l1.setText(l1.getText() + "6");
			} else if(e.getSource() == btn7) {
				t1.setText(t1.getText() + "7");
				l1.setText(l1.getText() + "7");
			} else if(e.getSource() == btn8) {
				t1.setText(t1.getText() + "8");
				l1.setText(l1.getText() + "8");
			} else if(e.getSource() == btn9) {
				t1.setText(t1.getText() + "9");
				l1.setText(l1.getText() + "9");
			} else if(e.getSource() == btn0) {
				t1.setText(t1.getText() + "0");
				l1.setText(l1.getText() + "0");
			} else if(e.getSource() == btn00) {
				t1.setText(t1.getText() + "00");
				l1.setText(l1.getText() + "00");
			} else if(e.getSource() == btnDelete) {
				//l1.setText(l1.getText() - t1.getText());
				t1.setText(null);
			} else if(e.getSource() == btnDot) {
				t1.setText(t1.getText() + ".");
				l1.setText(l1.getText() + ".");
			} else if(e.getSource() == btnC) {
				t1.setText(null);
				l1.setText(null);
				c.setNumber1(0);
				c.setNumber2(0);
			}
		}
	}
	
	public class SignalListener implements ActionListener {
		double number;
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnPlus) {
				number = Double.parseDouble(t1.getText());
				t1.setText(null);
				l1.setText(l1.getText() + " + ");
				if(c.number1 == 0)
					c.setNumber1(number);
				else {
					c.setNumber2(number);
					c.setNumber1(c.caculate());
				} 
				c.setSignal("Plus");				
			} else if (e.getSource() == btnMinus) {
				number = Double.parseDouble(t1.getText());
				t1.setText(null);
				l1.setText(l1.getText() + " - ");
				if(c.number1 == 0)
					c.setNumber1(number);
				else {
					c.setNumber2(number);
					c.setNumber1(c.caculate());
				} 
				c.setSignal("Minus");
			} else if (e.getSource() == btnTimes) {
				number = Double.parseDouble(t1.getText());
				t1.setText(null);
				l1.setText("(" +l1.getText() + ")" + " * ");
				if(c.number1 == 0)
					c.setNumber1(number);
				else {
					c.setNumber2(number);
					c.setNumber1(c.caculate());
				} 
				c.setSignal("Times");
			} else if (e.getSource() == btnDivided) {
				number = Double.parseDouble(t1.getText());
				t1.setText(null);
				l1.setText("(" + l1.getText() + ")" + " / ");
				if(c.number1 == 0)
					c.setNumber1(number);
				else {
					c.setNumber2(number);
					c.setNumber1(c.caculate());
				} 
				c.setSignal("Divided");
			} else if (e.getSource() == btnEqual) {
				number = Double.parseDouble(t1.getText());
				t1.setText(null);
				l1.setText(l1.getText() + " = ");
				if(c.number1 == 0)
					c.setNumber1(number);
				else {
					c.setNumber2(number);
					c.setNumber1(c.caculate());
				} 
				t1.setText(""+ c.getNumber1());
				l1.setText(l1.getText() + c.getNumber1());
				c.setNumber1(0);
			}
			
		}
		
	}
	
	public class SpecialListener implements ActionListener {
		double number;
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnPower) {
				number = Double.parseDouble(t1.getText());
				t1.setText(null);
				if(c.number1 == 0)
					c.setNumber1(number);
				else {
					c.setNumber2(number);
					c.setNumber1(c.caculate());
				}
				c.setSignal("Power");
			}
		}
	}

	public static void main(String[] args) {
		MyComputer frame = new MyComputer();
		frame.setTitle("Computer");
		frame.pack();
		//frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
