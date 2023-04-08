package Array;

import java.util.Iterator;

public class MinANDMax {

	public static void main(String[] args) {

		int a[] = {12,20,3,19,2,4,5,6,4,8,6,12,45,12,36,25,7,32};
		
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			
			if (max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Maximum value in in given array is "+ max);
		
		int min = max;
				for (int i = 0; i < a.length; i++) {
					if (min>a[i]) {
						min = a[i];
					}
				}
		
				System.out.println("Minimun value in gien array is "+ min);
	}

}
