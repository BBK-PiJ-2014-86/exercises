package day6;

public class EmployeesArrays {

	
	private int idCounter = 0;
	private int nameCounter = 0;
	private int [] id = new int [5];
	private String [] name = new String [5];
	
	public int [] getIdArray () {
		return id;
	}

	public String [] getNameArray () {
		return name;
	}
	
	public int getSizeId () {
		return id.length;
	}
	
	public int getSizeString () {
		return name.length;
	}
	
	public void enterId (int id) {
		
		this.id [idCounter] = id;
		idCounter++;
		
		if (this.id.length==idCounter) {
			createNewIdArray();
		}
		
	}
	
public void enterName (String name) {
		
		this.name [nameCounter] = name;
		nameCounter++;
		
		if (this.name.length==nameCounter) {
			createNewNameArray();
		}
		
	}

	private void createNewNameArray() {

		String tempArray [] = new String [name.length *2];
		
		for (int i = 0; i<name.length; i++) {
			
			tempArray[i] = name[i];
		}
		
		name = tempArray;
		
		//System.out.println("new one created " + name.length);
}

	private void createNewIdArray() {
		
		int tempArray [] = new int [id.length *2];
		
		for (int i = 0; i<id.length; i++) {
			
			tempArray[i] = id[i];
		}
		
		id = tempArray;
		
		//System.out.println("new one created " + id.length);
		
	}
}
