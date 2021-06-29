package programmers;

import java.util.HashMap;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/1845 
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.06.29
*/

public class lessons1845 {

	static int[] nums = { 3, 1, 2, 3, 2, 2, 3, 3, 4, 2, 4, 2, 1, 8, 9, 6, 6, 4, 5, 7, 3, 4, 2, 4 };

	public static void main(String[] arg) {
		System.out.println(solution(nums));
	}

	// HashSet을 사용하면 더 좋음 
	// 중복을 제거해주는 HashSet은 이 문제에 맞는 함수 이다.
	// HashMap의 키값와 그 값이 필요가 없음. 
	public static int solution(int[] nums) {
		int N = nums.length / 2;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int k : map.keySet()) {
			System.out.println("key : " + k + "  val : " + map.get(k));
		}

		return N < map.size() ? N : map.size();
	}
}
