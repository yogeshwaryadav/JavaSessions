package Assignments;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		Expected Output :
			Hello 
			Naveen K
		*/
		System.out.println("Hello");
		System.out.println("Yogeshwar");
		
		/* 2. Write a Java program to print the sum of two numbers. 
		Test Data: 
 		74 + 36 
		Expected Output :
		110
		 */
		byte b1=74;
		byte b2=36;
		// it gives compile time error because java thinks it might cross the byte range 
		//byte sum= b1 + b2;
		System.out.println(b1+b2);
		//System.out.println(sum);
		
		short s1=12;
		short s3=12;
		//short s3=s1 +s3;
		
		
		
		float f1=1.2f;
		float f2=1.5f;
		float f3=f1 + f2;
		System.out.println(f3);
		

	}

}
