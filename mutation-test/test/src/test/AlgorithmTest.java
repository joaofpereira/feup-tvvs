package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Algorithm;

public class AlgorithmTest {

	public Algorithm alg = new Algorithm();

	/**
	 * Test Min Function
	 *
	 * It's expected the mutant on line 21 cannot be killed Functionally
	 * Equivalent Mutant
	 */
	@Test
	public void TestMin() {
	
		int minimum = alg.Min(0, 0); // doesn't kill anyone of the mutants
		int minimum2 = alg.Min(0, 1); // only kill the negated conditional
										// mutant
		int minimum3 = alg.Min(1, 0); // only kill the negated conditional
										// mutant
	
		assertEquals(0, minimum);
		assertEquals(0, minimum2);
		assertEquals(0, minimum3);
	
	}

	/**
	 * Test SumArray Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	
	public void TestSumArrayException() {
	
		int a[] = null, b[] = { 1, 2, 3, 4 }, c[];
	
		c = alg.SumArray(a, b);
	
	}

	/**
	 * Test SumArray Function
	 */
	@Test
	public void TestSumArray() {
	
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 4 };
	
		int c[] = alg.SumArray(a, b);
	
		for (int i = 0; i < a.length; i++) {
			assertEquals(a[i] + b[i], c[i]);
		}
	
	}

	/**
	 * Test IndexOf Function
	 */
	
	@Test(expected = NullPointerException.class)
	public void TestIndexOf1() {
		int a[] = null;

		assertEquals(0, alg.IndexOf(a, 0));
	}

	@Test
	public void TestIndexOf2() {
		int b[] = {};

		assertEquals(-1, alg.IndexOf(b, 0));
	}
	
	@Test
	public void TestIndexOf3() {
		int c[] = {1};

		assertEquals(-1, alg.IndexOf(c, 0));
	}
	
	@Test
	public void TestIndexOf4() {
		int d[] = {0};

		assertEquals(0, alg.IndexOf(d, 0));
	}

}
