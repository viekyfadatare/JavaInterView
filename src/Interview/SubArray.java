package Interview;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 1+5+9 = 15

		int count = 0;
		for (int i = 0; i < a.length; i++) {

			int b[] = a[i];
			if (i == 0)
				count = b.length - 1;

			for (int j = 0; j < b.length; j++) {

				if (j == count) {

					System.out.println(b[j]);

					count--;

				}

			}
		}

	}

}
