package Interview;

import java.util.ArrayList;

public class ExceptionHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		int a = 10;

		int b = 0;

		ArrayList<Integer>  lst =new ArrayList<Integer>();
		
		
		
		System.out.println("Start");
		

		try {
			System.out.println(a / b);

			System.out.println(lst.get(1));

		} 
		catch (ArithmeticException  e) {

			System.out.println("maga it is not possible to divide by 0");
			
		
		}catch (IndexOutOfBoundsException e1) {
			
			System.out.println("IndexOutOf box exception");
			
		}catch (Exception e2) {
			
		}

	
			System.out.println("End");
		
	}
	}


