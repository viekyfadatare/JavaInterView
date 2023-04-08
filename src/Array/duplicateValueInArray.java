package Array;

public class duplicateValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5, 1, 4, 7, 9, 6, 3, 5, 8, 4, 8, 1, 3, 6, 9 };
		
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = 0; j < a.length; j++) {
				
				if (a[i] == a[j] && i != j) {
					count++;
					a[j] = 0;
				}
			}

			
			if (count > 1 && a[i] != 0) {
				System.out.println(a[i] + " is duplicate value in given Array");
			}
		}
		
	}

}
