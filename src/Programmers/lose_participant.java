package Programmers;

import java.util.*;

public class lose_participant {




    public static String solution(String[] participant, String[] completion) {

        Map<String, Integer> part = new HashMap<>();


        String answer = "";

        for (String str : participant){

            part.put(str, part.getOrDefault(str, 0) + 1);

        }

        for (String arg : completion){
            part.put(arg, part.getOrDefault(arg, 0) - 1);
        }

        for (String val : part.keySet()){
            if (part.get(val) != 0){
                answer = val;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        solution(participant, completion);




    }


}
