package JavaLearning;
public class InheritanceAudi extends InheritanceCars {
	
	
	public static void main (String[] args) {
		InheritanceCars A1 = new InheritanceCars();
		A1.model();
		A1.make();
		
		InheritanceAudi A2 = new InheritanceAudi();
		A2.model ();
		A2.make();
		
	}

	public void make () {
		String Make = "BMW";
		System.out.println("Make : " +Make);
		super.make();
	}
	
	public void model() {
		String Model = "X3 " ;
		System.out.println("Model : " +Model);
		System.out.println("Model :" +super.Model);
	}
	

}
