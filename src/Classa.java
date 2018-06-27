package JavaLearning;

public class Classa {
	
	private String studentname;
	
	private int score ;
	
	public void printgrade () {
		
		System.out.println("Print the Grade");
		
		
	}
	
	public void setStudentname(String studentname) {
		this.studentname = studentname; }
	
	public String getStudentname() {
		return studentname;
	}

	
	
	public void setscore(int score)
	
	{
		
		this.score=score;
	}
	
	

	public  int getscore ( )
	{	
		return score;
	}

}
