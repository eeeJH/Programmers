package code;

public class kakao_blind_2018_2 {

	public static void main(String arg[]) {

		System.out.print(solution("1S2D*3T"));
	}

	public static int solution(String dartResult) {
		int answer = 0;

		String only_number = dartResult.replaceAll("[^0-9]", "");
		String only_str = dartResult.replaceAll("[0-9]", "");

		System.out.println(only_number);
		System.out.println(only_str);

		for (int index = 0; index < dartResult.length(); index++) {

		}

		return answer;
	}

}
