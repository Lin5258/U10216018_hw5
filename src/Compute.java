
public class Compute {
	double number1 = 0;
	double number2 = 0;
	String signal;
	
	public double caculate() {
		if(signal == "Plus")
			number1 = number1 + number2;
		else if(signal == "Minus")
			number1 = number1 - number2;
		else if(signal == "Times")
			number1 = number1 * number2;
		else if(signal == "Divided")
			number1 = number1 / number2;
		else if(signal == "Power")
			number1 = Math.pow(number1, number2);
		
		return number1;
	}
	
	public void setNumber1(double n1) {
		number1 = n1;
	}
	
	public void setNumber2(double n2) {
		number2 = n2;
	}
	
	public void setSignal(String s) {
		signal = s;
	}
	
	public double getNumber1() {
		return number1;
	}
	
	public double getNumber2() {
		return number2;
	}
	
	public String getSignal() {
		return signal;
	}
}
