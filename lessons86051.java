package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/86051
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.09.26
 * 
 * <p>
		없는 숫자 더하기
		
 * </p>
*/

public class lessons86051 {

	static int[] numbers = { 5, 8, 4, 0, 6, 7, 9 };

	public static void main(String[] arg) {
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
		int answer = 45;

		for (int i = 0; i < numbers.length; i++) {
			answer -= numbers[i];
		}

		return answer;
	}
}