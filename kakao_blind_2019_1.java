package programmers;

import java.util.*;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2022.02.05
 * 
 * <p>
  		KAKAO BLIND 2019
 		실패율 
 * </p>
*/

public class kakao_blind_2019_1 {
	static int[] stages = { 1, 1, 1, 1, 1, 1, 1, 1 };
	static int n = 5;

	public static void main(String arg[]) {

		int[] temp = solution(n, stages);

		for (int i = 0; i < n; i++) {
			System.out.print(temp[i]);
		}
	}

	static double stages_fail;
	static Map<Integer, Double> m = new HashMap<Integer, Double>();

	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];

		for (int stage = 1; stage <= N; stage++) {

			int people = 0;
			int all_people = 0;

			for (int i = 0; i < stages.length; i++) {

				if (stage <= stages[i]) {
					all_people += 1;
				}

				if (stage == stages[i]) {
					people += 1;
				}

			}

			m.put(stage, people != 0 && all_people != 0 ? (double) people / (double) all_people : 0);

		}

		for (int i = 0; i < N; i++) {
			double max = -1;
			int cur_key = 0;

			for (Integer k : m.keySet()) {

				if (max < m.get(k)) {
					max = m.get(k);
					cur_key = k;
				}

			}

			answer[i] = cur_key;
			m.remove(cur_key);
		}

		return answer;
	}
}
