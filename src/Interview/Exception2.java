package Interview;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     try{    
             int a[]=new int[5];    
             
             System.out.println(a[10]);  
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
	}

}
