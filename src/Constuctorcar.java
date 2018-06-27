package JavaLearning;

public class Constuctorcar {
	 int c= 2;
	 String  b1 ="BMW";
	 
	
	public Constuctorcar ( ) {		
	System.out.println("Constructor without arguments: " +b1);
	System.out.println("Print b1 : " +b1);
}
	
	public Constuctorcar ( String b1, int c) {
				
		this.b1 = b1;
		 this.c= c;
}
	
} 

