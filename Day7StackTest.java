package day12;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import Day7.Request;
import Day7.Stack;

public class Day7StackTest {

	@Test
	public void popTest() {
		
		Request r = new Request(0);
		
		Stack stack = new Stack ();
		
		stack.push(r);
		
		assertEquals(true,stack.pop());
	}
	
	@Test
	public void popEmpty() {
		
		Stack stack = new Stack ();
	
		assertEquals(false,stack.pop());
	}
	
	@Test
	public void NormalCaseTest() {
		
		Request r0 = new Request(0);
		Request r1 = new Request(1);
		
		Stack stack = new Stack ();
		stack.push(r0);
		stack.push(r1);
		stack.pop();
		
		assertEquals(r0, stack.peek());
	}
	
	@Test
	public void volumeTest() {
		
		Stack stack = new Stack();
		
		for (int i =0; i<100000;i++) {
		stack.push(new Request(i));
		}
		
		for(int i=0; i<50000;i++) {
			stack.pop();
		}
		
		assertEquals(49998,stack.peek().getRequestId());
	}
	
	

}
