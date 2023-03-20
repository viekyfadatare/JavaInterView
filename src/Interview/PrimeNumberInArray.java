package Interview;

public class PrimeNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,2,3,4,5,6,7,8,9,11,15,17};
		
		for (int i = 0; i < a.length; i++) {
			
			int n = 2 ;
			while(a[i]>0) {
				
				if(a[i]%n==0) {
					
					break;
				}
				
				n++;
			}
			if(n==a[i]) {  
				System.out.print(a[i]+" ");
			}
		}
		

	}

}
