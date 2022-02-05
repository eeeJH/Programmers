package programmers;

public class forth {

	static int n = 4;
	static int start = 1;
	static int end = 4;
	static int[][] roads = { { 1, 2, 1 }, { 3, 2, 1 }, { 2, 4, 1 } };
	static int[] traps = { 2, 3 };

	public static void main(String arg[]) {
		System.out.println(solution(n, start, end, roads, traps));
	}

	static int[][] map;
	static int min = Integer.MAX_VALUE;
	static int[] copy_traps;

	public static int solution(int n, int start, int end, int[][] roads, int[] traps) {
		int roadlen = roads.length;
		map = new int[n][n];
		copy_traps = new int[traps.length];
		for (int i = 0; i < traps.length; i++) {
			copy_traps[i] = traps[i];
		}

		for (int i = 0; i < roadlen; i++) {
			map[roads[i][0] - 1][roads[i][1] - 1] = roads[i][2];
		}

		print();

		sol(start - 1, end, 0);

		return min;
	}

	public static void sol(int index, int end, int count) {

		System.out.println("index  " + index);
		System.out.println("count  " + count);

		if (index == end) {
			if (min > count) {
				min = count;
			}
			return;
		}

		for (int i = 0; i < map[index].length; i++) {

			if (map[index][i] > 0) {

				count += map[index][i];

				index = i;
				for (int traps = 0; traps < copy_traps.length; traps++) {
					if (index == copy_traps[traps]) {
						// 함정이면 맵 방향 전환
						map = reflect(map);
						sol(index, end, count);
						map = reflect(map);
					} else {
						sol(index, end, count);
					}
				}

			}
		}

	}

	public static int[][] reflect(int[][] map) {
		for (int y = 0; y < map.length; y++) {
			for (int x = y + 1; x < map.length; x++) {
				int temp = 0;
				temp = map[x][y];
				map[x][y] = map[y][x];
				map[y][x] = temp;
			}
		}

		return map;
	}

	public static void print() {
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map.length; x++) {
				System.out.print(map[y][x]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
