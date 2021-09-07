package Programmers.weeklyChallenge;


public class w02_Score {

    static StringBuilder sb = new StringBuilder();

    public String solution(int[][] scores) {
        String answer = "";

        for (int i = 0; i < scores.length; i++) {


            int max = scores[0][i];
            int min = scores[0][i];
            int selfScore = scores[i][i];
            int sum = 0;

            for (int j = 0; j < scores.length; j++) {
                sum += scores[j][i];
                max = Math.max(max, scores[j][i]);
                min = Math.min(min, scores[j][i]);

            }

            System.out.println("합 : " + sum);

            if (valid(max, min, scores, i)) {
                int avg = sum / scores.length;
                sb.append(grade(avg));
            } else {
                int avg = (sum - selfScore) / (scores.length - 1);
                sb.append(grade(avg));
            }

            max = scores[0][i];
            min = scores[0][i];

        }

        return answer;
    }

    static boolean valid(int max, int min, int[][] scores, int student) {

        int chk = 0;
        System.out.println("self : " + scores[student][student]);
        for (int i = 0; i < scores.length; i++) {
            if (scores[student][student] == min || scores[student][student] == max) {
                if (scores[student][student] == scores[i][student]) {
                    System.out.println("비교 : " + scores[i][student]);
                    chk++;
                }

            }
        }
        System.out.println("중복횟수 : " + chk);
        if (chk == 1) {
            return false;
        } else {
            return true;
        }

    }


    static char grade(int avg) {
        System.out.println("평균: " + avg);

        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else if (avg >= 50) {
            return 'D';
        } else {
            return 'F';
        }

    }

    public static void main(String[] args) {


//        int[][] arr = {{100, 90, 98, 88, 65},
//                {50, 45, 99, 85, 77},
//                {47, 88, 95, 80, 67},
//                {61, 57, 100, 80, 65},
//                {24, 90, 94, 75, 65}};
        int[][] arr = {{50, 90}, {50, 87}};
        w02_Score score = new w02_Score();
        score.solution(arr);
        System.out.println(sb.toString());

    }

}
