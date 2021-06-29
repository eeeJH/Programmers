package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.06.29
*/

public class lessons43165 {

	static int[] numbers = { 1, 1, 1, 1, 1 };
	static int target = 3;

	public static void main(String[] arg) {
		System.out.println(solution(numbers, target));
	}

	static int answer = 0;

	public static int solution(int[] numbers, int target) {

		boolean[] visited = new boolean[numbers.length];
		for (int r = 0; r <= numbers.length; r++) {
			System.out.println("\n" + numbers.length + "개 중에 " + r + "개 +");
			dfs(numbers, visited, target, r, 0);
		}
		return answer;
	}

	public static void dfs(int[] numbers, boolean[] visited, int target, int r, int start) {
		if (r == 0) {
			if (print(numbers, visited) == target) {
				answer++;
			}
			return;
		} else {
			for (int i = start; i < numbers.length; i++) {

				visited[i] = true;
				dfs(numbers, visited, target, r - 1, i + 1);
				visited[i] = false;
			}
		}
	}

	public static int print(int[] numbers, boolean[] visited) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (visited[i]) {
				sum += numbers[i];
				System.out.print(numbers[i] + " ");
			} else {
				sum -= numbers[i];
				System.out.print(-numbers[i] + " ");
			}

		}
		System.out.println("sum : " + sum);
		System.out.println();

		return sum;
	}
}
