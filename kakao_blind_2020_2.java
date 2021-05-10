package code;

public class kakao_blind_2020_2 {

	public static void main(String arg[]) {
		System.out.println(solution("((()))()"));
	}

	public static String solution(String p) {

		int leftCount = 0;
		int rightCount = 0;
		int n = 0;
		String str = "";

		if (p.length() == 0) {
			return "";
		}

		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				leftCount++;
			} else if (p.charAt(i) == ')') {
				rightCount++;
			}

			if (leftCount == rightCount) {
				n = i;
				break;
			}
		}

		String u = p.substring(0, n + 1);
		String v = p.substring(n + 1, p.length());

		if (check(u)) {
			return u + solution(v);
		} else {
			str = "(" + solution(v) + ")";
			u = u.substring(1, u.length() - 1);
			u = reverseU(u);
			return str + u;
		}
	}

	public static boolean check(String u) {
		String[] sp = u.split("");
		int n = 0;

		for (String str : sp) {
			if (str.equals("(")) {
				n++;
			} else {
				n--;
			}

			if (n < 0) {
				return false;
			}
		}

		return true;
	}

	public static String reverseU(String u) {
		String[] sp = u.split("");
		String st = "";

		for (String str : sp) {

			if (str.equals("(")) {
				st += ")";
			} else {
				st += "(";
			}

		}

		return st;
	}

}
