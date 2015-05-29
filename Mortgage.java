/*
 Write a program that asks the user for the total amount borrowed for a mortgage, the number of years to pay it
back, and the interest rate (in this exercise, we assume it is a fixed rate). The program can then calculate how
much must be paid at the end
where t is the total, c is the cost, and r is the rate as a percentage. The program should print:
• The total amount to be paid
• The money to be paid every year
• The number of years before the interest is paid and only the initial capital remains
Write a method to calculate each piece of data 
 
 */

package day4;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		double borrowed, interest, total;
		int nrYears;
		
		System.out.print("Amount borrowed: ");
		
		borrowed = sc.nextDouble();
		
		System.out.print("Number of years: ");
		
		nrYears = sc.nextInt();
		
        System.out.print("Interest rate in %: ");
		
		interest = sc.nextDouble();
		
		total = ((interest/100)*borrowed*nrYears) + borrowed;
		
		System.out.println(total);
		
	}

}