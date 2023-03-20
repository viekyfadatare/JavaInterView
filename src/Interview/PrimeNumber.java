package Interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to chaeck Its Prime Or Not");
		int i = sc.nextInt();
		
		int n = 2;
		
		while(n<=i) {
			
			if(i%n==0) {
				
				break;
			}
			n++;
			
		}
		if(n==i) {
			System.out.println("Ya its Prime Number");
		}else {
			System.out.println("Its Not prime ");
		}

	}

}
