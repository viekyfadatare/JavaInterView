package Interview;

public class PolidromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,3,121,698,33,44,787,258852,151,1514,5,1,15,521};
		
		for (int i = 0; i < a.length; i++) {
			
			int rev = 0;
			int n = a[i];
			while(n!=0) {
				
				int digit = n%10;
				rev = rev*10 + digit;
				n = n/10;
			}
			if (rev== a[i] && a[i]>10) {
				System.out.print(a[i]+" ");
			}
			
		}

	}

}
