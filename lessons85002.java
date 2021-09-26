package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/85002
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.09.26
 * 
 * <p>
		복서 정렬하기 
		
 * </p>
*/

public class lessons85002 {

	static int[] weights = { 50, 82, 75, 120 };
	static int[] weights1 = { 60, 70, 60 };
	static String[] head2haed = { "NLWL", "WNLL", "LWNW", "WWLN" };
	static String[] head2haed1 = { "NNN", "NNN", "NNN" };

	public static void main(String[] arg) {
		int[] temp = solution(weights1, head2haed1);

		System.out.println("결과");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}

	public static int[] solution(int[] weights, String[] head2head) {
		int len = weights.length;
		int[] answer = new int[len];
		int[] heavyWCnt = new int[len];
		double[] rate = new double[len];

		for (int i = 0; i < len; i++) {

			double w = 0;
			double l = 0;
			double n = 0;

			for (int j = 0; j < len; j++) {

				if (i == j) {
					continue;
				}

				if (head2head[i].charAt(j) == 'W') {
					w++;
					if (weights[i] < weights[j]) {
						heavyWCnt[i]++;
					}
				} else if (head2head[i].charAt(j) == 'L') {
					l++;
				} else {
					n++;
				}

			}

			if (n == len - 1) {
				rate[i] = 0;
			} else {
                rate[i] = (w * 100) / (w + l);
            }
		}

		for (int i = 0; i < len; i++) {
			answer[i] = i + 1;
		}

		// 정렬
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				int temp = 0;
				if (rate[answer[i] - 1] < rate[answer[j] - 1]) { // 승률이 높은 순서 

					temp = answer[j];
					answer[j] = answer[i];
					answer[i] = temp;

				} else if (rate[answer[i] - 1] == rate[answer[j] - 1]) {

					if (heavyWCnt[answer[i] - 1] < heavyWCnt[answer[j] - 1]) { // 헤비선수 이긴 횟수가 많은 순서 

						temp = answer[j];
						answer[j] = answer[i];
						answer[i] = temp;

					} else if (heavyWCnt[answer[i] - 1] == heavyWCnt[answer[j] - 1]) {

						if (weights[answer[i] - 1] < weights[answer[j] - 1]) { // 무게 가벼운 순서 

							temp = answer[j];
							answer[j] = answer[i];
							answer[i] = temp;

						} else if (weights[answer[i] - 1] == weights[answer[j] - 1]) { // 번호가 작은 순서 

							if (answer[i] > answer[j]) {

								temp = answer[j];
								answer[j] = answer[i];
								answer[i] = temp;

							}
						}
					}
				}
			}
		}

		return answer;
	}
}
