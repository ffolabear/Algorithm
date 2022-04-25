package Lecture.Recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    private int solution(int N) {

        if (N == 1) {
            return 1;
        } else if (N == 2) {
            return 1;
        } else {
            return solution(N - 1) + solution(N - 2);
        }


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        Fibonacci sol = new Fibonacci();


        for (int i=1; i <= N; i++){

            System.out.print(sol.solution(i) + " ");
        }


    }

}
