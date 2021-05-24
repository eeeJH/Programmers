package programmers;

import java.util.*;

public class Heap_1 {

	static int[] scoville = { 1, 2, 3, 9, 10, 12 };
	static int K = 7;

	public static void main(String arg[]) {
		System.out.println(solution(scoville, K));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;

		Arrays.sort(scoville);

		for (int i = scoville.length - 1; i >= 1; i--) {

			if (check(scoville, K)) {
				break;
			} else {
				answer++;
			}
			
			scoville[scoville.length - i] = scoville[scoville.length - i - 1] + scoville[scoville.length - i] * 2;

			Arrays.sort(scoville);

			int[] new_scov = new int[scoville.length - 1];

			for (int j = 0; j < new_scov.length; j++) {
				new_scov[j] = scoville[j + 1];
			}

			System.out.println();
			for (int z = 0; z < scoville.length; z++) {
				System.out.print(scoville[z] + " ");
			}
			System.out.println();
			System.out.println();
			
			scoville = new_scov;
		}

		return answer;
	}

	public static boolean check(int[] arr, int k) {
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < k) {
				flag = false;
				break;
			}
		}

		return flag;
	}
}
