package Programmers.level02_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Kakao2019_OpenChattingRoom {

    public ArrayList<String> solution(String[] record) {


        HashMap<String, String> id = new HashMap<>();
        String[][] row = new String[record.length][];

        int arrayLength = 0;

        for (int i = 0; i < record.length; i++) {

            row[i] = record[i].split(" ");

            if (row[i][0].equals("Enter")) {
                id.put(row[i][1], row[i][2]);
                arrayLength++;

            } else if (row[i][0].equals("Change")) {
                id.put(row[i][1], row[i][2]);

            } else {
                arrayLength++;
            }

        }

        ArrayList<String> answer = new ArrayList<>();


        for (int i = 0; i < record.length; i++) {
            if (row[i][0].equals("Enter")) {
                answer.add(id.get(row[i][1]) + "님이 들어왔습니다");
            } else if (row[i][0].equals("Leave")) {
                answer.add(id.get(row[i][1]) + "님이 나갔습니다.");
            }
        }


        for (String str : answer) {
            System.out.println(str);
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] record = {"Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"};

        Kakao2019_OpenChattingRoom sol = new Kakao2019_OpenChattingRoom();
        sol.solution(record);
    }


}
