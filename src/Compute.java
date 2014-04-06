/**Compute function*/
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
		else if(signal == "Sin") {
			number1 = Math.sin(Math.toRadians(number2));
		}
		else if(signal == "Cos") {
			number1 = Math.cos(Math.toRadians(number2));
		}
		else if(signal == "Tan") {
			number1 = Math.tan(Math.toRadians(number2));
		}
		else if(signal == "Log") {
			number1 = Math.log10(number2);
		} 
		else if(signal == "Order") {
			number1 = factorial((int)number1);
		}
			
		
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
	
	public static long factorial(int n) {
		if(n == 0)
			return 1;
		else
			return n * factorial(n -1);
	}
}
