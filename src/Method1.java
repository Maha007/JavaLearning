package JavaLearning;

public class Method1 {
	
     public static void main (String arg[])
	{
     
   String  Grade;
   String studentname;
    	Grade = findgrade ( 90) ; 
    	studentname = "John";
    	 displaygrade (studentname, 	Grade) ;
    	 Grade = findgrade(40) ; 
    	 studentname = "Tom";
    	 displaygrade (studentname, 	Grade) ;
	}
	
	private static String  findgrade( int score)
     {
		 String Grade;
            
    	 if  (score >=90 && score <=100) {
    		 
        	 Grade = "A" ;    } 
        	 
        	 else if (score <=70 && score >=60) 
        	 {    	
        	Grade = "B" ;
               } 
        	 else if (score <=70 && score >=60) 
        	 {    	
        	Grade = "C" ;
                 } 
        	 else { Grade = "C" ;}
        	 
    	 return  Grade;
 
     }
 
	 public static void  displaygrade (String studentname , String Grade)  {
	   	
     System.out.println("Grade of student "+studentname +" is :"  +Grade  ) ;
	 
}
}
     

