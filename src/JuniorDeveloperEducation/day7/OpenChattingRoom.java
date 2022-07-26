package JuniorDeveloperEducation.day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OpenChattingRoom {

    public ArrayList<String> solution(String[] record) {

        ArrayList<String> answer = new ArrayList<>();
        Map<String, String> id_list = new HashMap<>();

        for (int i = 0; i < record.length; i++) {

            String[] temp = record[i].split(" ");

            if (temp.length == 3) {
                id_list.put(temp[1], temp[2]);
            }
        }


        for (int i = 0; i < record.length; i++) {
            StringBuilder sb = new StringBuilder();
            String[] temp = record[i].split(" ");
            if (temp[0].equals("Enter")) {
                sb.append(id_list.get(temp[1])).append("님이 들어왔습니다.");
                answer.add(sb.toString());
            } else if (temp[0].equals("Leave")) {
                sb.append(id_list.get(temp[1])).append("님이 나갔습니다.");
                answer.add(sb.toString());
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        String[] record = {"Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"};

        OpenChattingRoom sol = new OpenChattingRoom();
        sol.solution(record);

    }

}
