package lecture.twopointer;

import java.util.Scanner;

public class ContinuousNumSum {

    private int solution(int N) {

        int ans = 0;
        int sum = 0;

        for (int i = 1; i <= N / 2; i++) {
            sum = 0;
            sum += i;
            for (int j = i + 1; j <= N; j++) {
                if (sum >= N) {
                    break;
                } else {
                    sum += j;
                }
            }


            if (sum == N) {
                ans++;
            }

        }


        return ans;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ContinuousNumSum sol = new ContinuousNumSum();
        System.out.println(sol.solution(N));
    }
}
