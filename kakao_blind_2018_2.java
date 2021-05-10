package code;

import java.util.*;

public class kakao_blind_2018_2 {

	public static void main(String arg[]) {
		System.out.print(solution("1S2D*3T"));
	}

	public static boolean checkString(String str) {
		return str == null || str.length() == 0;
	}

	public static int solution(String dartResult) {
		int answer = 0;

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		String[] only_number = dartResult.split("[^0-9]");

		for (int index = 0; index < only_number.length; index++) {
			if (!checkString(only_number[index])) {
				numbers.add(Integer.parseInt(only_number[index]));
			}
		}

		int num = 0;

		for (int index = 0; index < dartResult.length(); index++) {

			switch (dartResult.charAt(index)) {
			case 'S':
					num++;
				break;

			case 'D':
					numbers.set(num, (int) Math.pow(numbers.get(num), 2));
					num++;
				break;

			case 'T':
					numbers.set(num, (int) Math.pow(numbers.get(num), 3));
					num++;
				break;

			case '*':
				numbers.set(num - 1, numbers.get(num - 1) * 2);
				if (num > 1) {
					numbers.set(num - 2, numbers.get(num - 2) * 2);
				}
				break;

			case '#':
				numbers.set(num - 1, numbers.get(num - 1) * -1);
				break;

			default:
				break;
			}

		}

		for (int i = 0; i < numbers.size(); i++) {
			answer += numbers.get(i);
		}

		return answer;
	}

}
