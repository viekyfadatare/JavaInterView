package Interview;

import java.util.LinkedHashSet;

public class DuplicateWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a [] = {1,4,9,5,7,6,2,4,6,8,1,3,4,4,4,1,1,6,6,6};
		
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		
		
		for (int i = 0; i < a.length; i++) {
			lh.add(a[i]);
		}
		
		for (Integer in : lh) {
		
			int count = 0;
			
			for (int i = 0; i < a.length; i++) {
				if(in==a[i]) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.print(in+" ");
			}
		}
	}

}
