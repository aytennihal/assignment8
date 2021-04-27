package assignment8;

public class question12 {

	public static void main(String[] args) {
		
		hamletQuote(false, false);
		
	}
	
	public static void hamletQuote(boolean num1, boolean num2) {
		
		boolean flag = true;
		
		if (num1 == true|| num2 == true) {
			flag = true;
		} else {
			flag = false;
		}
		System.out.println(flag);
	}
}
