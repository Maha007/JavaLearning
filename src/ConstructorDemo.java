package JavaLearning;
public class ConstructorDemo {
 
	public static void main (String [] args ) {
		
	Constuctorcar a1 = new Constuctorcar() ;
	
	
	Constuctorcar a2 = new Constuctorcar("Audi", 3) ;
	{		
		System.out.println("Constructor with Arguments");	
		System.out.println("Print b : " +a2.b1 );
		System.out.println("  Print c: " +a2.c );
		
			
	}
	
}

}