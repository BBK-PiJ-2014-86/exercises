package day12;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetInitialsTest {

	@Test
	public void test() {
		
		Exercise3a ex = new Exercise3a();
		
		String str = "String  String";
		
		char [] initialsArray = ex.getInitials(str);
		String s = initialsArray[0]+""+""+initialsArray[1];

		assertEquals(s, "SS");

		
	}

}
