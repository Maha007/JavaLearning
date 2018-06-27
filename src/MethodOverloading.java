package JavaLearning;

public class MethodOverloading {
	
	public static void main (String[] args) {
	
		MethodOverloading obj = new MethodOverloading();
		
		obj.BMW(2016);
		obj.BMW("Q1");
		obj.BMW("Q2", 2017);
		obj.BMW(2018, "Q3");	
		
	}
	
		
	public void BMW(int year) {
		System.out.println("Year: " +year);
		
	}
	
	public void BMW(String Model) {
		System.out.println(" Model: " +Model);
		
	}

	public void BMW( String Model,int year) {
		// TODO Auto-generated method stub
		System.out.println(" Model: " +Model +" and"+ "Year: " +year);
	}

	public void BMW(int year, String Model) {
		// TODO Auto-generated method stub
		System.out.println("Year: " +year +" and"+ " Model: " +Model);
	

}
	
}
