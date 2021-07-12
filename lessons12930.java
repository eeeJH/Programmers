package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.12
*/

public class lessons12930 {

	static String s = "try hello wor   ld a a aaaaaa    a   a s sdfaa a        ";

	public static void main(String[] arg) {
		System.out.println(solution(s));
	}

	public static String solution(String s) {
//		StringBuilder sb = new StringBuilder();
//
//		String[] str = s.split(" ", -1);
//
//		for (int i = 0; i < str.length; i++) {
//			char[] word = new char[str[i].length()];
//
//			for (int idx = 0; idx < str[i].length(); idx++) {
//				if (idx % 2 == 0) {
//					if (str[i].charAt(idx) >= 65 && str[i].charAt(idx) <= 90) {
//						word[idx] = str[i].charAt(idx);
//					} else if (str[i].charAt(idx) >= 97 && str[i].charAt(idx) <= 122) {
//						word[idx] = (char) (str[i].charAt(idx) - 32);
//					}
//				} else {
//					if (str[i].charAt(idx) >= 65 && str[i].charAt(idx) <= 90) {
//						word[idx] = (char) (str[i].charAt(idx) + 32);
//					} else if (str[i].charAt(idx) >= 97 && str[i].charAt(idx) <= 122) {
//						word[idx] = str[i].charAt(idx);
//					}
//				}
//			}
//
//			sb.append(String.valueOf(word)).append(" ");
//		}
//
//		return sb.toString().substring(0, sb.length() - 1);

		String answer = "";
		int cnt = 0;
		String[] array = s.split("");

		for (String str : array) {
			cnt = str.contains(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
		}
		
		return answer;
	}
}
