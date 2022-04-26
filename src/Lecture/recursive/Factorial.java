package Lecture.recursive;

import java.util.Scanner;

public class Factorial {

    static int ans = 1;


    private void solution(int N) {

        if (N > 1) {
            ans = ans * N;
            solution(N - 1);
        } else {
            return;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Factorial sol = new Factorial();
        sol.solution(N);
        System.out.println(ans);
    }
}
