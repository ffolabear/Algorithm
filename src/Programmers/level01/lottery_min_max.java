package Programmers.level01;

public class lottery_min_max {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int baseRank = 0;
        int numOfZero = 0;

        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < lottos.length; i++) {

            if (lottos[i] == 0) {
                numOfZero++;
            }

            for (int j = 0; j < win_nums.length; j++) {

                if (lottos[i] == win_nums[j]) {
                    win_nums[j] = -1;
                    baseRank++;
                }
            }
        }
      
        int sum = numOfZero + baseRank;


        answer[0] = rank[sum];
        answer[1] = rank[baseRank];



        return answer;
    }


    public static void main(String[] args) {

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

//        int[] lottos = {0, 0, 0, 0, 0, 0};
//        int[] win_nums = {38, 19, 20, 40, 15, 25};

//        int[] lottos = {45, 4, 35, 20, 3, 9};
//        int[] win_nums = {20, 9, 3, 45, 4, 35};

        lottery_min_max sol = new lottery_min_max();
        sol.solution(lottos, win_nums);

    }

}
