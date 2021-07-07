package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.07
 * 
 * <p>
		수박수박수박수박수박수?
		
		길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
		예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
		
 * </p>
*/

public class lessons12922 {
	static int n = 10;

	public static void main(String[] arg) {
		System.out.println(solution(n));
	}

	public static String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}
		return answer;
	}
}
