package Array;

public class CountInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {20,1,4,9,7,6,3,5,8,11,45,78,3,61};
		int enevncount = 0;
		int oddcount =0;
		for (int i = 0; i < a.length; i++) {
						
			
			if (a[i]%2==0) {
				enevncount++;
			}else {
				oddcount++;
			}
			
		}
		
		System.out.println("Total eve number in gievn array is "+enevncount);
		System.out.println("Total odd number in gievn array is "+oddcount);
	}

}
