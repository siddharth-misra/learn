package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuiteTest2 {

	@Test
	public void simpleTest2() {

		// Assert.fail("Failed this test");

		assertEquals(2.0098d, 2.0098d, 0.001);

	}
}
