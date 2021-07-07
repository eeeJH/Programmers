package programmers;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 * <pre>
 * <b>Programmers</b>
 * 
 * @author 이주현
 * @version 1.0
 * @date 2021.07.07
 * 
 * <p>
		소수 찾기
		
		1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
		
		소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
		(1은 소수가 아닙니다.)
 * </p>
*/

public class lessons12921 {
	
	static int n = 10;

	public static void main(String[] arg) {
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int[] numbers = new int[n+1];
        
        for(int i = 2; i <= n; i++){
            
            if(numbers[i] != 0){
                continue;
            }
            
            for(int j = 2 * i; j <= n; j += i){
                numbers[j] = 1;
            }
        }
        
        int count = 0;
        for(int i = 2; i <= n; i++){
            if(numbers[i] == 0){
                count++;
            }
        }
        
        return count;
    }
}
