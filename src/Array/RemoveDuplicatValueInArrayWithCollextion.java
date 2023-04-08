package Array;

import java.util.LinkedHashSet;

public class RemoveDuplicatValueInArrayWithCollextion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 15, 13, 11, 47, 11, 10, 11, 15 };
		
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			lh.add(a[i]);
		}
			
		
		for (Integer inte : lh) {
			
			System.out.println(inte);
		}
		
	}

}
