package day3;

import java.util.Scanner;

class Rectangle {
	
	Point upLeft; //Point is a class created in DistancePointToPoint in the Day 3 repository
	Point downRight;
}

public class RectranglePr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double xSide, ySide, area, perimeter;
		
		Rectangle rect = new Rectangle();

		System.out.println("Enter upleft coordinates: ");
		
		rect.upLeft.x = sc.nextDouble();
	    rect.upLeft.y = sc.nextDouble();
		
		System.out.println("Enter downright coordinates: ");

		rect.downRight.x = sc.nextDouble();
		rect.downRight.y = sc.nextDouble();
		
		xSide = rect.downRight.x - rect.upLeft.x;
		ySide = rect.upLeft.y - rect.downRight.y;

		perimeter = 2*xSide + 2*ySide;
		area = xSide * ySide;
		
		System.out.println("Perimeter: "+ perimeter +", Area: "+ area);
		
	}

}
