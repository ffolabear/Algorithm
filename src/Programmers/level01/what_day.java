package Programmers.level01;

public class what_day {

    public static String solution(int a, int b) {

        String[] days = {"FRI","SAT", "SUN","MON","TUE","WED","THU"};

        int[][] months = {{1, 31}, {2, 29}, {3, 31}, {4, 30}, {5, 31}, {6, 30}, {7, 31}, {8, 31}, {9, 30}, {10,31}, {11, 30}, {12, 31}};

        int conv = 0;

        for(int i=0 ; i < a -1; i++){
            conv += months[i][1];
        }



        if((conv + b) % 7 == 0){

            return "THU";
        } else {

            String answer = days[(conv + b) % 7 + 1];
            return answer;
        }

    }

    public static void main(String[] args) {

        int a = 5;
        int b = 24;
        solution(a,b);

    }


}
