package day3;

import java.util.Scanner;

public class CountingLetters {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int counter = 0;
		String input = sc.nextLine();
		char aChar;
		
		
		for (int i=0; i<input.length();i++){
			
			aChar = input.charAt(i);
			if (aChar == 'e'){
				counter++;
			}
		
		}
		
		System.out.println(counter);
		
	}

}
