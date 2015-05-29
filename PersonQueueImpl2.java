package Day8;

public class PersonQueueImpl2 implements PersonQueue {
	
	int count;
	Person [] array;

	
	public PersonQueueImpl2 () {
		count = 0;
		array = new Person [10];
	}
	
	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
				
		array[count] = person;
		count++;
		if (count==array.length) {
			array = newArray(array);
		}
		
	}

	private Person [] newArray(Person [] array) {
		// TODO Auto-generated method stub
		
		Person [] biggerArray = new Person [array.length*2];
		
		for (int i=0; i<array.length;i++) {
			biggerArray[i] = array[i];
		}
		
		return biggerArray;
		
	}

	@Override
	public Person retrieve() {
		// TODO Auto-generated method stub
		
		count--;
		Person removedP = array[0]; 
		array[0]= null;
		
		for (int i = 1; i<array.length;i++) {
			array[i-1] = array [i];
		}
		return removedP;
	}
	
	@Override
	public String toString () {
		
		String arrayPrint = "";
		
		for (int i = 0; i<array.length && array[i]!=null; i++) {
			arrayPrint += array[i].name + ", ";
		}
		
		return arrayPrint;
	}

}
