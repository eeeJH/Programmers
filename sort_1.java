package code;

import java.util.Arrays;

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
		int[] answer = new int[commands.length];

		for (int n = 0; n < commands.length; n++) {
			int i = commands[n][0];
			int j = commands[n][1];
			int k = commands[n][2];
			int arr_size = j - i + 1;

			//int[] arr = Arrays.copyOfRange(array, i - 1, j);
			
			int[] arr = new int[arr_size];
			System.arraycopy(array, i - 1, arr, 0, arr_size);
			
			Arrays.sort(arr);

			answer[n] = arr[k - 1];

		}

		return answer;
	}
}
