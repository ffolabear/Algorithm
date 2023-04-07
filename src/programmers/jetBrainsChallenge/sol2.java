package programmers.jetBrainsChallenge;

public class sol2 {

    public int[] solution(String[] grid) {
        int[] answer = {};

        for (int i = 0; i < grid.length; i++) {

            int point = 0;

            for (int j = 0; j < grid[i].length(); j++) {

                if (grid[i].charAt(j) == 'S') {
                    point = point + 1;

                } else if (grid[i].charAt(j) == 'L') {


                }else if (grid[i].charAt(j) == 'R'){

                }

            }


        }

        return answer;
    }

    public static void main(String[] args) {

        String[] grid = {"SL", "LR"};
//        String[] grid = {"S"};
//        String[] grid = {"R","R"};

    }

}
