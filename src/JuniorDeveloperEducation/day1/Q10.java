package JuniorDeveloperEducation.day1;

import java.util.ArrayList;

public class Q10 {

    public ArrayList<Integer> solution(int[] answers) {

        ArrayList<Integer> answer = new ArrayList<>();
        int[] correct = new int[3];

        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


        int ansCnt1 = countAns(pattern1, answers);
        int ansCnt2 = countAns(pattern2, answers);
        int ansCnt3 = countAns(pattern3, answers);

        correct[0] = ansCnt1;
        correct[1] = ansCnt2;
        correct[2] = ansCnt3;

        int max = Math.max(ansCnt1, Math.max(ansCnt2, ansCnt3));

        if (ansCnt1 == ansCnt2 && ansCnt1 == ansCnt3) {
            answer.add(1);
            answer.add(2);
            answer.add(3);
        } else {
            for (int i = 0; i < correct.length; i++) {
                if (correct[i] == max) {
                    answer.add(i + 1);
                }
            }
        }


        return answer;
    }

    private int countAns(int[] pattern, int[] answer) {

        int cnt = 0;
        int pointer = 0;

        for (int i = 0; i < answer.length; i++) {
            if (pointer == pattern.length) {
                pointer = 0;
            }
            if (pattern[pointer] == answer[i]) {
                cnt++;
            }

            pointer++;
        }

        return cnt;
    }

    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5};
        int[] arr = {1,3,2,4,2};

        Q10 sol = new Q10();
        sol.solution(arr);

    }

}
