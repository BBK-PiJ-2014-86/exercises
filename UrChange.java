package Day3;

import java.util.Scanner;

public class UrChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		boolean flag = false;
		
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		
		double change = number1 - number2;
		
		while(!flag) {
			
			if(change>=50){
				change = change-50;
				System.out.print("50, ");
			} else if (change>=20) {
				change = change-20;
				System.out.print("20, ");
			} else if (change>=10) {
				change = change-10;
				System.out.print("10, ");
			} else if (change>=5) {
				change = change-5;
				System.out.print("5, ");
			} else if (change>=2) {
				change = change-2;
				System.out.print("2, ");
			} else if (change>=1) {
				change = change-1;
				System.out.print("1, ");
			}  else if (change>=0.5) {
				change = change-0.5;
				System.out.print("0.5, ");
			}  else if (change>=0.2) {
				change = change-0.2;
				System.out.print("0.2, ");
			} else if (change>=0.1) {
				change = change-0.1;
				System.out.print("0.1, ");
			}
			
			if(change==0){
				flag = true;
			}
		}
	}

}
