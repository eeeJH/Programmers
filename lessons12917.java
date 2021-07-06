package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.06
 * 
 * <p>
 * 		문자열 내림차순으로 배치하기
 * 
		문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
		s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
		
 * </p>
*/

import java.util.Arrays;

public class lessons12917 {

	static String s = "Zbcdefg";

	public static void main(String[] arg) {
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		char[] c;
		c = s.toCharArray();
		Arrays.sort(c);
		StringBuilder sb = new StringBuilder(new String(c));
		return sb.reverse().toString();
	}
}
