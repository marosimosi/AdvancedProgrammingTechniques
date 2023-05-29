package subtract;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractTest {

	@Test
	void testSub() {
		Main tester = new Main();
		assertEquals("NEGATIVE", tester.sub(4,7), "4-7 < 0");
	}

}
