package programmers;

import java.util.*;

public class DP_1 {

	static int N = 5;
	static int number = 12;

	public static void main(String arg[]) {
		System.out.println(solution(N, number));
	}

	public static int solution(int N, int number) {
		int answer = -1;

		@SuppressWarnings("unchecked")
		Set<Integer>[] arr = new Set[9];

		int init = N;

		for (int i = 1; i <= 8; i++) {
			arr[i] = new HashSet<>();
			arr[i].add(init);
			init = init * 10 + N;
		}

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j < i; j++) {
				for (Integer J : arr[j]) {
					for (Integer I : arr[i - j]) {
						arr[i].add(J + I);
						arr[i].add(J - I);
						arr[i].add(J * I);
						arr[i].add(I - J);
						
						if(I != 0) {
                            arr[i].add(J / I);
                        }
						
                        if(J != 0) {
                            arr[i].add(I / J);
                        }
						
					}
				}

			}
		}
		
		for(int i = 1; i <= 8; i++) {
            if(arr[i].contains(number)) {
                answer = i;
                break;
            }
        }

		return answer;
	}

}
