package code;

public class kakao_blind_2021_3 {

	static int n = 6;
	static int s = 4;
	static int a = 6;
	static int b = 2;
	static int[][] fares = { { 4, 1, 10 }, { 3, 5, 24 }, { 5, 6, 2 }, { 3, 1, 41 }, { 5, 1, 24 }, { 4, 6, 50 },
			{ 2, 4, 66 }, { 2, 3, 22 }, { 1, 6, 25 } };

	public static void main(String arg[]) {
		System.out.println(solution(n, s, a, b, fares));
	}

	static int[][] map;

	public static int solution(int n, int s, int a, int b, int[][] fares) {
		int answer = Integer.MAX_VALUE;
		map = new int[n][n];

		for (int y = 0; y < n; y++) {
			for (int x = 0; x < n; x++) {
				map[y][x] = y == x ? 0 : 100001;
			}
		}

		for (int i = 0; i < fares.length; i++) {
			map[fares[i][0] - 1][fares[i][1] - 1] = fares[i][2];
			map[fares[i][1] - 1][fares[i][0] - 1] = fares[i][2];
		}

		for (int i = 0; i < n; i++) {
			
			for (int y = 0; y < n; y++) {
				
				if (y == i) {
					continue;
				}
				
				for (int x = 0; x < n; x++) {
					
					if (x == i || y == x) {
						continue;
					}
					
					map[y][x] = Math.min(map[y][i] + map[i][x], map[y][x]);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			int current = map[s - 1][i] + map[i][a - 1] + map[i][b - 1];
			if (answer >= current) {
				answer = current;
			}
		}

		return answer;
	}
}
