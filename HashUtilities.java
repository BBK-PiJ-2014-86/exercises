package Day8;

/**
 * 
 * @author ageorgiev
 *
 */

public class HashUtilities {
	
	/**
	 * Create a class HashUtilities that implements a simple hash function shortHash(int) that takes any integer and
	* returns an integer between 0 and 1000. 
	 * @param int nr
	 * @return int 
	 */
	
	public static int shortHash (int nr) {
		int ret = Math.abs(nr);
		
		ret = ret % 1000;
		
		return ret;
		
	}

}
