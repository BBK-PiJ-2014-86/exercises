package day12;

import static org.junit.Assert.*;

import org.junit.Test;

import Day8.Person;
import Day8.PersonQueueImplement;

public class Day8QueueTest {

	@Test
	public void NormalCaseTest() {
		
		PersonQueueImplement queue = new PersonQueueImplement();
		Person p1 = new Person(1, "Gosho");
		Person p2 = new Person(2, "Pesho");
		
		queue.insert(p1); // inserting first person
		queue.insert(p2); // inserting second person
		
		// when we retrieve from the queue, p1 should be returned on FIFO basis
		
		assertEquals(p1.getName(), queue.retrieve().getName());
	}

}
