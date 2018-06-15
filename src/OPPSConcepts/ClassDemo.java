package OPPSConcepts;

public class ClassDemo {

		public static void main(String[] args) {
			//Creating the object of CarClass
			// keyword new : Create and initialize the object
			ClassCar Audi = new ClassCar (); 
			Audi.setMake("Audi");
			System.out.println("Make of Audi is: " + Audi.getMake());
			
			System.out.println("Model of Audi is: " + Audi.getModel());
			
			ClassCar  Honda= new ClassCar ();
			Honda.setMake("Honda");
			System.out.println("Make of Honda is: " + Honda.getMake());
			
			Honda.setModel("Accord");
			System.out.println("Model of Honda is: " + Honda.getModel());
			
			Honda.setYear(1900);
			System.out.println("Year of Honda is: " + Honda.getYear());
			
		}
	}