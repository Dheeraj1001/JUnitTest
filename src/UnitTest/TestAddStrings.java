package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		JUnitTesting jut = new JUnitTesting();
		String res = jut.addStrings("Dheeraj ","Theegela");
		assertEquals("Dheeraj Theegela", res);
	}

}
