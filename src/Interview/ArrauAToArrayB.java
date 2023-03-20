package Interview;

public class ArrauAToArrayB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 6, 7, 98, 1, 2, 6, 7, 2, 8, 25, 10 };

		int b[] = new int[a.length];

		for (int i = 0; i < b.length; i++) {

			b[i] = a[i];
		}

		System.out.println("array of b");
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");
		}
	}

}
