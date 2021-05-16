package code;

public class sort_1 {
	static int[] array = { 1, 5, 2, 6, 3, 7, 4 };
	static int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

	public static void main(String arg[]) {
		int[] temp = solution(array, commands);

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}

	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
        return answer;
	}
}
