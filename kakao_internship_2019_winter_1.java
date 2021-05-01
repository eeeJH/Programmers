package code;

import java.util.*;

public class kakao_internship_2019_winter_1 {

	static int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
			{ 3, 5, 1, 3, 1 } };
	static int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

	public static void main(String arg[]) {
		System.out.print(solution(board, moves));
	}

	static int[] box;

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		box = new int[board.length * board.length];

		for(int i = 0; i < moves.length; i++) {
			
			for(int j = board.length - 1; j >= 0; j--) {
				
				if(board[j][moves[i]] != 0) {
					
				}
			}
			
		}
		
		return answer;
	}
}
