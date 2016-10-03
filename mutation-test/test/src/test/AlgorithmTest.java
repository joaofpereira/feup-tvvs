package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Algorithm;

public class AlgorithmTest {

	public final float floatTolerance = 0.0001f;
	
	public Algorithm alg = new Algorithm();

	/**
	 * Test gcd function
	 */
	@Test
	public void TestGCD() {
		assertEquals(1, alg.gcd(2, 1));
	}

	/**
	 * Test min function
	 *
	 * It's expected the mutant on line 21 cannot be killed Functionally
	 * Equivalent Mutant
	 */
	@Test
	public void TestMin() {

		int minimum = alg.min(0, 0); // doesn't kill anyone of the mutants
		int minimum2 = alg.min(0, 1); // only kill the negated conditional
										// mutant
		int minimum3 = alg.min(1, 0); // only kill the negated conditional
										// mutant

		assertEquals(0, minimum);
		assertEquals(0, minimum2);
		assertEquals(0, minimum3);

	}

	/**
	 * Test numZero function
	 */
	@Test
	public void TestNumZero() {
		int a[] = {0};

		assertEquals(1, alg.numZero(a));
	}
	
	/**
	 * Test negateArray function
	 */
	@Test
	public void TestNegateArray() {
		float[] a = {1, 2, 4};
		float b[] = new float[a.length];
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		alg.negateArray(2, a);
		
		for(int i = 0; i < a.length; i++)
			assertEquals(b[i] * (-2), a[i], floatTolerance);
	}
	
	/**
	 * Test multiplyByTwoIntArray function
	 */
	@Test
	public void MultiplyByTwoIntArrayTest() {
		int[] array = { 1, 2, 3, 4 };
		
		int[] result = alg.multiplyByTwoIntArray(array);
		
		for(int i = 0; i < result.length; ++i) {
			assertTrue(result[i] == array[i] * 2);
		}
	}
	
	@Test
	public void testLessThanThree() {
		assertTrue(alg.isLessThanThree(2));
	}
	
	@Test
	public void testLessThanThree2() {
		assertFalse(alg.isLessThanThree(3));
	}
}
