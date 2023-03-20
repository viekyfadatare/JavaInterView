package Interview;

import java.util.Scanner;

public class GetIndexFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {12,45,7,8,16,59,16,68,96};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value from given array to get index of that array");
		
		int n = sc.nextInt();
		
		for (int i = 0; i < a.length; i++) {
		if(n == a[i]) {
			System.out.println(i);
		}
		}

	}

}
