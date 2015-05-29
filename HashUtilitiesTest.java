package day12;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import Day8.HashUtilities;

public class HashUtilitiesTest {

	@Test
	public void hashUtilitiesTest() {
		
		int rand = 0;
		
		// producing the max of 1000 instances of random
		for (int i=0; i<1000;i++) {
			Random r = new Random ();
			int temp = r.nextInt(1000000);
			if (rand<temp) rand=temp;
		}
		
		// hash of the max number
		rand= HashUtilities.shortHash(rand);
		
		assertTrue(rand <1000);
	}

}
