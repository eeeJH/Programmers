package programmers;

import java.util.*;

public class stack_que_1 {

	static int[] progresses = { 93, 30, 55 };
	static int[] speeds = { 1, 30, 5 };

	public static void main(String arg[]) {
		int[] temp = solution(progresses, speeds);

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}

	static Queue<Process> q = new LinkedList<Process>();

	static class Process {
		int progresses = 0;
		int speeds = 0;

		Process(int progresses, int speeds) {
			this.progresses = progresses;
			this.speeds = speeds;
		}

		void work() {
			progresses += speeds;
		}
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int i = 0; i < progresses.length; i++) {

			Process pro = new Process(progresses[i], speeds[i]);

			q.add(pro);
		}

		int cnt = 0;
		boolean start = false;

		while (!q.isEmpty()) {

			Process pro = q.peek();

			if (pro.progresses >= 100) {
				q.poll();
				cnt++;
				start = true;
				continue;
			}

			if (start) {
				ret.add(cnt);
				cnt = 0;
				start = false;
			}

			for (Process p : q) {
				p.work();
			}
		}
		
		ret.add(cnt);

		int[] answer = new int[ret.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = ret.get(i);
		}

		return answer;
	}
}
