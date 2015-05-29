/*
 5 Binary and hexadecimal (*)
Binary numbers can be quite long. A 32-bit memory address looks like 1001 0101 0110 1010 1011 0010 1001
1010, which is difficult to handle. That is why memory addresses and other binary numbers are usually written as
hexadecimal numbers. An hexadecimal number is a base-16 number, with digits between 0 and f (f is equivalent to
decimal 15, e is equivalent to decimal 14, and so on). An hexadecimal number is equivalent to a four-digit binary
number, which makes them quite compact. The former address reads 956ab29a, which is easier to read and write.
To prevent confusion with decimal numbers, hexadecimal numbers are usually prefixed by “0x”, as in 0x95 (which
is 149) or 0xff (which is 255).
Write a program that takes a String. The string can be a decimal or a hexadecimal number (starting by “0x”).
Your program must recognise the number as what it is and convert it to the other base. Use two methods for
conversion as in the former exercise
 */

package day4;

import java.util.Scanner;

public class BinaryAndHexadecimal {

	
public static void main (String [] args0) {

	Scanner sc = new Scanner(System.in);
	String userInputStr = sc.next();

	
	
	if (userInputStr.substring(0, 2).equals("0x")) {
		hexToDecimal(userInputStr);
	} else {
		int userInputDouble = Integer.parseInt(userInputStr);
		decimalToHex(userInputDouble);
	}
	
	
}
	
static double hexToDecimal (String hex) {
	
	double decimal = 0.0;
	String realHex = hex.substring(2, hex.length());
	int length = realHex.length();
	int power = length -1;
	
	for (int i = 0; i<realHex.length();i++) {
		
		if(Character.isDigit(realHex.charAt(i))) {
			
			int temp = Character.getNumericValue(realHex.charAt(i));
			decimal = decimal + temp*Math.pow(16, power);
			
		} else {
			
			if (realHex.charAt(i)=='a') {
				
				decimal = decimal + 10*Math.pow(16, power);
				
			} else if (realHex.charAt(i)=='b') {
				
				decimal = decimal + 11*Math.pow(16, power);
				
			} else if (realHex.charAt(i)=='c') {
				
				decimal = decimal + 12*Math.pow(16, power);
				
			} else if (realHex.charAt(i)=='d') {
				
				decimal = decimal + 13*Math.pow(16, power);
				
			} else if (realHex.charAt(i)=='e') {
				
				decimal = decimal + 14*Math.pow(16, power);
				
			} else {
				
				decimal = decimal + 15*Math.pow(16, power);
				
			}
		}
		
		power--;
		
	}
	System.out.println("The decimal number is "+ decimal);
	return decimal;
}


static String decimalToHex (int decimal) {
	
	String hex = "";
	String hexOpp = "";
	
	do {
		
		int rem = (int) (decimal % 16);
		
		if (rem>9) {
			if (rem==10){
				hex = hex+"a";
			} else if (rem == 11) {
				hex = hex+"b";
			} else if (rem ==12) {
				hex = hex +"c";
			} else if (rem == 13) {
				hex = hex+"d";
			} else if (rem == 14) {
				hex = hex+"e";
			} else {
				hex = hex+"f";
			}
		} else if (rem >= 0 && rem<=9) {
		    hex = hex + rem;
		}
		
		decimal = decimal /16;
		
	} while (decimal!=0);
	

	for (int i=hex.length()-1; i>=0; i--) {
		hexOpp = hexOpp + hex.charAt(i);
	}
	
	System.out.println("The hexidecimal number is: "+ "0x" + hexOpp);
	return hexOpp;	
	

}
	
}
