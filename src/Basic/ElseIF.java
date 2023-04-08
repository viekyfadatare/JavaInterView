package Basic;

import java.util.Scanner;

public class ElseIF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		int n = sc.nextInt();
		
		
		if(n%5==0 && n%3==0) {
			
		}else if(n%5==0) {
			System.out.println("Number divisible by 5");
		}else if(n%3==0) {
			System.out.println("Number divible by 3");
		}else {
			System.out.println("bye Bye"); 
		}

	}

}
