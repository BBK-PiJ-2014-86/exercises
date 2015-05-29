package Day8;

public class SuperMarket{


	
	public void addPerson(Person person) {
		
	}

    public void servePerson() {
    	
    }
    
    public static void main (String [] args) {
    	
    	PersonQueueImplColleague queue = new PersonQueueImplColleague ();
    	
    	Person person = new Person (20, "John");
    	Person person1 = new Person (20, "MEryr");
    	Person person2 = new Person (20, "Kyoko");
    	
    	queue.insert(person);
    	queue.insert(person1);
    	queue.insert(person2);
    	
    	System.out.println(queue.toString());
    	
    	queue.retrieve();
    	queue.retrieve();
    	
    	System.out.println(queue.toString());
    }
    
    
	
	
}
