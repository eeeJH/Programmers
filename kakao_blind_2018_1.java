package code;

public class kakao_blind_2018_1 {

	static int n = 5;
	static int[] arr1 = { 9, 20, 28, 18, 11 };
	static int[] arr2 = { 30, 1, 21, 17, 28 };

	public static void main(String arg[]) {

		String[] temp = solution(n, arr1, arr2);

		for (int i = 0; i < n; i++) {
			System.out.println(temp[i]);
		}

	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String[] map1 = convert(arr1);
		String[] map2 = convert(arr2);

		for (int y = 0; y < n; y++) {
			char[] str = new char[n];

			for (int x = 0; x < n; x++) {
				str[x] = compare(map1[y].charAt(x), map2[y].charAt(x));
			}

			answer[y] = new String(str);
		}

		return answer;
	}

	public static String[] convert(int[] arr) {
		String[] str = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			str[i] = cal(arr[i]);
			if (str[i].length() < str.length) {
				while (str[i].length() < str.length) {
					str[i] = " " + str[i];
				}
			}
		}

		return str;
	}

	public static String cal(int num) {
		String str = "";

		if (num % 2 == 0) {
			str = " ";
		} else {
			str = "#";
		}

		return num / 2 > 0 ? cal(num / 2) + str : str;
	}

	public static char compare(char a, char b) {

		if (a == ' ') {
			if (a == b) {
				return ' ';
			} else {
				return '#';
			}
		} else {
			return '#';
		}

	}

}
