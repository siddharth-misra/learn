package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

@RunWith(Parameterized.class)
public class SampleTestCase extends TestResult {

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	// add the error
	public synchronized void addError(Test test, Throwable t) {
		super.addError((junit.framework.Test) test, t);
	}

	// add the failure
	public synchronized void addFailure(Test test, AssertionFailedError t) {
		super.addFailure((junit.framework.Test) test, t);
	}

	@Test
	public void simpleTest() {

		// Assert.fail("Failed this test");

		assertEquals(2.0098d, 2.0098d, 0.001);

		collector.addError(new Throwable("There is an error in first line"));
		collector.addError(new Throwable("There is an error in second line"));
		//collector.checkThat(getResults(), not(containsString("here is an error")));
		// all lines of code will execute and at the end a combined failure will be
		// logged in.

	}
}
