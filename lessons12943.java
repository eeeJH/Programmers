package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.08.06
 * 
 * <p>
		콜라측 추
		
 * </p>
*/

public class lessons12943 {

	static int num = 6;

	public static void main(String[] arg) {
		System.out.println(solution(num));
	}

	public static int solution(int num) {
		int answer = 0;

		while (num != 1) {

			if (num % 2 == 0) {
				num = num / 2;
			} else if (num % 2 == 1) {
				num = num * 3 + 1;
			}

			answer++;

			if (answer == 500) {
				answer = -1;
				break;
			}
		}

		return answer;
	}
}
