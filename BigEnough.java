package day6;

import java.util.Scanner;

public class BigEnough {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputId;
		String inputString;

		Scanner sc = new Scanner (System.in);
		
		EmployeesArrays ea = new EmployeesArrays ();
		
		System.out.println("Enter input below. The program will terminate when after reading an empty name (i.e. length 0) or an ID equal to 0. ");
		
		do {	
		
		System.out.println("Enter ID of employee : ");
		
		inputId = sc.nextInt();
		
		if (inputId == 0) {
			break;
		}
		
		ea.enterId(inputId);
		
		System.out.println("Enter name of employee : ");
		
		inputString = sc.next();
		
		if (inputString.equals(" ")) {
			break;
		}
		
		ea.enterName(inputString);

		} while (true);
		
		for (int i = 0; i < ea.getSizeId(); i++) {
			
			if (ea.getIdArray()[i]%2==0) {
				System.out.println(ea.getIdArray()[i]);
				System.out.println(ea.getNameArray()[i]);
			}
			
			if (ea.getNameArray()[i].charAt(0)=='S') {
				System.out.println(ea.getIdArray()[i]);
				System.out.println(ea.getNameArray()[i]);
			}
		}
		

	}

		
	
}
