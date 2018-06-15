package Basic;

import java.util.Arrays;

public class Array1 {
  public static void main(String[] args) {
                  	// Array Demo
	  
  String[] mystringArray1= {"a","b","c"};
  System.out.println("0 index :" +mystringArray1[0]);
  System.out.println("1 index :" +mystringArray1[1]);
  System.out.println("2 index :" +mystringArray1[2]);

	  			
	 int[] myintArray1;
	 myintArray1 = new int[10];
	 myintArray1[0]= 1 ;
	 myintArray1[1]= 2 ;
	 System.out.println("0 index :" +myintArray1[0]);
	 System.out.println("1 index :" +myintArray1[1]);
	 System.out.println("2 index :" +myintArray1[2]);
	 System.out.println("3 index :" +myintArray1[3]);
	 
	 int len1= myintArray1.length;
	 int len2= mystringArray1.length;
	 
	 System.out.println("Int array length  :" +len1);
	 System.out.println("String array length :" +len2);
	  
	 System.out.println("ForloopArray 1 :"); 
	 for (int i=0;i<3;i++)
	 {
		System.out.println(  myintArray1[i]);
	 }
	 
	 Arrays.sort(myintArray1);
	 System.out.println("ForloopArray 2 :"); 
 for (int i=0;i<3;i++)
	 {
		 System.out.println(myintArray1[i]);

	 }
	
}
  
}
