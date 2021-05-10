package code;

import java.util.*;

public class kakao_blind_2020_1 {

	static String input = "aaaaaabbbbbbaaabbbbbaaaaaaabbbbbbbbaaaaaaaa";
	static String input1 = "abcabcabcabcdededededede";

	public static void main(String arg[]) {
		System.out.println(solution(input));
	}

	static int min = Integer.MAX_VALUE;
	static int n = 0;

	public static int solution(String s) {

		while (n < s.length() / 2 + 1) {
			n++;
			check(n, s);
		}

		return min;
	}

	static class string {
		int count = 0;
		String str = "";

		public void setCount(int count) {
			this.count = count;
		}

	}

	public static void check(int n, String str) {

		String cal_str = "";
		ArrayList<string> list = new ArrayList<string>();
		Queue<String> q = new LinkedList<String>();

		int ptr = 0;

		while (ptr < str.length()) {

			if (ptr + n > str.length()) {

				String copy_str = str.substring(ptr);

				q.offer(copy_str);
				break;
			}

			String copy_str = str.substring(ptr, ptr + n);

			q.offer(copy_str);

			ptr = ptr + n;

		}

		while (!q.isEmpty()) {
			string s = new string();
			s.str = q.poll();
			s.count = 0;

			if (list.isEmpty()) {

				s.count = 1;
				list.add(s);

			} else if (!list.get(list.size() - 1).str.equals(s.str)) {

				s.count = 1;
				list.add(s);

			} else {

				list.get(list.size() - 1).count++;

			}

		}

		// System.out.println("list.size() : " + list.size());

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).count != 1) {

				cal_str += "" + list.get(i).count;
			}
			cal_str += list.get(i).str;
		}

		if (min > cal_str.length()) {
			min = cal_str.length();
		}

	}

}
