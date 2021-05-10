package code;

public class kakao_blind_2018_3 {

	static int n = 16;
	static int t = 16;
	static int m = 2;
	static int p = 1;

	public static void main(String arg[]) {
		System.out.println(solution(n, t, m, p));
	}

	public static String solution(int n, int t, int m, int p) {
		String answer = "";
		int totalLength = t * m;
		String words = "";

		for (int i = 0; i < totalLength; i++) {
			words += convert(i, n);
		}

		for (int i = 0; i < words.length(); i++) {
			if (i % m == p - 1) {
				answer += words.charAt(i);
			}
		}

		return answer.substring(0, t);
	}

	public static String convert(int i, int n) {

		String str = "";

		int a = i % n;

		switch (a) {
		case 10:
			str = "A";
			break;
		case 11:
			str = "B";
			break;
		case 12:
			str = "C";
			break;
		case 13:
			str = "D";
			break;
		case 14:
			str = "E";
			break;
		case 15:
			str = "F";
			break;
		default:
			str = a + "";
			break;
		}

		return i / n > 0 ? convert(i / n, n) + str : str;
	}

}
