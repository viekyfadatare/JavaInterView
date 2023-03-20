package Interview;

public class SumOfEvenProDuctOfODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,3,4,6,5,2,7,8,9,5,4,12,13,26};
		
		int sum = 0;
		int prod = 1;
		
		for (int i = 0; i < a.length; i++) {

			if(a[i]%2==1) {
				sum = sum+a[i];
			}else {
				prod = prod*a[i];
			}
		}
		
		System.out.println("Sum of Even Number is === "+sum);
		System.out.println("Product os ODD Number is === "+prod);

	}

}
