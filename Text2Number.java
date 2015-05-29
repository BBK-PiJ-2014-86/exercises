package day3;

import java.util.Scanner;

public class Text2Number {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    String userInput;
	    int point; // stores where "." is
	    int length; // stores length of the string.
	    int numbersToPoint;//units to point 
	    double resultToPoint = 0, resultAfterPoint = 0, result; // stores results
		
		System.out.println("Enter Number: ");
		
		userInput = sc.nextLine();
		
		point = userInput.indexOf('.');
		
		length = userInput.length();
        
		numbersToPoint = 0;
		
		// loop to find how many numbersToPoint are there excluding all occurrences of "," (which can be more than 1) and store the result in numbersToPoint;
		for (int i=0; i<point; i++){
			if (userInput.charAt(i) != ',') {
				numbersToPoint++;
			}
		}
		
		// now we know  numbersToPoint we can use them as exponents of 10^...
		
		//for loop to multiply each digit by 10 raised to numbersToPoint -1 
		
		for (int j = 0; j<point;j++){
			
			if (userInput.charAt(j)!= ',') {
			resultToPoint = resultToPoint + (Character.getNumericValue(userInput.charAt(j)) * Math.pow(10, numbersToPoint-1));
			numbersToPoint--;
			}
		}
		
		//now we have the resultToPoint
		
		// for loop to find what is after "."
		
		int exp = 1;
		for (int t = point+1; t <userInput.length(); t++){
			resultAfterPoint = resultAfterPoint + (Character.getNumericValue(userInput.charAt(t)) * (Math.pow(10, -exp)));
			exp++;
		}
		
		
		result = resultToPoint + resultAfterPoint;
		
		System.out.println(result/2);
	}

}
