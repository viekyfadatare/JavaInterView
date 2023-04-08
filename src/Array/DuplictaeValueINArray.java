package Array;

public class DuplictaeValueINArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 4, 9, 5, 7, 6, 2, 4, 6, 8, 1, 3, 4, 4, 1, 1, 6, 6 };

		for (int i = 0; i < a.length; i++) {
			int count = 1;

			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {

			 		count++;
					a[j] = 0;
				}
			}
			if (count > 1 && a[i] != 0) {
				System.out.println(a[i] + " is nduplicate value ");
			}
		}

	}

}
