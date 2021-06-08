package programmers;

public class Greedy_2 {

	static String name = "JEROEN";

	public static void main(String[] arg) {
		System.out.println(solution(name));
	}

	static int min_move = 0;

	public static int solution(String name) {
		int answer = 0;
		int len = name.length();

		min_move = len - 1;

		for (int i = 0; i < len; i++) {
			char c = name.charAt(i);
			int move = (c - 'A' < 'Z' - c + 1) ? c - 'A' : 'Z' - c + 1;

			int nextIndex = i + 1;

			while (nextIndex < len && name.charAt(nextIndex) == 'A')
				nextIndex++;

			min_move = Math.min(min_move, (i * 2) + len - nextIndex);

			answer += move;
		}

		answer += min_move;

		return answer;
	}
}
