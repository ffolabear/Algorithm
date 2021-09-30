package Programmers.level01;

public class watermelon {

    public static String solution(int n) {

        String answer = "";

        for(int i=0; i < n; i++){

            if (i%2 == 1) {
                answer += "박";
            } else {
                answer += "수";
            }


        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        int n = 3;
        solution(n);


    }
}
