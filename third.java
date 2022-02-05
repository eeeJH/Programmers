package programmers;

import java.util.ArrayList;
import java.util.Stack;

public class third {

	static int n = 8;
	static int k = 2;
	static String[] cmd = { "D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C" };

	public static void main(String arg[]) {
		System.out.println(solution(n, k, cmd));
	}

	static ArrayList<Integer> map = new ArrayList<Integer>();
	static Stack<Info> de = new Stack<>();

	public static class Info {
		int index;
		int num;

		Info(int index, int num) {
			this.index = index;
			this.num = num;
		}
	}

	public static String solution(int n, int k, String[] cmd) {
		String answer = "";

		int[] copy_map = new int[n];

		int cur_index = k;

		for (int i = 0; i < n; i++) {
			map.add(i);
			copy_map[i] = i;
		}

		for (int index = 0; index < cmd.length; index++) {

			String[] sp = cmd[index].split(" ");

			print();

			System.out.println("cur_index : " + cur_index);
			System.out.println(sp[0]);
			switch (sp[0]) {
			case "U":
				cur_index = cur_index - Integer.parseInt(sp[1]);
				break;

			case "D":
				cur_index = cur_index + Integer.parseInt(sp[1]);
				break;

			case "C":
				
				de.add(new Info(cur_index, map.get(cur_index)));

				map.remove(cur_index);
				print();
				if (cur_index >= map.size()) {
					cur_index = map.size() - 1;
				} 
				break;

			case "Z":

				Info p = de.pop();

				map.add(p.index, p.num);
				break;

			default:
				break;
			}

			System.out.println();
		}

		System.out.println();
		print();

		for (int i = 0; i < n; i++) {
			if (map.contains(i)) {
				answer += "O";
			}else {
				answer += "X";
			}
		}

		return answer;
	}

	public static void print() {
		for (int i = 0; i < map.size(); i++) {
			System.out.print(map.get(i));
		}
		System.out.println();
	}

}
