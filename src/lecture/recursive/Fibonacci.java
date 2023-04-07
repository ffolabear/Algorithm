package lecture.recursive;

import java.util.Scanner;

public class Fibonacci {

    static int[] fibo;

    //재귀의 안좋은 예 - 시간이 오래걸림
    //배열을 사용하는게 더 좋음
    private int solution(int idx) {

//        if (N == 1) {
//            return 1;
//        } else if (N == 2) {
//            return 1;
//        } else {
//            return solution(N - 1) + solution(N - 2);
//        }

        //메모이 제이션의 활용
        if (fibo[idx] > 0) {
            return fibo[idx];
        }

        //연산결과를 기록해 놓는것 -> 메모이제이션
        if (idx == 1) {
            return fibo[idx] = 1;
        } else if (idx == 2) {
            return fibo[idx] = 1;
        } else {
            return fibo[idx] = solution(idx - 1) + solution(idx - 2);
        }


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        Fibonacci sol = new Fibonacci();
        fibo = new int[N + 1];

        sol.solution(N);


        for (int i : fibo) {
            System.out.print(i + " ");
        }

    }

}
