package day17;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i<10; i++) {
		
		System.out.println("Enter the duration (in ms) of task " + i);
		int in = sc.nextInt();
		
		Thread t = new Thread(new ResponsiveUI(in));
		t.start();
		
		}

	}
 
}
