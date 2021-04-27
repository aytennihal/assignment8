package assignment8;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		cube();
	}
	
	
    public static void cube() {
    	
		Scanner sc = new Scanner(System.in);

    	
    	System.out.println("Please enter a number: ");
		int num1 = sc.nextInt();
		
		int output = num1*num1*num1;
		
		System.out.println("The cubed value of this number is: " + output);
		
    }
    
    
}
