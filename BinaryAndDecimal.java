/*
 Create a program in which you define the following methods:
binary2decimal(String): takes from the user a binary number (with digits 0 and 1) and returns the corresponding
number in decimal (base-10, with digits between 0 and 9). Hint: in the same way that you know that
35 = 3 · 101 + 5 · 100
, you can find that 100011 = 1 · 2
5 + 1 · 2
1 + 1 · 2
0
.
decimal2binary(int): the opposite of the previous one: takes a decimal number and returns the corresponding
binary number. Hint: instead of multiplying by 2, you will need to divide by two this time.
The program must offer a menu to the user with two options. The first one takes a binary number from the
user and returns the corresponding decimal number. The second one does the opposite: takes a decimal number
and returns a binary number. The program should use the methods defined.
  
 */

package day4;

import java.util.Scanner;

public class BinaryAndDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String stringInput;
		int numberInput;
		
		System.out.print("Press 0 for binary to decimal. Press 1 for the opposite.");
		
		int choice =  sc.nextInt();
		
         if(choice ==0){  
		System.out.print("Enter a binary number: ");
		stringInput = sc.next();
		
		binary2decimal(stringInput);
	
         } else {
        System.out.print("Enter a decimal number: ");
		numberInput = sc.nextInt();
		decimal2binary(numberInput);
         }
}

	static int binary2decimal (String string) {
		int number=0;
		int length;
		
		length = string.length();
		int pow = length - 1;
		
		for (int i = 0; i<length; i++) {
			
			int m = Character.getNumericValue(string.charAt(i));
			
			number = number+ (int)(m* Math.pow(2,pow));
			pow--;
			
		}
		
		System.out.println("The decimal number is : "+ number);
		return number;
	}
	
	static String decimal2binary (int decimal) {
		
		String binary = "";
		String binaryOpp = "";
		
		do {
			
			if(decimal % 2== 1) {
				binary = binary + "1";
			} else {
				binary = binary + "0";
			}
			
			decimal = decimal /2;
			
		} while (decimal>0);
		
		for (int i=binary.length()-1; i>=0; i--) {
			binaryOpp = binaryOpp + binary.charAt(i);
		}
		
		System.out.println("The binary number is: "+ binaryOpp);
		return binaryOpp;
	}
}