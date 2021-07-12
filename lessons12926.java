package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.12
*/

public class lessons12926 {

	static String s = "z";
	static int n = 1;

	public static void main(String[] arg) {
		System.out.println(solution(s, n));
	}

	public static String solution(String s, int n) {
		// A = 65 Z = 90
		// a = 97 z = 122
		char[] answer = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				if (s.charAt(i) + n > 90) {
					answer[i] = (char) (s.charAt(i) + n - 26);
				} else {
					answer[i] = (char) (s.charAt(i) + n);
				}
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				if (s.charAt(i) + n > 122) {
					answer[i] = (char) (s.charAt(i) + n - 26);
				} else {
					answer[i] = (char) (s.charAt(i) + n);
				}
			} else {
				answer[i] = s.charAt(i);
			}
		}

		return String.valueOf(answer);
	}
}
