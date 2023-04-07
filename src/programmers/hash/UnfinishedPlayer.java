package programmers.hash;

import java.util.HashMap;

public class UnfinishedPlayer {

    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> participant_hash = new HashMap<>();
        HashMap<String, Integer> completion_hash = new HashMap<>();

        String answer = "";

        for (int i = 0; i < participant.length; i++) {
            participant_hash.put(participant[i], 0);
        }

        for (int i = 0; i < completion.length; i++) {
            completion_hash.put(completion[i], 0);
        }

        for (String player : participant_hash.keySet()){
            if (!completion_hash.containsKey(player)){
                answer = player;
            }

        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};

        UnfinishedPlayer unfinishedPlayer = new UnfinishedPlayer();
        unfinishedPlayer.solution(part, comp);

    }


}
