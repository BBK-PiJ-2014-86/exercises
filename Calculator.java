/*
 * Write a program that reads two numbers from the user and then offers a menu with the four basic operations:
addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, the
calculator performs the operation.
Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is a Dou-
ble.parseDouble() method to parse real numbers.
 */

package day3;

import java.util.Scanner;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       double n1, n2, result = 0;
       String operator;
       
       System.out.print("Please enter first number: ");
       
       n1 = sc.nextDouble();
       
       System.out.print("Please enter second number: ");
       
       n2 = sc.nextDouble();
       
       System.out.print("Please select an operator +, -, * or /: ");
       
       operator = sc.next();
       
       if (operator.equals("+")) {
    	   result = n1+n2;
       } else if (operator.equals("-")) {
    	   
    	   result = n1-n2;
    	   
       } else if (operator.equals("*")) {
    	   
    	   result = n1*n2;
    	   
       } else if (operator.equals("/") && n2!=0) {
    	   
    	   result = n1/n2;
    	   
       } else {
    	   
    	   System.out.println("invalid operation");
       }
       
       System.out.println(result);
	}

}
