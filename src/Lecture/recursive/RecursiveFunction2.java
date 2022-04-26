package Lecture.recursive;

import java.util.Scanner;

public class RecursiveFunction2 {

    static int N;

    private void solution(int i) {

        if (i > N) {
            return;
        } else {
            System.out.print(i + " ");
            solution(i + 1);
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        RecursiveFunction2 sol = new RecursiveFunction2();
        sol.solution(1);


    }

}
