package Interview;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {2,9,7,6,4,5,3};
		
		int b[] = new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "  ");
		}

	}

}
