package assignment8;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
		
            sign(0);
	}
	
	public static int sign(int number) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number: ");
		int index = sc.nextInt();
	
		
	    if (index<0) {
		System.out.println("-1");
		
	   }else if (index>0); {
		   System.out.println("1");
		   
	  	return number;
	   
			   

	   }
}
}