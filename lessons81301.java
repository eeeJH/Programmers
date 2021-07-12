package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/81301
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.12
*/

public class lessons81301 {

	static String s = "one4seveneight";

	public static void main(String[] arg) {
		System.out.println(solution(s));
	}

	public static int solution(String s) {

		s = s.replace("zero", "0").replace("one", "1").replace("two", "2").replace("three", "3").replace("four", "4").replace("five", "5")
				.replace("six", "6").replace("seven", "7").replace("eight", "8").replace("nine", "9");

		return Integer.parseInt(s);
	}
}
