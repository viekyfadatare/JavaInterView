package Array;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {8,1,7,9,3,4,6,2};
		
		//System.out.println(a.length);
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]>a[j]) {
					
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");  
		}
		
	}

}
