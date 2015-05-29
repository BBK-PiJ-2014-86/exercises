package Day8;

public class Person {
	
	int age;
	String name;
	Person next;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getNext() {
		return next;
	}


	
	public Person (int age, String name ){
		this.age = age;
		this.name=name;
		next = null;
	}
	
	public void setNext (Person person) {
		next = person;
	}
}
