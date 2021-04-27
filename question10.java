package assignment8;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		
               isEven();
			
	}
	
	public static void  isEven() {
		
				Scanner sc = new Scanner(System.in);

		System.out.println("Enter an number: ");
		int number = sc.nextInt();
		
			boolean flag = true;
		
		
		for(int i = 0; i>1; i++) {
			
			if(i % 2 == 0) {
			  flag = true;
			  break;
			  
			}else {
				flag= false;
	}
	

	
	}
		
         System.out.println(flag);
	}
}