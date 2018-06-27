package JavaLearning;

public class WhileDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
	while (i < 20) {
			System.out.println(i);
			i++;
			
			} 
		System.out.println("outside while"); 
	
		do {
			System.out.println("do while");
			System.out.println(i);
			i++;
		}
		
		while (i<10);
}		

}