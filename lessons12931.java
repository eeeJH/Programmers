package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.12
*/

public class lessons12931 {

	static int N = 987;

	public static void main(String[] arg) {
		System.out.println(solution(N));
	}

	public static int solution(int n) {
		int answer = 0;

		while (n != 0) {
			answer += n % 10;
			n = n / 10;
		}

		return answer;
	}
}
