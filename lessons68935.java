package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.06.30
*/

public class lessons68935 {

	static int n = 45;

	public static void main(String[] arg) {
		System.out.println(solution(n));
	}

	// 런타임 에러
	/*
	 * public static int solution(int n) {
	 * 
	 * return tenN(Integer.parseInt(reverseString(threeN(n))), 0); }
	 * 
	 * public static String threeN(int n) { String s = "";
	 * 
	 * if (n % 3 == 2) { s += 2; } else if (n % 3 == 1) { s += 1; } else { s += 0; }
	 * 
	 * return n / 3 > 0 ? threeN(n / 3) + s : s; }
	 * 
	 * public static String reverseString(String s) { StringBuffer sb = new
	 * StringBuffer(s); String reverseString = sb.reverse().toString(); return
	 * reverseString; }
	 * 
	 * public static int tenN(int n, int count) { int num = (int) (1 * Math.pow(3,
	 * count)) * (n % 10);
	 * 
	 * return n / 10 > 0 ? tenN(n / 10, count + 1) + num : num; }
	 */

	//
	public static int solution(int n) {
		return tenN(threeN(n));
	}

	public static String threeN(int n) {
		String s = "";

		if (n % 3 == 2) {
			s += 2;
		} else if (n % 3 == 1) {
			s += 1;
		} else {
			s += 0;
		}

		return n / 3 > 0 ? threeN(n / 3) + s : s;
	}

	public static int tenN(String s) {

		int n = 0;

		for (int i = 0; i < s.length(); i++) {
			n += (s.charAt(i) - '0') * Math.pow(3, i);
		}

		return n;
	}
}
