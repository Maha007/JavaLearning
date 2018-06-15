package OPPSConcepts;

public class AbstractDemo {

   public static void main(String [] args) {
	   AbstractSalary s = new AbstractSalary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	   AbstractEmployee e = new AbstractSalary("John Adams", "Boston, MA", 2, 2400.00);
      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
      s.getSalary();
   }
}