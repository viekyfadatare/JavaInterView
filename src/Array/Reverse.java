package Array;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {5,9,7,1,4,3,5};
		
		int rev [] = new int[a.length];
		
		for (int i = a.length-1,j=0; i >=0; i--,j++) {
			
			rev[j]=a[i];
		}
		
		for (int i = 0; i < rev.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
