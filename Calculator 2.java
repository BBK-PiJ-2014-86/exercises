/*
 * Create a Java class called Calculator. The class should implement the following methods, each of them printing
the result on the screen.
• add(int, int)
• subtract(int, int)
• multiply(int, int)
• divide(int, int)
• modulus(int, int)
Note that you will will need to cast the parameters into double to perform exact division
 * 
 */

package day6;

public class Calculator {

	public static int add (int x, int y) {
		
		return x+y;
		
	}
	
	public static int subtract (int x,int y) {
		return x-y;
	}
	
	public static int multiply (int x, int y) {
		return x*y;
	}
	
	public static double divide (int x, int y) {
		return (double) x/y;
	}

}
