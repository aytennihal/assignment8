package assignment8;

import java.util.Scanner;

public class question1 {
	
	public static void main(String[] args) {
		
        plus();
		
	}
	public static void plus() {

	Scanner sc = new Scanner (System.in);

	System.out.println("Enter first number:");
	int num1 = sc.nextInt();
	
	System.out.println("Enter second number");
	int num2=sc.nextInt();

	
	int plustwonumber=num1+num2;
	System.out.println("Result: " +  plustwonumber);
}
}