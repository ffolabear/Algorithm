package lecture.array;

import java.util.Scanner;

public class Eratosthenes {


    private int solution(int N) {

        int[] nums = new int[N + 1];

        int ans = 0;

        for (int i = 2; i <= N; i++) {
            if (nums[i] == 0) {
                ans++;
                for (int j = i; j <= N; j += i) {
                    nums[j] = 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Eratosthenes sol = new Eratosthenes();
        System.out.println(sol.solution(N));

    }
}
