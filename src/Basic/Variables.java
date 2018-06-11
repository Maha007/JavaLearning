package Basic;

public class Variables {

	public static void main(String[] args) {
		             /*
		              *Variables
		             */		
		
		//byte - Min : -128 ; Max: 127 ; Default :0  
		 byte a = 126 ;
         System.out.println("Byte value:" +a);
        
        // Short - Min : -32,768 ; Max :32,367 ; Default :0 
         short b = 32300 ;
        System.out.println("Short value :" +b);		
        
        //int - Min :-2.147.483,648 ; MAX :-2.147.483,648 ; Default :0 
        int c = 10000000;
        System.out.println("Int value :" +c);
        
        // long - Min:-2^63 ; Max: 2^63 -1 ; default :0
        long d = 1000000000L;
        System.out.println("Long value :" +d);
        
        //float - default :0.0f
        float e = 200.2f;
        System.out.println("float value :" +e);
        
        //double - default 0.0d
        double f = 200.33d;
        System.out.println("double value :" +f);
        
        // boolean : true /false; default :false
        boolean g = true;
        System.out.println  ("Boolean value:" +g);
        
        //char : Min :0; max :65,535
        char h = 'a';
        System.out.println  ("Char value:" +h);
        
	}

}
