package OPPSConcepts;

public class CarClass {
	// Class is a template thats describes state and behavior 
	// Setters: used the sets the value of a field/variable using Keyword - set 
	//Getters : Used to returns value . keyword -  get
	// this :  used to access mem variable  or class variable 
	
		// color
		private String color;
		// make
		private String make;
		// model
		private String model;
		// year
		private int year;

		public void increaseSpeed() {
			System.out.println("Increasing the speed");
		}
		
		public String getMake() {
			return this.make;
		}
		
		public void setMake(String make) {
			this.make = make;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			if (year > 1900) {
				this.year = year;
			} else {
				System.out.println("This year is not valid");
			}
		}
		
	}