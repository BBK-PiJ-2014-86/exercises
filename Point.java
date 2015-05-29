/*
 
Write a program in which you create and use a class called Point, with two fields of type double (e.g. x, y) and the
following methods:
distanceTo(Point): calculates the distance to another point.
distanceToOrigin(): calculates the distance to the origin. Implement it by calling the first method.
moveTo(double x, double y): changes the coordinates of this point to be the given parameters x and y.
moveTo(Point): changes the coordinates of this point to move where the given point is.
clone(): returns a copy of the current point with the same coordinates.
opposite(): returns a copy of the current point with the coordinates multiplied by -1.
Two methods in a class can have the same name (identifier) as long as their parameters are different. This is
called method overloading and we will see more of that in the future.
*/

package day4;

public class Point {

	double x;
	double y;
	
	public Point(double x, double y){
		
		this.x = x;
		this.y= y;
		
	}
	
	
	public double distanceTo(Point p){
		
		double distance = 0.0;
		
		distance = Math.sqrt(Math.pow(Math.abs(x-p.x),2) + Math.pow(Math.abs(y-p.y),2));
		
		return distance;
	}
	
	public double distanceToOrigin () {
		
		double distanceToOrigin = 0.0;;
		Point origin = new Point(0,0);
		
		distanceToOrigin = distanceTo(origin);
		
		return distanceToOrigin;
	}
	
	public void moveTo(double z, double t) {
		
		this.x = z;
		this.y = t;
		
	}
	
	public void moveTo(Point newPoint){
		
		this.x = newPoint.x;
		this.y = newPoint.y;
		
	}
	
	public Point clone () {
		
		Point copy = new Point(this.x,this.y);
		
		return copy;
	}
	
	public Point opposite () {
		double oppositeX = this.x *(-1);
		double oppositeY = this.y *(-1);
		
		Point oppositeCopy = new Point (oppositeX, oppositeY);
		
		return oppositeCopy;
	}
	
}
