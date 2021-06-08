package programmers;

import java.util.*;

public class hash_1 {

	static String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
	static String[] completion = { "josipa", "filipa", "marina", "nikola" };

	public static void main(String arg[]) {
		System.out.println(solution(participant, completion));
	}

	static Map<String, Integer> m = new HashMap<String, Integer>();

	public static String solution(String[] participant, String[] completion) {

		String answer = "";

		for (int i = 0; i < participant.length; i++) {

			if (m.get(participant[i]) == null) {
				m.put(participant[i], 0);
			} else {
				m.put(participant[i], m.get(participant[i]) + 1);
			}

		}

		for (int i = 0; i < completion.length; i++) {
			m.put(completion[i], m.get(completion[i]) - 1);
		}

		for (String key : m.keySet()) {
			if(m.get(key) == 0) {
				answer = key;
				break;
			}
		}

		return answer;
	}
}
