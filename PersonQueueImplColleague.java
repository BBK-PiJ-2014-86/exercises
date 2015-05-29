package Day8;

public class PersonQueueImplColleague implements PersonQueue {

		private Person headOfQueue;
		
		public PersonQueueImplColleague() {
			headOfQueue = null;
		}	
		
		public void insert(Person person) {
			if (headOfQueue == null) {
				headOfQueue = person;
				return;
			}
			Person temp = headOfQueue;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.setNext(person);
		}
		
		public Person retrieve() {
			if (headOfQueue == null) {
				return null;
			}
			Person result = headOfQueue; 
			headOfQueue = headOfQueue.next;
			return result;		
		}	
	
		public String toString (){
			String output = "";
			Person current = headOfQueue;
			while (current!= null) {
				output += current.name+ ", ";
				current = current.next;
				
			}
			return output;
		}
}
