package JavaLearning;

public class InterfaceCar implements Interface{
	
	public static void main (String[] args) {
		Interface A1 = new InterfaceCar();
		A1.BMW(2002);
		System.out.println("Print Speed: "+A1.Speed );
		A1.BMW(2001, "Audi");
		InterfaceCar A2 = new InterfaceCar ();
		A2.BMW(2001);
		A2.BMW(2005, "Model");	
	}

	@Override
	public void BMW(int year) {
		System.out.println("Year: " +year);
		
	}

	@Override
	public void BMW(int year, String Model) {
		// TODO Auto-generated method stub
		System.out.println("Year: " +year +" and"+ " Model: " +Model);
	}
	
	

}
