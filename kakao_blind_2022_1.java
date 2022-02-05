package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/92334
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2022.02.05
 * 
 * <p>
  		KAKAO BLIND 2022
		신고 결과 받기 
 * </p>
*/

public class kakao_blind_2022_1 {

	static String[] id_list = { "muzi", "frodo", "apeach", "neo" };
	static String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
	static int k = 2;

	public static void main(String arg[]) {

		int[] temp = solution(id_list, report, k);

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		int id_list_len = id_list.length;
		int[] answer = new int[id_list_len];
		boolean[][] map = new boolean[id_list_len][id_list_len];
		boolean[] warningUser = new boolean[id_list_len];

		for (int i = 0; i < report.length; i++) {

			String[] reports = report[i].split(" ");

			// split reporter & reportee
			String reporter = reports[0];
			String reportee = reports[1];

			// find reporter index
			for (int j = 0; j < id_list_len; j++) {

				if (reporter.equals(id_list[j])) {

					// find reportee index
					for (int l = 0; l < id_list_len; l++) {

						if (reportee.equals(id_list[l])) {

							if (!map[j][l]) {
								map[j][l] = true;
								answer[l]++;
							}

						}
					}

				}
			}
		}

		for (int i = 0; i < id_list_len; i++) {
			if (answer[i] >= k) {
				warningUser[i] = true;
			}
		}

		int[] ret = new int[id_list_len];

		for (int i = 0; i < warningUser.length; i++) {
			if (warningUser[i]) {

				for (int j = 0; j < id_list_len; j++) {
					if(map[j][i]) {
						ret[j]++;
					}
				}

			}
		}

		return ret;
	}
}
