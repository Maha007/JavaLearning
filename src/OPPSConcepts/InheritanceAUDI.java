package OPPSConcepts;

public class InheritanceAUDI extends InheritanceCars{
	
	public InheritanceAUDI (int startspeed) {
		super(startspeed);
		
	}

	@Override
	public void increaseSpeed() {
		
	
	System.out.println("Increasing speed of AUDI");
	
	}

	@Override
	public void decreaseSpeed() {
		// TODO Auto-generated method stub
		super.decreaseSpeed();
	}
	
	public void DisplayNavigation ( ) {
		
		
		System.out.println("Specific Fucnationality to Audi");
	}

	
	

	
	}
	
	
	

