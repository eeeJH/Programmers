package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.12
*/

public class lessons12932 {

	static long n = 34342;

	public static void main(String[] arg) {
		System.out.println(solution(n));
	}

	public static long solution(long n) {
		long answer = (long) Math.sqrt(n);

		if (n == (long) Math.pow(answer, 2)) {
			return (long) Math.pow(answer + 1, 2);
		} else {
			return -1;
		}
	}
}
