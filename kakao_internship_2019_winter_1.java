package code;

import java.util.*;

public class kakao_internship_2019_winter_1 {

	static int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
			{ 3, 5, 1, 3, 1 } };
	static int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

	public static void main(String arg[]) {
		System.out.print(solution(board, moves));
	}

	static Stack<Integer> box = new Stack<Integer>();

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < moves.length; i++) {

			for (int j = 0; j < board.length; j++) {

				System.out.println("doll : " + board[j][moves[i] - 1]);

				int doll = board[j][moves[i] - 1];

				if (doll != 0) {
					board[j][moves[i] - 1] = 0;

					if (!box.empty() && box.peek() == doll) {
						box.pop();
						answer += 2;

					} else {
						box.push(doll);
					}
					break;
				}
			}

			System.out.println();
			System.out.println(answer);
			System.out.println();

		}

		return answer;
	}
}
