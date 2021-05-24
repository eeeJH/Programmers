package programmers;

public class kakao_internship_2020_1 {
	static int cur_leftHand = 10;
	static int cur_rightHand = 12;
    
	static int[] input = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
	
	public static void main(String arg[]) {
		System.out.println(solution(input,	"right"));
	}
	
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        for(int i = 0; i < numbers.length; i++){
            switch(numbers[i]){
                case 1:
                case 4:
                case 7:
                    answer += "L";
                    cur_leftHand = numbers[i];
                    break;
                case 3:
                case 6:
                case 9:
                    answer += "R";
                    cur_rightHand = numbers[i];
                    break;
                case 2:
                case 5:
                case 8:
                    answer += dist(numbers[i], hand);
                    break;
                case 0:
                    answer += dist(11, hand);
                    break;
                default:
                    break;
            }
        }
        return answer;
    }
    // 현재 양손에서의 거리
    public static String dist(int number, String hand){
        
        int ll = Math.abs(cur_leftHand - number);
        int rr = Math.abs(cur_rightHand - number);
        
        int l = 0;
        int r = 0;
        
        if(ll == 0){
            cur_leftHand = number;
            return "L";
        } else if(ll == 1 || ll == 3){
            l = 1;
        }else if(ll == 2 || ll == 4 || ll == 6){
            l = 2;
        }else if(ll == 5 || ll == 7 || ll == 9){
            l = 3;
        }else {
            l = 4;
        }
        
        if(rr == 0){
            cur_rightHand = number;
            return "R";
        } else if(rr == 1 || rr == 3){
            r = 1;
        }else if(rr == 2 || rr == 4 || rr == 6){
            r = 2;
        }else if(rr == 5 || rr == 7 || rr == 9){
            r = 3;
        }else {
            r = 4;
        }
        
        if(l > r) {
            cur_rightHand = number;
            return "R";
        } else if (l == r){
            
            if(hand.equals("right")){
                cur_rightHand = number;
                return "R";
            }else {
                cur_leftHand = number;
                return "L";
            }
            
        } else {
            cur_leftHand = number;
            return "L";
        }
    }
}
