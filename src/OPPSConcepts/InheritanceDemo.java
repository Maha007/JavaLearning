package OPPSConcepts;

public class InheritanceDemo {
	public static void main(String [] args){
		
		 //** Class which inherited from the parent class. But parent class cannot use subclass method.
		int speed = 0;
	
		InheritanceCars c1 =  new InheritanceCars(speed);
		c1.increaseSpeed();

		
		InheritanceAUDI Audi1 = new InheritanceAUDI(speed);
		Audi1.increaseSpeed();
		
		InheritanceAUDI Audi2 = new InheritanceAUDI(speed);
		Audi2.decreaseSpeed();
		Audi2.DisplayNavigation();
	}
 
	
	
}
