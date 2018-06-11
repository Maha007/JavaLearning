package OPPSConcepts;


public class Constructors {

	public static void main(String[] args) {
		
		Cars1 c1 = new Cars1();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
	
		Cars1 c2 = new Cars1(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}
}