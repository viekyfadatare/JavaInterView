package Interview;

import java.util.Scanner;

public class IndextValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,5,96,4,5,1,1,6,1,5,58,14,6};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the vlaue to get index of that value in Array");
		
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(n==a[i]) {
				count++;
				
			}

		}
		System.out.println(count);
		
		
	}

}
