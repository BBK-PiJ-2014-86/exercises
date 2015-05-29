package day3;

import java.util.Scanner;

public class Overlaps {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        boolean insideFirst=false, insideSecond=false, insideThird=false;
		Point firstPoint = new Point();
		Point secondPoint = new Point();
		Point thirdPoint = new Point();
		Point fourthPoint = new Point();
		Point fifthPoint = new Point();
		
		firstPoint.x = sc.nextDouble();
	    firstPoint.y = sc.nextDouble();

	    secondPoint.x = sc.nextDouble();
	    secondPoint.y = sc.nextDouble();
	    
	    thirdPoint.x = sc.nextDouble();
	    thirdPoint.y = sc.nextDouble();
	    
	    fourthPoint.x = sc.nextDouble();
	    fourthPoint.y = sc.nextDouble();
	    
	    fifthPoint.x = sc.nextDouble();
	    fifthPoint.y = sc.nextDouble();
	    
	    if (fifthPoint.x>=firstPoint.x && fifthPoint.x<=secondPoint.x && fifthPoint.y<=firstPoint.y && fifthPoint.y>=secondPoint.y){
	    	insideFirst = true;
	    } else {
	    	insideFirst = false;
	    }
	    
	    if (fifthPoint.x>=thirdPoint.x && fifthPoint.x<=fourthPoint.x && fifthPoint.y<=thirdPoint.y && fifthPoint.y>=fourthPoint.y){
	    	insideSecond = true;
	    } else {
	    	insideSecond = false;
	    }
	    
	    
	    if(insideFirst && insideSecond) {
	    	System.out.println("Inside both");
	    } else if (!insideFirst && insideSecond) {
	    	System.out.println("Inside second only");
	    } else if ((insideFirst && !insideSecond)){
	    	System.out.println("Inside first only");
	    }else {
	    	System.out.println("Outside both");
	    }
	    

	}

}
