package Package1;

public class AccessModifiersCars {
	// No Modifier - Variables or objects accessible in the same package
	int speed;
	// private - Only in class . 
	
	private int privateSpeed;
	
	// public-Anywhere in Java World with importing the package and class
	public int publicSpeed;
	
	// Protected- In same package and in sub classes
	protected int protectedSpeed;
	
	int speedLimit = 100 ;
	
	public AccessModifiersCars () {
		this(0);
	}
	
	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}

	public AccessModifiersCars (int startSpeed) {
		this.privateSpeed = startSpeed;
	}
		
	public void increaseSpeed() {
		if (speed < 100) {
			speed++;
		}
		System.out.println("Increasing Speed of Cars ");
	}
	
	protected void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of Cars");
	}
}

