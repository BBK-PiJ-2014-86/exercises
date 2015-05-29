package day5;

public class StackOverflow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stackOverflow(1);
	}
	
	
	public static int stackOverflow (int n) {
		
		System.out.println("method called " + n);
		
		int result = n+ stackOverflow(n+1);
		return result;
		
	}

}
