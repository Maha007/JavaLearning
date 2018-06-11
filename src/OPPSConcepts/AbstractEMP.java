package OPPSConcepts;

public class AbstractEMP extends AbstractPerson {
		
		private int empId;
		
		public AbstractEMP(String nm, String gen, int id) {
			super(nm, gen);
			this.empId=id;
		}

		@Override
		public void work() {
			if(empId == 0){
				System.out.println("Not working");
			}else{
				System.out.println("Working as employee!!");
			}
		}
		
		public static void main(String args[]){
			//coding in terms of abstract classes
			AbstractPerson student = new AbstractEMP("Sandy","Female",0);
			AbstractPerson employee = new AbstractEMP("Bob","Male",123);
			student.work();
			employee.work();
			//using method implemented in abstract class - inheritance
			employee.changeName("Robert Johnson");
			System.out.println(employee.toString());
		}

	}
	
