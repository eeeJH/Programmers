package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/77884
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.06.29
*/

public class lessons77884 {

	static int left = 13;
	static int right = 17;

	public static void main(String[] arg) {
		System.out.println(solution(left, right));
	}

	public static int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			answer += cal(i);
		}

		return answer;
	}

	public static int cal(int n) {
		int count = 0;
		int num = 1;
		while (num <= n) {
			if (n % num == 0) {
				count++;
			}
			num++;
		}

		return count % 2 == 0 ? n : (n * -1);
	}
}
