package Programmers.Test;

public class reverse_ternary {

    public static int solution(int n) {

        String cont = "";

        while (n > 0){

            cont = n%3 + cont;
            n /= 3;

        }

        int answer = 0;

        for(int i=0; i < cont.length(); i++){
            answer += (Math.pow(3, i) * (cont.charAt(i) - '0'));

        }

        return answer;
    }


    public static void main(String[] args) {

        int n = 45;
        solution(n);

    }
}
