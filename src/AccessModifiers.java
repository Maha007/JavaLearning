package JavaLearning;

public class AccessModifiers {

		int speed =60;	
		private int privateSpeed= 70;
		public int publicSpeed =80;
		protected int protectedSpeed =100;
		static int staticspeed = 90;
		public static void main (String[] args) {
		
			System.out.println("Increasing Speed of Cars");
			carwheels () ;
			System.out.println("staticspeed: " + staticspeed );
			AccessModifiers A1 = new AccessModifiers();
			A1.decreaseSpeed();
			System.out.println("protectedSpeed: " +A1.protectedSpeed);
			System.out.println("privateSpeed: " +A1.privateSpeed);
			System.out.println("speed :" +A1.speed);
			System.out.println("publicSpeed :" +A1.publicSpeed);
			
		}
		
		protected void decreaseSpeed() {
			
			System.out.println("Decreasing Speed of Cars");
		}
		
    static  void carwheels() {
			
			System.out.println("Car wheels -Static");
		}
	}
	


