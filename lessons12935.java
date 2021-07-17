package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.15
*/

public class lessons12935 {

	static int[] arr = { 4, 5, 3, 0, 12, 24, 222, 2, 1 };

	public static void main(String[] arg) {
		System.out.println(solution(arr));
	}

	public static int[] solution(int[] arr) {
		int temp = Integer.MAX_VALUE;
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < temp) {
				temp = arr[i];
				idx = i;
			}
		}

		int[] answer = new int[arr.length - 1];

		if (answer.length == 0) {
			return new int[] { -1 };
		} else {
			int i = 0;
			int j = 0;
			while (i < answer.length) {

				if (idx == j) {
					j++;
				}

				answer[i++] = arr[j++];
			}
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}

		return answer;
	}
}
