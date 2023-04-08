package Basic;

public class MethodREcussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MethodOne(1); 	
	
	}

	
	public static void MethodOne(int a ) {
		
		System.out.println(a); 
		a++;
		
		if(a<=100) {
			MethodOne(a);
		}else {
		
		System.out.println("This Excecuion is done"); 
		}
	}
}
