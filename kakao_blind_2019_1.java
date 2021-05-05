package code;

import java.util.*;

public class kakao_blind_2019_1 {
	static int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
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
			stages_fail = (double)people / (double)all_people;
			
			m.put(stage, stages_fail);
			
		}
		
		

	
		return answer;
	}
}
