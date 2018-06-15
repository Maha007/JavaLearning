package Package1;

public class RunTimeException {

   public static void main(String args[]) {
      int a[] = new int[2];
 //   System.out.println("Access element three :" + a[3]);
      try {
    	 // System.out.println ("1st line");
         System.out.println("Access element three :" + a[3]);
      } 
      catch (ArrayIndexOutOfBoundsException e) {
   	  e.printStackTrace();
    	  System.out.println(e.getMessage());
        System.out.println("Exception thrown  :" + e);
      }finally {
         a[0] = 6;
         System.out.println("First element value: " + a[0]);
         System.out.println("The finally statement is executed");
      }
   }
   
}