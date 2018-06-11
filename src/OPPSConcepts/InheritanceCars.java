package OPPSConcepts;

public class InheritanceCars {

	int speed;
	public InheritanceCars (int startSpeed) {
		
		speed = startSpeed;
	}
	

	public void increaseSpeed () {
		speed ++;
		System.out.println("Increasing speed of cars");
	
	}
	public void decreaseSpeed () {
		speed --;
		System.out.println("Decreasing speed of Cars");
	
	} 
}
