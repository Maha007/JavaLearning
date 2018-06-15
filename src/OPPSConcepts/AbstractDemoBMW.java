package OPPSConcepts;

public class AbstractDemoBMW {



	public class AbstractDemoBMW extends AbstractCars {
		
		public vid setPrivateSpeed(int speed) {
			super.setPrivateSpeed(10);
		}	
	
		@Override
		public void engineStart(String keyType, int numOfCyl) {
			System.out.println("This is the BMW engine start");
			System.out.println("Every child class may have different implementation");
		}