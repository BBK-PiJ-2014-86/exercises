/*
Create a program with a (recursive) method that takes a String paremeter and returns true if the String is a
palindrome and false otherwise. Compare this recursive version with the iterative version you wrote in past weeks.
Which one seems clearer to you?
 */

package day5;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(palindr("cannac"));
	}
	
	public static boolean palindr (String str) {
		
		boolean isPalindrome = false;
		
		if (str.length()<=2 && (str.charAt(0) == str.charAt(str.length()-1))) {
			return true;
		} else if (str.length()<=2 || str.length()%2==1) {
			return false;
		} else {
			isPalindrome = (str.charAt(0) == str.charAt(str.length()-1)) && (palindr(str.substring(1, str.length()-1)));
		    return isPalindrome;
		}
		
	}

}
