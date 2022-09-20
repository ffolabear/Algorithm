package Programmers.level02_1;

public class Carpet {


    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;
        for (int i = 3; i <= sum; i++) {
            int j = sum / i;

            if (sum % i == 0 && j >= 3) {
                int row = Math.max(i, j);
                int col = Math.min(i, j);
                if (((row - 2) * (col - 2)) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

//        int brown = 10;
//        int yellow = 2;

//        int brown = 8;
//        int yellow = 1;

        int brown = 24;
        int yellow = 24;

        Carpet sol = new Carpet();
        sol.solution(brown, yellow);
    }
}
