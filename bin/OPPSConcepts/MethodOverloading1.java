package OPPSConcepts;

//Three ways to achieve method overloading
//1. Different Number of parameters in arguments list
//2. Difference in data type of arguments
//3. Difference is sequence of data type of arguments


public class MethodOverloading1 {
	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight(8, true);
		increaseSeatHeight("2");
		increaseSeatHeight("2", 2);
		increaseSeatHeight(8, "8");

	}
	
	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increased seat height by " + heightToIncrease + " inches");
	}
	
/**Different Number of parameters in arguments list **/

	public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight) {
		System.out.println("Increased seat height by " + heightToIncrease + " inches");
		if (rememberHeight) {
			System.out.println("Your selection is saved");
		} else {
			System.out.println("Your selection is not saved");
		}
	} 

/**Difference in data type of arguments**/
	
		public static void increaseSeatHeight(String heightToIncrease1) {
			System.out.println("Increased seat height by " + heightToIncrease1 + " inches. I am the String one.");
		}

 /** Sequence of data type of arguments **/	   
		
			public static void increaseSeatHeight(String variable1, int variable2) {
				System.out.println("I am the 1st overload.");
			}
			public static void increaseSeatHeight(int variable2, String variable1) {
				System.out.println("I am the 2nd overload.");
			}
		}
		
	


