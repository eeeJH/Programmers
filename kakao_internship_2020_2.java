package code;
import java.util.*;

public class kakao_internship_2020_2 {

	public static void main(String arg[]) {
		System.out.println(solution("100-200*300-500+20"));
	}

	static List<String> operation = new ArrayList<String>();
	// 숫자가 연산자보다 1개가 더 많다.
	static List<Long> numbers = new ArrayList<Long>();
	static String[] baseOp = { "+", "-", "*" };
	static boolean[] visited = new boolean[3];
	static String[] op = new String[3];
	static String[] str;

	static long max = 0;

	public static long solution(String expression) {
		String number = "";

		str = expression.split("/*");

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("*") || str[i].equals("-") || str[i].equals("+")) {
				numbers.add(Long.parseLong(number));
				number = "";

				operation.add(str[i]);
			} else {
				number += str[i];

			}
		}

		numbers.add(Long.parseLong(number));

		dfs(0);

		return max;
	}

	static void dfs(int dept) {
		if (dept == 3) {
			// 계산
			solve();
		}

		for (int i = 0; i < 3; i++) {
			if (!visited[i]) {
				visited[i] = true;
				op[dept] = baseOp[i];
				dfs(dept + 1);
				visited[i] = false;
			}
		}
	}

	static void solve() {

		List<String> copy_operation = new ArrayList<String>(operation);
		List<Long> copy_numbers = new ArrayList<Long>(numbers);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < copy_operation.size(); j++) {

				if (op[i].equals(copy_operation.get(j))) {

					for(int z = 0; z < copy_numbers.size(); z++) {
						System.out.println(copy_numbers.get(z));
					}
					
					long calNumber = cal(copy_numbers.remove(j), copy_numbers.remove(j), op[i]);
					System.out.println();
					System.out.println();
					
					copy_numbers.add(j, calNumber);
					copy_operation.remove(j);
					j--;

				}

			}
		}

		max = Math.max(max, Math.abs(copy_numbers.get(0)));

	}

	static long cal(long a, long b, String operation) {
		if (operation.equals("+")) {
			return a + b;
		} else if (operation.equals("*")) {
			return a * b;
		} else {
			return a - b;
		}
	}

}
