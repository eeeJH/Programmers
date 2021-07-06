package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.06
 * 
 * <p>
		문자열 다루기 기본
		
		문제 설명
		문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
		
 * </p>
*/

public class lessons12918 {

	static String s = "a234";

	public static void main(String[] arg) {
		System.out.println(solution(s));
	}

//	public static boolean solution(String s) {
//		if ((s.length() == 4 || s.length() == 6)) {
//			for (int i = 0; i < s.length(); i++) {
//				if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
//					return false;
//				}
//			}
//		} else {
//			return false;
//		}
//
//		return true;
//	}

	public static boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			return s.matches("(^[0-9]*$)");
		}
		return false;
	}
}
