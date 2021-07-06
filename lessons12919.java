package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.06
 * 
 * <p>
		서울에서 김서방 찾기
		
		String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. 
		seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
		
 * </p>
*/

import java.util.*;

public class lessons12919 {
	static String[] seoul = { "Jane", "Kim" };

	public static void main(String[] arg) {
		System.out.println(solution(seoul));
	}

	public static String solution(String[] seoul) {
		return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
	}
}
