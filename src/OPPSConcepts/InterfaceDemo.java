package OPPSConcepts;


public class InterfaceDemo implements InterfaceCars {

	
	
	@Override
	public void engineStart(String engineType, boolean iskeyLess) {
		// TODO Auto-generated method stub
		System.out.println(" This is Implementation");
		System.out.println("engineType: "+engineType );
		System.out.println ("IskeyLess: "+iskeyLess);
		
		
	}
	
	}