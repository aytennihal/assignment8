package assignment8;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		
	  next3number();
		
	}
	
	public static void next3number() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		
	  int next1 = num+1 ;
	  int next2 = num+2;
	  int next3 = num+3;
	  
	  System.out.println("Next 3 are " + next1 +" "+ next2 +" "+ next3);
		
	}
}
