package programmers;

public class kakao_blind_2021_1 {

	static String input = "...!@BaT#*..-_y.abcdefghijklm.";
	static String input1 = "=.=";

	public static void main(String arg[]) {
		System.out.print(solution(input1));
	}

	/*
	 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다. 
	 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다. 
	 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로치환합니다. 
	 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다. 
	 * 5단계 new_id가 빈 문자열이라면,new_id에 "a"를 대입합니다. 
	 * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을모두 제거합니다. 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다. 
	 * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	 */
	public static String solution(String new_id) {

		System.out.println(new_id);

		// 1단계
		new_id = new_id.toLowerCase();

		System.out.println("1단계 " + new_id);

		// 2단계
		new_id = Replace(new_id);

		System.out.println("2단계 " + new_id);

		// 3단계
		new_id = doublePointReplace(new_id);

		System.out.println("3단계 " + new_id);

		// 4단계
		new_id = StartAndEndPointReplace(new_id);

		System.out.println("4단계 " + new_id);

		// 5단계
		new_id = AddString(new_id);
		
		System.out.println("5단계 " + new_id);
		
		// 6단계
		new_id = SubString(new_id);
		
		System.out.println("6단계 " + new_id);
		

		// 7단계
		new_id = CopyString(new_id);
		
		System.out.println("7단계 " + new_id);
		
		return new_id;
	}

	/*
	 * 한글유니코드(\uAC00-\uD7A3), 숫자 0~9(0-9), 영어 소문자a~z(a-z), 대문자A~Z(A-Z), 공백(\s)를
	 * 제외한(^) 단어일 경우 체크
	 */
	public static String Replace(String str) {
		String match = "[^.\\-_0-9a-zA-Z\\s]";
		str = str.replaceAll(match, "");
		return str;
	}

	public static String doublePointReplace(String str) {
		String match = "..";

		while (str.indexOf("..") != -1) {

			str = str.replace(match, ".");
			System.out.println(str);

		}

		return str;
	}

	public static String StartAndEndPointReplace(String str) {

		if (str.length() > 0 && str.charAt(0) == '.') {

			str = str.substring(1);

		}

		if (str.length() > 0 && str.charAt(str.length() - 1) == '.') {

			str = str.substring(0, str.length() - 1);
		}

		System.out.println(str);

		return str;
	}

	public static String AddString(String str) {

		if (str.length() == 0) {
			str = "a";
		}

		return str;
	}

	public static String SubString(String str) {

		if (str.length() > 15) {
			str = str.substring(0, 15);
		}

		if (str.length() > 0 && str.charAt(str.length() - 1) == '.') {

			str = str.substring(0, str.length() - 1);
		}
	
		return str;
	}
	
	public static String CopyString(String str) {
		
		if(str.length() < 3) {
			
			char s = str.charAt(str.length()-1);
			System.out.println(s);
			
			while(str.length() < 3) {
				System.out.println(str);
				str += s;
			}
			
		}
		
		return str;
	}

}
