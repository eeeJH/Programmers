package programmers;

import java.util.*;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.06.30
*/

public class lessons68644 {

	static int[] numbers = { 5, 0, 2, 7 };

	public static void main(String[] arg) {
		solution(numbers);
	}

	static HashSet<Integer> m = new HashSet<Integer>();

	public static int[] solution(int[] numbers) {

		boolean[] visited = new boolean[numbers.length];

		cal(numbers, visited, 0, 2);

		/*
		 * Iterator iter = m.iterator(); while (iter.hasNext()) {
		 * System.out.println(iter.next()); }
		 */

		ArrayList<Integer> list = new ArrayList<>(m);
		Collections.sort(list);
		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void cal(int[] numbers, boolean[] visited, int start, int r) {
		if (0 == r) {
			sum(numbers, visited);
			return;
		} else {
			for (int i = start; i < numbers.length; i++) {
				visited[i] = true;
				cal(numbers, visited, i + 1, r - 1);
				visited[i] = false;
			}
		}

	}

	public static void sum(int[] numbers, boolean[] visited) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (visited[i]) {
				sum += numbers[i];
			}
		}
		m.add(sum);
	}
}
