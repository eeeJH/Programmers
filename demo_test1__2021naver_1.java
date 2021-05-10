package code;

public class demo_test1__2021naver_1 {

	static int x;
	static int y;

	public static void main(String arg[]) {
		int[][] v = { { 1, 4 }, { 3, 4 }, { 3, 10 } };
		// int[][] v = { { 1, 1 }, { 2, 2 }, { 2, 1 } };
		int[] answer = new int[2];

		if (v[0][0] == v[1][0]) {
			x = v[2][0];
		} else if (v[0][0] == v[2][0]) {
			x = v[1][0];
		} else {
			x = v[0][0];
		}

		if (v[0][1] == v[1][1]) {
			y = v[2][1];
		} else if (v[0][1] == v[2][1]) {
			y = v[1][1];
		} else {
			y = v[0][1];
		}

		answer[0] = x;
		answer[1] = y;

		System.out.println();
		System.out.println(answer[0]);
		System.out.println(answer[1]);

	}
}
