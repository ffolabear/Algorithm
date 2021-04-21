package Programmers.Test;

public class between_twonum {

    public static long solution(int a, int b) {

        long answer = 0;

        if(a > b){

            for(int i=b; i <= a; i++){
                answer += i;
            }

        } else if (a < b){

            for(int i=a; i <= b; i++){
                answer += i;
            }

        } else {
            answer += a;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        solution(a,b);

    }
}
