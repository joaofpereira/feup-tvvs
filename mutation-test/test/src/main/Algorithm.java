package main;

public class Algorithm {
	public int gcd(int x, int y) {
		int tmp;
		while (y != 0) {
			tmp = x % y;
			x = y;
			y = tmp;
		}
		return x;
	}

	public int min(int x, int y) {
		int v;

		if (x < y)
			v = x;
		else
			v = y;

		return v;
	}

	public int numZero(int[] x) {
		int count = 0;

		for (int i = 0; i < x.length; i++)
			if (x[i] == 0)
				count++;

		return count;
	}

	public void negateArray(final float i, float a[]) {
		for(int k = 0; k < a.length; k++)
			a[k] = a[k] * (-i);
	}
	
	public int[] multiplyByTwoIntArray(int[] a) {
		int[] new_a = new int[a.length];
		for (int i = 0; i < new_a.length; ++i) {
			new_a[i] = a[i] << 1;
		}
		return new_a;
	}
	
	public boolean isLessThanThree(int number) {
		return (number < 3);
	}
}
