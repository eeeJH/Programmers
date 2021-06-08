package study;

public class fib {

	public static void main(String arg[]) {
		int n = 8;
		d = new int[n];

		System.out.println(fib1(n));
		System.out.println(fib2(n));

	}

	public static int fib1(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		return fib1(n - 1) + fib1(n - 2);

	}

	static int[] d;

	public static int fib2(int n) {
		d[0] = 1;
		d[1] = 1;

		for (int i = 2; i < n; i++) {
			d[i] = d[i - 1] + d[i - 2];
		}

		return d[n - 1];
	}
}
