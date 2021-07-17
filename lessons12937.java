package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12937
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.15
*/
public class lessons12937 {

	static int num = 3;

	public static void main(String[] arg) {
		System.out.println(solution(num));
	}

	public static String solution(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}
}
