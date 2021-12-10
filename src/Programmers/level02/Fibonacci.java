package Programmers.level02;

public class Fibonacci {

    public int solution(int n) {

        int answer = Fibo(n) & 1234567;

        return answer;
    }

    static int Fibo(int n) {

        System.out.println(n);

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return Fibo(n - 1) + Fibo(n - 2);

    }

    public static void main(String[] args) {

        int n = 8;
        Fibonacci sol = new Fibonacci();
        sol.solution(n);

    }
}
