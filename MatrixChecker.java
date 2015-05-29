package day6;

public class MatrixChecker {

	public boolean isSymmetrical (int [] array) {
		
		boolean flag = true;
		
		for (int i = 0; i< array.length/2;i++) {
			if (array[i]!=array[array.length-(i+1)]) {
				flag = false;
			}
			if (!flag) {
				return false;
			}
		}
		
		return true;
		}
	
	public boolean isSymmetrical (int [][] array) {
		
		boolean flag = true;
		
		for (int i = 0; i< array.length;i++) {
			for (int j =0; j <array[i].length; j++) {
				
			
				if (array[i][j] != array[j][i]) {
				flag = false;
				}
				if (!flag) {
				return false;
				}
			}
		}
			
		
		return true;
		}
	
	public boolean isTriangular (int [][] array) {
		
		boolean flag = true;
		
		for (int i = 0; i<array.length; i ++) {
			for (int j = 0; j <array[i].length; j++) {
				
				if (array[i][j] != 0 && i>j) {
					flag = false;
				}
				
			}
		}
		
		return flag;
	}
		
	}
	

