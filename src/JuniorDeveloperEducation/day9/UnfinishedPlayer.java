package JuniorDeveloperEducation.day9;

import java.util.HashMap;

public class UnfinishedPlayer {

    public String solution(String[] participant, String[] completion) {

        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            if (map.containsKey(completion[i])) {
                map.put(completion[i], map.get(completion[i]) - 1);
            }
        }

        for (String str : map.keySet()) {
            if (map.get(str) != 0) {
                answer = str;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        UnfinishedPlayer sol = new UnfinishedPlayer();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};

//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};

        sol.solution(participant, completion);

    }

}
