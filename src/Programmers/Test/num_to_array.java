package Programmers.Test;


public class num_to_array {

   public static int[] solution(long n) {


        String cont = (Long.toString(n));
        System.out.println(cont);

        int[] answer = new int[cont.length()];

        for ( int i=0; i < answer.length; i++ ){

            answer[i] = cont.charAt(cont.length() - i - 1)  - '0';

        }


        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        solution(n);

    }

}
