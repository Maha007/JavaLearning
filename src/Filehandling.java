package JavaLearning;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {
	
	public static void main (String [] Args) throws IOException  ,FileNotFoundException   {
	
		FileReader FR = new FileReader("input.txt");
		FileWriter FW= new FileWriter ("output.txt");
		int c =1;
        while ((c = FR.read()) != -1) 
        	 System.out.print((char)c);
             FW.write(c);
      
             FR.close();
             FW.close();
            
	}
}

