package day5;

public class HanoiTowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(hanoi(5));
		
	}
	
	public static int hanoi (int n) {
		int result=1;
		
		if (n<=1) {
			return 1;
		} else {
			result = 2*(hanoi(n-1));
		}
		
		return result+1;
		
	}

}
