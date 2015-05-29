package day6;

public class Matrix {

	private int x;
	private int y;
	int [] [] array = new int [x] [y];
	
	public Matrix(int x, int y) {
		
		array = new int [x] [y];
		
		for (int i = 0; i<x; i++) {
			for (int j = 0; j<y;j++) {
				array[i][j] = 1;
 			}
		}
		
	}
	
	public void setElement (int oneD, int twoD, int val) {
		
		if ((x-1>=oneD)&&(y-1>=twoD)) {
			array[oneD][twoD] = val;
		} else {
			
		}
	}
	
	public void setRow (int row, String values){
		
		String numbersOnly="";
		
		for (int k =0; k<values.length();k++) {
			if (Character.isDigit(values.charAt(k))) {
				numbersOnly = numbersOnly+ Character.toString(values.charAt(k));
			}
		}
		
		if (row<=x && numbersOnly.length()==array[row].length) {
			
			for (int i = 0; i<numbersOnly.length(); i++) {

				array[row][i] = Character.getNumericValue(numbersOnly.charAt(i));

			}
			
		} else {
			
		}
		
	}
	
	public void setColumn (int col, String val) {
		
		String numbersOnly="";
		
		for (int k =0; k<val.length();k++) {
			if (Character.isDigit(val.charAt(k))) {
				numbersOnly = numbersOnly+ Character.toString(val.charAt(k));
			}
		}
		
	
			for (int i = 0; i<numbersOnly.length();i++) {
			
			array[i][col]=Character.getNumericValue(numbersOnly.charAt(i));
			}
		
	}
	
	public String toString () {
		
		String arrayString = "";
		
		arrayString +="[";
		
		for (int i=0; i<array.length;i++){
			for (int k=0; k<array[i].length;k++){
				if (k==array[i].length-1){
				    arrayString+=array[i][k];
				} else {
					arrayString += array[i][k]+ ",";
				}
			}
			if((i!=array.length-1)) {
			arrayString += ";";
			}
		}
		
		arrayString +="]";
		
		return arrayString;
	}
	
	public void prettyPrint () {
		
		for (int i=0; i<array.length;i++) {
			for(int k =0; k<array[i].length;k++) {
				System.out.print(array[i][k]+" ");
			}
			System.out.println();
		}
		
	}
	
	public Matrix (String stringArray) {
		
		x = 0;
		y = 0;
		String [] FArray;
		
		FArray = stringArray.split(";");
		
		x = FArray.length;
		
		for (int i = 0; i<x; i++) {
			String tempArray [] =  FArray[i].split(",");
			
			if (tempArray.length >y) {
				y = tempArray.length;
			}
		}
		
		array = new int [x][y];
		
		for (int k = 0; k<x; k++) {
			
			String [] tempArray = FArray[k].split(",");
			
			for (int j =0; j<tempArray.length; j++) {
				array[k][j] = Integer.parseInt(tempArray[j]);
			}
		}
		
	}
}
