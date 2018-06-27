package JavaLearning;

public class TryCatchFinal{


	   public static void main(String args[])
	   {
		int x = 0;
		int y = 10;
		// int i = y/x; 
		
       try {
		 int i = y/x; 
		   System.out.println("Inside try block");		
          }

          catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Warning: ArrayIndexOutOfBoundsException");
         }
        catch ( ArithmeticException e) {
	       e.printStackTrace();
	       System.out.println("Warning: ArithmeticException");		 	 
         } 

           catch ( Exception e) {
	         // System.out.println("Exception occurred");		 	 
	       }
		
		 finally {
			 
			 System. out. println( "finally always executes") ;			 
			 System. out. println( "Print i :" +y/10) ;    
	     
		   }
	      }
		
		
}
	   

