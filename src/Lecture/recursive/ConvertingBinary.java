package Lecture.recursive;

import java.util.Scanner;

public class ConvertingBinary {

    private void solution(int N) {

        if (N > 0) {
            solution(N / 2);
            System.out.print(N % 2);
        } else if (N == 0){
            return;
        }
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ConvertingBinary sol = new ConvertingBinary();
        sol.solution(N);


    }
}
