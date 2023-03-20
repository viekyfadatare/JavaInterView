package Interview;

import java.util.Scanner;

public class UserCreatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter he Size of An Array");

		int size = sc.nextInt();

		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter the " + i + "th" + " Index Value");

			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + "  ");

		}

	}

}
