package Programmers;

public class int_sqrt {

    public static long solution(long n) {

        long answer = 0;
        double sqrt = Math.sqrt(n);
        String toString = String.valueOf(sqrt);

        if (toString.charAt(toString.length() - 1) == '0') {
            long validNum = (long) sqrt;
            answer = (long) Math.pow((validNum + 1), 2);

        } else{
            answer = -1;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {


        System.out.println(solution(121));
        System.out.println(solution(3));

    }

}
