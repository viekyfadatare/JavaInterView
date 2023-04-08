package Array;

public class DuplicateANDTriplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 15, 13, 11, 47, 11, 10, 11, 15 };

		NumCount(a, a.length);
	}

	public static void NumCount(int arr[], int n) {

		boolean bool[] = new boolean[n];
		
		System.out.println("Duplicate Value");
		
		for (int i = 0; i < n; i++) {
			if (bool[i] == true) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < n; j++) {

				if (arr[i] == arr[j]) {
					bool[j] = true;
					count++;
				}
			}

			if (count > 1) {
				System.out.println(arr[i] + " " + count);
			}
		}

	}
}
