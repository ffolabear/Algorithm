package Programmers;

public class int_sqrt {

    public static long solution(long n) {

        long answer = 0;
        System.out.println(Long.parseLong(String.valueOf((long) Math.sqrt(n))));
        if (Long.parseLong(String.valueOf((long) Math.sqrt(n))) > 0) {

            answer = (long) Math.pow((Math.sqrt(n) + 1), 2);
        }



        return answer;
    }

    public static void main(String[] args) {


        System.out.println(solution(7));

    }

}
