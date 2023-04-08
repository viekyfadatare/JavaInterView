package Basic;

import java.util.Scanner;

public class SwitchToCase {

	public static void main(String[] args) {
		
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Entere the number to get day in weeek ");  
		
		
		int day = sc.nextInt();
		
		switch (day) {
		case 1 :
			System.out.println("Monday"); 
			break;
			
		case 2 :
			System.out.println("Tuie"); 
			break;
			
		case 3 :
			System.out.println("WEn"); 
			break;
			
		case 4 :
			System.out.println("Thir"); 
			break;
			
		case 5 :
			System.out.println("fri"); 
			break;
		case 6 :
			System.out.println("SAt"); 
			break;
		case 7 :
			System.out.println("Sun"); 
			break;
	}
	}
}
