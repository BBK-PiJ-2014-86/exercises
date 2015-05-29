package Day8;

public class PersonQueueImplement implements PersonQueue {

	
	Person head;
	
	public PersonQueueImplement () {
		head = null;
	}
	
	@Override
	public void insert(Person person) {
		
     	Person current = head; // this creates current which points to where the head points.
		
     	if( current==null) {
     		head=person;
     	} else{
			while (current.next != null) { // checking if next is null - reaching the end of the linked list.
				current = current.next; // if not null, it will go to the next one pointer
			}
			current.setNext(person); // this means next is null and we can now set it to point to next person	
     	}
	}

	@Override
	public Person retrieve() {
		Person deletedPerson = head; // storing the deletedPerson	
		head.next = head.next.next; // next of head which should point to the last object (first to come) 
		return deletedPerson; 
		
	}
	public String toString (){
		String output = "";
		Person current = head.next;
		while (current!= null) {
			output += current.name+ ", ";
			current = current.next;
			
		}
		return output;
	}


}
