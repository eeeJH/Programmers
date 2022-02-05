package programmers;

public class second {

	public static void main(String arg[]) {
		int[] temp = solution(places);

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}

	static String[][] places = { { "POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP" },
			{ "POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP" }, { "PXOPX", "OXOXP", "OXPXX", "OXXXP", "POOXX" },
			{ "OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO" }, { "PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP" } };

	
	static int[] dy = { -2, -1, -1, -1, 0, 0, 0, 0, 1, 1, 1, 2 };
	static int[] dx = { 0, -1, 0, 1, -2, -1, 1, 2, -1, 0, 1, 0 };

	public static int[] solution(String[][] places) {
		int[] answer = new int[5];

		for (int i = 0; i < places.length; i++) {
			answer[i] = createMap(places[i]);
		}

		return answer;
	}

	public static int createMap(String[] place) {
		String[][] m = new String[5][5];
		int result = 1;

		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				m[y][x] = place[y].charAt(x) + "";
			}
		}

		for (int i = 0; i < 5; i++) {
			if (!check(m)) {
				result = 0;
				break;
			}

		}

		return result;
	}

	public static boolean check(String[][] m) {
		boolean result = true;

		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {

				if (m[y][x].equals("P")) {

					System.out.println(result);

					for (int i = 0; i < 12; i++) {

						int newY = y + dy[i];
						int newX = x + dx[i];

						if (newY < 0 || newY > 4 || newX < 0 || newX > 4) {
							continue;
						}

						if (m[newY][newX].equals("P")) {

							if ((newY == y + 1 && newX == x) || (newY == y - 1 && newX == x)
									|| (newY == y && newX == x + 1) || (newY == y && newX == x - 1)) {

								return false;
							}

							if (newY == y + 2 && newX == x) {
								if (!m[y + 1][x].equals("X")) {
									return false;
								}
							}

							if (newY == y - 2 && newX == x) {
								if (!m[y - 1][x].equals("X")) {
									return false;
								}
							}

							if (newY == y && newX == x + 2) {
								if (!m[y][x + 1].equals("X")) {
									return false;
								}
							}

							if (newY == y && newX == x - 2) {
								if (!m[y][x - 1].equals("X")) {
									return false;
								}
							}

							if (newY == y + 1 && newX == x - 1) {
								if (!m[y][x - 1].equals("X") || !m[y + 1][x].equals("X")) {
									return false;
								}
							}

							if (newY == y + 1 && newX == x + 1) {
								if (!m[y][x + 1].equals("X") || !m[y + 1][x].equals("X")) {
									return false;
								}
							}

							if (newY == y - 1 && newX == x - 1) {
								if (!m[y][x - 1].equals("X") || !m[y - 1][x].equals("X")) {
									return false;
								}
							}

							if (newY == y - 1 && newX == x + 1) {
								if (!m[y][x + 1].equals("X") || !m[y - 1][x].equals("X")) {
									return false;
								}
							}

						}

					}

				}

			}

		}

		return result;
	}

}
