package Lecture.array;

import java.util.Scanner;

public class Fibonacci {

    private void solution(int N) {

        int[] fibo = new int[N];
        fibo[0] = 1;
        fibo[1] = 1;

        for (int i = 2; i < N; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for (int i : fibo) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        Fibonacci sol = new Fibonacci();
        sol.solution(N);
    }

}
