package Interview;

public class EvenOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a [] = {1,2,3,4,6,7,8,9,10};
		
		int sum = 0;
		int prod = 1;
		
		for (int i = 0; i < a.length; i++) {
			
			if(i%2==0 && i>0) {
				
		sum = sum+a[i];
			}else {
				prod = prod*a[i];
			}
		}
		
		
		System.out.println("Sum of even index value is  =====  " +sum );
		
		System.out.println("Product of odd index value is === "+prod);
	}

}
