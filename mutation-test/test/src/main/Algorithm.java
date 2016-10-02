package main;

public class Algorithm {

	public int[] SumArray(int[] a, int[] b) {
		if (a == null || b == null || a.length != b.length) {
			throw new IllegalArgumentException();
		}

		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}

		return c;
	}

	public int Min(int x, int y) {
		int v;

		if (x < y)
			v = x;
		else
			v = y;

		return v;
	}
	
	/**
	 * Mutations are: (m1) i < array.length ---> i >= array.length
	 * (m2) array[i] == v ---> array[i] != v
	 * (m3) i++ ---> i--
	 */
	public int IndexOf(int[] array, int v) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == v) {
				return i;
			}
		}

		return -1;
	}
}
