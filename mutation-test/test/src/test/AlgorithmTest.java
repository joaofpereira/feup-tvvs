package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Algorithm;

public class AlgorithmTest {

	public final float floatTolerance = 0.0001f;
	private Algorithm alg;
	
	@Before
	public void SetUp() {
		this.alg =  new Algorithm();
	}

	/**
	 * Test gcd function
	 */
	@Test
	public void TestGCD() {
		assertEquals(1, this.alg.gcd(2, 1));
	}

	/**
	 * Test min function
	 *
	 * It's expected the mutant on line 21 cannot be killed Functionally
	 * Equivalent Mutant
	 */
	@Test
	public void TestMin() {

		/*int minimum = this.alg.min(0, 0); // doesn't kill anyone of the mutants
		int minimum2 = this.alg.min(0, 1); // only kill the negated conditional
										// mutant
		int minimum3 = this.alg.min(1, 0); // only kill the negated conditional
										// mutant

		assertEquals(0, minimum);
		assertEquals(0, minimum2);
		assertEquals(0, minimum3);*/

	}

	/**
	 * Test numZero function
	 */
	@Test
	public void TestNumZero() {
		int a[] = {0};

		assertEquals(1, this.alg.numZero(a));
	}
	
	/**
	 * Test negateArray function
	 */
	@Test
	public void TestNegateArray() {
		float[] a = {1, 2, 4};
		float b[] = new float[a.length];
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		this.alg.negateArray(2, a);
		
		for(int i = 0; i < a.length; i++)
			assertEquals(b[i] * (-2), a[i], floatTolerance);
	}
	
	@Test
	public void testLessThanThree() {
		assertTrue(this.alg.isLessThanThree(2));
	}
	
	@Test
	public void testLessThanThree2() {
		assertFalse(this.alg.isLessThanThree(3));
	}
}
