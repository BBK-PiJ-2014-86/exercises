package day15;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Exercise1 {
	
	public static void main (String [] args0) {
		
		Exercise1 hey = new Exercise1 ();
		
		hey.launch(2);
		
		
		
	}
	
	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		
	
		
		
		try {
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		intList.remove(0);
		System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
		ex.printStackTrace();;
		}
		}
	

}