package juniorDeveloperEducation.day7;

public class Lotto {


    public int[] solution(int[] lottos, int[] win_nums) {

        int[] answer = new int[2];
        boolean[] input = new boolean[46];

        int cntZero = 0;
        int cntMatch = 0;

        for (int i : lottos) {
            if (i == 0) {
                cntZero++;
            }
            input[i] = true;
        }

        for (int i : win_nums) {
            if (input[i]) {
                cntMatch++;
            }
        }

        //최소 등수 : 7 - cntMatch
        //최대 등수 : 7 - cntMatch + cntZero
        System.out.println("cntZero = " + cntZero);
        System.out.println("cntMatch = " + cntMatch);

        if (cntZero == 0 && cntMatch == 0) {
            answer[0] = 6;
            answer[1] = 6;
        } else {

            answer[0] = 7 - (cntMatch + cntZero);
            if (cntMatch <= 1) {
                answer[1] = 6;
            } else {
                answer[1] = 7 - cntMatch;
            }
        }


        System.out.println(answer[0]);
        System.out.println(answer[1]);

        return answer;
    }

    public static void main(String[] args) {

        int[] lottos = {};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

//        int[] lottos = {0, 0, 0, 0, 0, 0};
//        int[] win_nums = {38, 19, 20, 40, 15, 25};

//        int[] lottos = {45, 4, 35, 20, 3, 9};
//        int[] win_nums = {20, 9, 3, 45, 4, 35};

        Lotto sol = new Lotto();
        sol.solution(lottos, win_nums);

    }

}
