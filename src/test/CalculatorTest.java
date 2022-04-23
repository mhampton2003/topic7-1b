package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.Calculator;
import junit.framework.*;

public class CalculatorTest {

	/**
	 * tests add function
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		// 2 + 1 = 3
		Assert.assertEquals(3,  calc.add(2, 1));
		// 5 + 2 = 7
		Assert.assertEquals(7,  calc.add(5, 2));
	}

	/**
	 * tests subtract function
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		// 2 - 1 = 1
		Assert.assertEquals(1,  calc.subtract(2, 1));
		// 5 - 2 = 3
		Assert.assertEquals(3,  calc.subtract(5, 2));
	}

	/**
	 * tests multiply function
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		// 2 * 1 = 2
		Assert.assertEquals(2,  calc.multiply(2, 1));
		// 5 * 2 = 10
		Assert.assertEquals(10,  calc.multiply(5, 2));
	}

	/**
	 * tests divide function
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		// 2 / 1 = 2
		Assert.assertEquals(2,  calc.divide(2, 1));
		// 5 / 2 = 2
		Assert.assertEquals(2,  calc.divide(5, 2));
	}

}
