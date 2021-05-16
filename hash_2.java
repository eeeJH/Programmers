package code;

import java.util.*;

public class hash_2 {

	static String[] phone_book = { "119", "97674223", "1195524421" };

	public static void main(String arg[]) {
		System.out.println(solution(phone_book));
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

        Map<String,String> m = new HashMap<String,String>();

        for(String s : phone_book){
            m.put(s, "");
        }

        for ( String s : phone_book) {
            for( int i = 0; i <  s.length(); i++) {
                if( m.containsKey(s.substring(0,i)) ) {
                    return false;
                }
            }
        }

        return answer;

        /* 시간초과
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book.length; j++){

                if(i==j || phone_book[j].length() < phone_book[i].length()){
                    continue;
                }

                if(phone_book[j].indexOf(phone_book[i]) == 0){
                    return false;
                }
            }
        }

        return answer;
        */
	}
}
