package code;

public class Dev_Matching_BackEnd_2021_1 {

	static int[] lottos = { 44, 1, 0, 0, 31, 25 };
	static int[] win_nums = { 31, 10, 45, 1, 6, 19 };

	public static void main(String arg[]) {
		int[] temp = solution(lottos, win_nums);

		for (int i = 0; i < 2; i++) {
			System.out.println(temp[i]);
		}
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int best = 0;
		int worst = 0;

		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					best++;
					worst++;
				}

				if (lottos[i] == 0) {
					best++;
					break;
				}
			}
		}

		return new int[] { result(best), result(worst) };
	}

	public static int result(int count) {
		switch (count) {
		case 6:
			return 1;
		case 5:
			return 2;
		case 4:
			return 3;
		case 3:
			return 4;
		case 2:
			return 5;
		case 1:
		case 0:
			return 6;
		}

		return -1;
	}
}
