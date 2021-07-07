package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.07
 * 
 * <p>
		문자열을 정수로 바꾸기
		
		문자열 s를	 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
		
 * </p>
*/

public class lessons12925 {

	static String s = "1+4-2";

	public static void main(String[] arg) {
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		int answer = 0;
		String[] str = s.split("");
		int n = 1;
		String number = "0";

		for (int i = 0; i < str.length; i++) {

			if (str[i].equals("+")) {
				answer += Integer.parseInt(number) * n;
				number = "0";
				n = 1;
			} else if (str[i].equals("-")) {
				answer += Integer.parseInt(number) * n;
				number = "0";
				n = -1;
			} else {
				number += str[i];
			}
		}

		return answer + Integer.parseInt(number) * n;
	}
}
