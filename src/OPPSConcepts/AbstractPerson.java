package OPPSConcepts;


//abstract class  : hiding the implementations to the user and only provide the functionality to the user. keyword -abstract
                    
public abstract class AbstractPerson {
	
	private String name;
	private String gender;
	
	public AbstractPerson(String nm, String gen){
		this.name=nm;
		this.gender=gen;
	}
	

	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		return "Name="+this.name+"::Gender="+this.gender;
	}

	public void changeName(String newName) {
		this.name = newName;
	}	
}