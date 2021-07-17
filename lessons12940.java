package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.12
*/
public class lessons12940 {
	static int n = 3;
	static int m = 12;

	public static void main(String[] arg) {
		System.out.println(solution(n, m));
	}

	public static int[] solution(int n, int m) {
		int a = 0;
		int b = 0;
		int c = n * m;
		int temp = 1;
		while (temp != 0) {
			temp = n % m;
			n = m;
			m = temp;
		}

		a = n;
		b = c / n;

		return new int[] { a, b };
	}
}
