package programmers.level02;

import java.util.HashSet;

public class WordsGame {

    public int[] solution(int n, String[] words) {

        int[] answer = new int[2];
        HashSet<String> hashSet = new HashSet<>();

        int player = 1;
        int turn = 1;
        String last = "";

        for (int i = 0; i < words.length; i++) {
            if (player > n) {
                player = 1;
                turn++;
            }

            if (hashSet.contains(words[i])) {
                answer[0] = player;
                answer[1] = turn;
                break;
            } else if (i != 0 && last.charAt(last.length() - 1) != words[i].charAt(0)) {
                answer[0] = player;
                answer[1] = turn;
                break;
            } else {
                hashSet.add(words[i]);
            }


            player++;
            last = words[i];
        }

        System.out.println(answer[0] + " " + answer[1]);
        return answer;
    }

    public static void main(String[] args) {

        WordsGame sol = new WordsGame();
//        int n = 3;
//        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        sol.solution(n, words);

    }

}
