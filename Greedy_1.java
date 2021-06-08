package programmers;

public class Greedy_1 {
	static int n = 5;
	static int[] lost = { 2, 4 };
	static int[] reserve = { 1, 3, 5 };

	public static void main(String[] arg) {
		System.out.println(solution(n, lost, reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		int[] ret = new int[n];

		for (int i : reserve) {
			ret[i - 1]++;
		}

		for (int i : lost) {
			ret[i - 1]--;
		}

		for (int i = 0; i < ret.length; i++) {
			if (ret[i] < 0) {
				if (i != ret.length - 1 && ret[i + 1] > 0) {
					ret[i]++;
					ret[i + 1]--;
				} else if (i != 0 && ret[i - 1] > 0) {
					ret[i]++;
					ret[i - 1]--;
				}
			}
		}

		for (int i = 0; i < ret.length; i++) {
			if (ret[i] > -1) {
				answer++;
			}
		}

		return answer;
	}
}
