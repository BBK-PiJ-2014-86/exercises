package day5;

public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(powerMethod(7,2));
	}
	
	public static int powerMethod (int base, int power) {
		
		 int result = 0;
		
		 if(power == 1) {
			 return base;
		 } else {
			 result = base * powerMethod(base, power-1);
			 return result;
		 }
		
	}

}
