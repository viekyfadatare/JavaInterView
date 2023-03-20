package Interview;

public class ReadAndWriteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 47, 88, 9, 1, 4, 2, 5, 7, 11 };

		for (int i = 0; i < a.length; i++) {

			int n = 2;

			while (n <= a[i]) {

				if (a[i] % n == 0) {

					break;

				}
				n++;
			}
			if (n == a[i]) {
				System.out.print(a[i]+" ");
			}

		}

	}

}
