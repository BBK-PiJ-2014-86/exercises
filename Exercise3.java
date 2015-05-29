package day12;

public class Exercise3 {
	
	public char[] getInitials (String s) {
		
		char[] initArray = new char[10];// making array limited to 10 for the purposes of the exercise
		int position = 0;
		initArray[position] = s.charAt(0); // adding first character to array at position 0
		position++;
		
		for (int i =0; i<s.length();i++) {
			if(s.charAt(i)== ' ') {
				if(s.charAt(i+1)==' ') {
					throw new IllegalArgumentException();
				} else {
					initArray[position] = s.charAt(i+1);
					position ++;
				}
			}
		}
		
		return initArray;
	}
	
	
	
	public static void main (String [] args) {
		Exercise3 ex = new Exercise3 ();
		ex.launch();
	}

	private void launch() {
		
		char[] array = getInitials("Bob  Dylan");
		
		for(char c : array) {
			if(Character.isLetter(c)) System.out.print(c+ " ");
		}
		
	}
	


}
