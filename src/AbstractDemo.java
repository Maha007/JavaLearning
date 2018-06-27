package JavaLearning;

public class AbstractDemo extends AbstractD {


	public void model() {
		 System.out.println( "Model: Q5" );
	}
	
	public  static void main (String[] args)
	{
		AbstractD A1 = new AbstractDemo();
		 A1.model();
		 A1.year();
		 A1.make("Audi");
		 
	}
}
