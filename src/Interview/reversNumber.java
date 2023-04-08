package Interview;

public class reversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int r  ;
		int temp = 0;
		
		while (num > 0) {
			 r = num % 10;
			temp = temp*10 + r;
			num = num/10;
		}

		System.out.println(temp);
	}

}
