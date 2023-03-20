package Interview;

public class PrimeAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2, 3, 4, 5, 6, 7 ,11,13,78,45,62,20};

		for (int i = 0; i < a.length; i++) {
			int n = 2;

			while (n <= a[i]) {

				if (a[i] % n == 0) {
					break;
				}
				n++;

			}
			
			if (n == a[i]) {
			System.out.print(a[i] + " ");
			}

		}

	}

}
