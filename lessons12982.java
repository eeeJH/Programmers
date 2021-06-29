package programmers;

import java.util.Arrays;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.06.29
*/

public class lessons12982 {
	// 1. 조합
	/*
	 * static int[] d = { 1, 3, 2, 5, 4 }; static int budget = 9;
	 * 
	 * public static void main(String[] arg) { System.out.println(solution(d,
	 * budget)); }
	 * 
	 * static int answer = 0;
	 * 
	 * public static int solution(int[] d, int budget) { boolean[] visited = new
	 * boolean[d.length]; for (int i = 1; i <= d.length; i++) {
	 * 
	 * sol(d, visited, 0, i, budget); }
	 * 
	 * return answer; }
	 * 
	 * public static void sol(int[] d, boolean[] visited, int start, int r, int
	 * budget) { if (r == 0) { cal(d, visited, budget); return; } else { for (int i
	 * = start; i < d.length; i++) { visited[i] = true; sol(d, visited, i + 1, r -
	 * 1, budget); visited[i] = false; } } }
	 * 
	 * public static void cal(int[] d, boolean[] visited, int budget) { int sum = 0;
	 * int count = 0; for (int i = 0; i < d.length; i++) { if (visited[i]) {
	 * count++; sum += d[i]; } } if (sum <= budget) { if (answer < count) { answer =
	 * count; } } }
	 */
	
	// 2. 반복문 

	static int[] d = { 1, 3, 2, 5, 4 };
	static int budget = 9;

	public static void main(String[] arg) {
		System.out.println(solution(d, budget));
	}

	static int answer = 0;

	public static int solution(int[] d, int budget) {
		int count = 0;
		int sum = 0;
		Arrays.sort(d);
		for (int i = 0; i <= d.length; i++) {
			sum += d[i];
			if (sum > budget) {
				break;
			} else {
				count++;
			}
		}

		return count;
	}
}
