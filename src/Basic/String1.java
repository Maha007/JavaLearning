package Basic;

public class String1 {

	public static void main(String[] args) {
	            	// String Methods - 2 ways to define
		String str1 = "Mahalakshmi1";
        String str2 = new String ("Maha");
    	
        String str3 = "Maha";
        String str4 = "Maha";	
        String str5 = "Maha             ";
        String str6 = "This is the string method";
        
                    // String - Examples
         System.out.println("Lenght of string :"  +str1.length()) ;
         System.out.println("Character index 3 : " +str2.charAt(3));
         System.out.println("Concat :" +str1.concat("lakshmi"));
         System.out.println("Contains 1 :" +str2.contains("s"));
         System.out.println("Contains 1 :" +str1.contains("s"));
         System.out.println("Startswith 1 :" +str2.startsWith("s"));
         System.out.println("Startswith 2 :" +str2.startsWith("M"));
         System.out.println("Endswith 1 :" +str2.endsWith("i"));
         System.out.println("Endswith 2 :" +str1.endsWith("i"));
         System.out.println("Equals check 1 :" +str1.equals(str2));
         System.out.println("Equals check 2 :" +str3.equals(str2));
         System.out.println("Indexcheck :" +str1.indexOf('a'));
         System.out.println("Check if its empty :"+str1.isEmpty());
         System.out.println("Check if its empty :"+str4.isEmpty());
         System.out.println("Trim :"+str5.trim());
         System.out.println("replace :"+str3.replace('M', 'l'));
         System.out.println("Substring 1:" +str1.substring(2));
         System.out.println("Substring 2:" +str6.substring(5, 7));
         char [] chararray = str6.toCharArray();
         for (int i=0; i<chararray.length; i++) 
         {
        	 System.out.println("index " +i +"    is " +chararray[i]);
         }
         
         System.out.println("Lower case:" +str1.toLowerCase());
         System.out.println("Upper case:" +str2.toUpperCase());
         
       
	}

}
