package day3;

import java.util.Scanner;

public class InsideOrOutside {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		boolean inside=false;
		Point firstPoint = new Point();
		Point secondPoint = new Point();
		Point thirdPoint = new Point();
		
		firstPoint.x = sc.nextDouble();
	    firstPoint.y = sc.nextDouble();

	    secondPoint.x = sc.nextDouble();
	    secondPoint.y = sc.nextDouble();
	    
	    thirdPoint.x = sc.nextDouble();
	    thirdPoint.y = sc.nextDouble();
	    
	    if (thirdPoint.x>=firstPoint.x && thirdPoint.x<=secondPoint.x && thirdPoint.y<=firstPoint.y && thirdPoint.y>=secondPoint.y){
	    	inside = true;
	    } else {
	    	inside = false;
	    }
	    
	    System.out.println(inside);
	}

}
