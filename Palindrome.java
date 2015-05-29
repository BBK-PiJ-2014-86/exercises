import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		boolean isPalindrome = false;
		int counter = 0;
		int middle = input.length()/2;
		
		for (int i=0; i<middle; i++){
			int m = input.length();
			if (input.charAt(i) == input.charAt(m-1 -i)){
				counter++;
			}
		}
		
		if(counter == middle) {
			isPalindrome = true;
			System.out.println(isPalindrome);
		}
		
	}

}
