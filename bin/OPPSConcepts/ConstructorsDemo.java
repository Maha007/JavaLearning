package OPPSConcepts;


public class ConstructorsDemo {

	public static void main(String[] args) {
	
		
		ConstructorsCars1 c2 = new ConstructorsCars1("Audi",90);
		System.out.println(c2.model);
		System.out.println(c2.speed);
		
		ConstructorsCars1 c1 = new ConstructorsCars1();
		System.out.println(c1.make);
	}
}