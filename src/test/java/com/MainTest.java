package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testAdd_ValidInput_ShouldReturnSum() {
		Main main = new Main();
		assertEquals(2, main.add(1, 1), "1 + 1 should equal 2");
		assertEquals(5, main.add(5, 0), "5 + 0 should equal 5");
		assertEquals(0, main.add(0, 0), "0 + 0 should equal 0");
	}

	@Test
	void testAdd_NegativeInput_ShouldThrowException() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> {
			main.add(-1, 5);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			main.add(5, -1);
		});
	}

	@Test
	void testAdd_Overflow_ShouldThrowException() {
		Main main = new Main();
		assertThrows(ArithmeticException.class, () -> {
			main.add(Integer.MAX_VALUE, 1);
		});
	}

}
