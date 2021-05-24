package programmers;

import java.util.*;

public class Exhaustive_Search_1 {

	static int[] answers = { 1, 2, 3, 4, 5 };

	public static void main(String arg[]) {
		int[] temp = solution(answers);

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}

	}

	public static int[] solution(int[] answers) {
		int[] first = { 1, 2, 3, 4, 5 };
		int[] second = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] third = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] arr = new int[3];

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == first[i % first.length]) {
				arr[0]++;
			}

			if (answers[i] == second[i % second.length]) {
				arr[1]++;
			}

			if (answers[i] == third[i % third.length]) {
				arr[2]++;
			}
			
		}
		
		int max = Arrays.stream(arr).max().getAsInt();
		
		////////////// 방법 1.
		ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                list.add(i + 1);
        }

        int[] ret = new int[list.size()];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }

        return ret;
		
		/* 방법 2. 런타임 에러
		int first_cnt = arr[0];
		int second_cnt = arr[1];
		int third_cnt = arr[2];

		int ans = 0;

		if (max == first_cnt) {
			ans++;
		}
		
		if (max == second_cnt) {
			ans++;
		}
		
		if (max == third_cnt) {
			ans++;
		}

		int[] ret = new int[ans];

		for (int i = 0; i < 3; i++) {
			if(arr[i] == max) {
				ret[i] = i+1;
			}
		}

		return ret;
		*/
	}
}
