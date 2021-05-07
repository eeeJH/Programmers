package code;

import java.util.*;

public class kakao_blind_2019_2 {

	static String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
			"Change uid4567 Ryan" };

	public static void main(String arg[]) {

		String[] temp = solution(record);

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

	static Map<String, String> users = new HashMap<String, String>();

	public static class User {
		String key = "";
		String str = "";

		User(String key, String str) {
			this.key = key;
			this.str = str;
		}

		public String comment() {
			if (str == "E") {
				return "님이 들어왔습니다.";
			} else if (str == "L") {
				return "님이 나갔습니다.";
			} else {
				return "";
			}
		}
	}

	static ArrayList<User> result = new ArrayList<User>();

	public static String[] solution(String[] record) {

		for (int i = 0; i < record.length; i++) {

			String[] rec = record[i].split(" ");

			switch (rec[0]) {
			case "Enter":
				users.put(rec[1], rec[2]);
				result.add(new User(rec[1], "E"));
				break;

			case "Leave":
				result.add(new User(rec[1], "L"));
				break;

			case "Change":
				users.put(rec[1], rec[2]);
				break;

			default:
				break;
			}
		}

		String[] answer = new String[result.size()];

		for (int i = 0; i < result.size(); i++) {
			User user = result.get(i);
			answer[i] = users.get(user.key) + user.comment();
		}

		return answer;
	}

}
