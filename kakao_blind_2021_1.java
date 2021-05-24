package programmers;

public class kakao_blind_2021_1 {

	static String input = "...!@BaT#*..-_y.abcdefghijklm.";
	static String input1 = "=.=";

	public static void main(String arg[]) {
		System.out.print(solution(input1));
	}

	/*
	 * 1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�. 
	 * 2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�. 
	 * 3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)��ġȯ�մϴ�. 
	 * 4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�. 
	 * 5�ܰ� new_id�� �� ���ڿ��̶��,new_id�� "a"�� �����մϴ�. 
	 * 6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ������ �����մϴ�. ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�. 
	 * 7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
	 */
	public static String solution(String new_id) {

		System.out.println(new_id);

		// 1�ܰ�
		new_id = new_id.toLowerCase();

		System.out.println("1�ܰ� " + new_id);

		// 2�ܰ�
		new_id = Replace(new_id);

		System.out.println("2�ܰ� " + new_id);

		// 3�ܰ�
		new_id = doublePointReplace(new_id);

		System.out.println("3�ܰ� " + new_id);

		// 4�ܰ�
		new_id = StartAndEndPointReplace(new_id);

		System.out.println("4�ܰ� " + new_id);

		// 5�ܰ�
		new_id = AddString(new_id);
		
		System.out.println("5�ܰ� " + new_id);
		
		// 6�ܰ�
		new_id = SubString(new_id);
		
		System.out.println("6�ܰ� " + new_id);
		

		// 7�ܰ�
		new_id = CopyString(new_id);
		
		System.out.println("7�ܰ� " + new_id);
		
		return new_id;
	}

	/*
	 * �ѱ������ڵ�(\uAC00-\uD7A3), ���� 0~9(0-9), ���� �ҹ���a~z(a-z), �빮��A~Z(A-Z), ����(\s)��
	 * ������(^) �ܾ��� ��� üũ
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
