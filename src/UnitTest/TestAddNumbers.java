package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitTesting jut = new JUnitTesting();
		int res = jut.addNumbers(100,200);
		assertEquals(300, res);
	}

}
