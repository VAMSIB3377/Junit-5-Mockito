package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestcaseA {

	@Test
	void test() {

		JunitTesting test = new JunitTesting();
		int out = test.countA("aab");
		assertEquals(2,out);
	}

}
