package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12916
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.06
*/

public class lessons12916 {

	static String s = "PPPyyPyY";

	public static void main(String[] arg) {
		System.out.println(solution(s));
	}

//	static boolean solution(String s) {
//		s = s.toLowerCase();
//
//		int p = 0;
//		int y = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == 112) {
//				p++;
//			} else if (s.charAt(i) == 121) {
//				y++;
//			}
//		}
//		return p == y ? true : false;
//	}
	static boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
