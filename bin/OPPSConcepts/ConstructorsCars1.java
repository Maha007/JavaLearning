package OPPSConcepts;


public class ConstructorsCars1 {
	
	int speed;
	int make;
	String model ;
	
	// Constructors 

	public ConstructorsCars1( String model, int speed) {
		this.speed = speed;
		this.model= model;
		System.out.println("Executing constructor with arguments");
	}
	
		public ConstructorsCars1() {
			make = 1900;
			System.out.println("Executing constructor without arguments");
		}
		
	}
	
	

