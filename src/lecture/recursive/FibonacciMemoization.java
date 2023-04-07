package lecture.recursive;

import java.util.Scanner;

public class FibonacciMemoization {

    static int[] fibo;

    private int solution(int idx) {

        if (fibo[idx] > 0) {
            return fibo[idx];
        }

        if (idx == 1) {
            return fibo[idx] = 1;
        } else if (idx == 2) {
            return fibo[idx] = 2;
        } else {
            return fibo[idx] = solution(idx - 1) + solution(idx - 2);
        }


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        FibonacciMemoization sol = new FibonacciMemoization();
        fibo = new int[N + 1];

        sol.solution(N);


        for (int i : fibo) {
            System.out.print(i + " ");
        }


    }
}