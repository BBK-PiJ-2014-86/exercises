/*
 Create your own version of boxed int! Create a class Integer2 with only one field (int value) and the following
methods:
getValue(): returns the value of this number as an int, a getter.
setValue(int): a setter.
isEven(): returns true if the number is even, false otherwise.
isOdd(): the opposite.
prettyPrint(): prints the value of the integer on the screen.
toString(): returns a String equivalent to the number 
 
 */

package day4;

public class Integer2 {

	int value;
	

	public int getValue() {
		
		int value = this.value;
		
		return value;
	}
	
	public void setValue(int newValue) {
		
		this.value = newValue;
		
	}
	
	public boolean isEven () {
		
		if(this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}	
	}
	
	public boolean isOdd () {
		if (this.value %2 == 1) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public void prettyPrint() {
		System.out.println(this.value);
	}
	
	public String toString () {
		String intString = this.value+"";
		
		return intString;
	}
	
	
	
}
