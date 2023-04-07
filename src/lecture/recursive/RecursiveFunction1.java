package lecture.recursive;

import java.util.Scanner;

public class RecursiveFunction1 {


    private void solution(int N) {

        if (N == 0) {
            return;
        } else {
            System.out.println(N);
            solution(N - 1);
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        RecursiveFunction1 sol = new RecursiveFunction1();
        sol.solution(N);


    }

}
