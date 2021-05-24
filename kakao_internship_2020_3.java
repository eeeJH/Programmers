package programmers;

import java.util.*;

public class kakao_internship_2020_3 {

	static String[] input = { "DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA" };

	public static void main(String arg[]) {
		System.out.println(solution(input));
	}

	static String[] jewelry;
	static int gems_length;
	static Set<String> _jewelry = new HashSet<String>();
	static Map<String, Integer> map = new HashMap<String, Integer>();
	static Queue<String> q = new LinkedList<String>();
	static int start = 0;
	static int min = Integer.MAX_VALUE;

	public static int[] solution(String[] gems) {
		gems_length = gems.length;
		jewelry = new String[gems.length];

		for (int i = 0; i < gems_length; i++) {
			_jewelry.add(gems[i]);
		}

		int _start = 0;

		for (int i = 0; i < gems_length; i++) {
			if (!map.containsKey(gems[i])) {
				map.put(gems[i], 1);
			} else {
				map.put(gems[i], map.get(gems[i]) + 1);
			}

			q.offer(gems[i]);

			while (true) {
				String __jewelry = q.peek();

				if (map.get(__jewelry) > 1) {
					map.put(__jewelry, map.get(__jewelry) - 1);
					q.poll();
					start++;
				} else {
					break;
				}
			}

			if (map.size() == _jewelry.size() && min > q.size()) {
				min = q.size();
				_start = start;
			}

		}

		return new int[] { _start + 1, _start + min };
	}
}
