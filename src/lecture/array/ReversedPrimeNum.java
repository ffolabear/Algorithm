package lecture.array;

import java.util.Scanner;

public class ReversedPrimeNum {

    private void solution(String[] nums) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {

//            StringBuilder sb = new StringBuilder(nums[i]).reverse();
//            int current = Integer.parseInt(sb.toString());


            int temp = Integer.parseInt(nums[i]);
            int current = 0;
            while (temp > 0) {
                current = current * 10 + temp % 10;
                temp /= 10;
            }
//            System.out.println(current);

            if (current % 2 == 0 && current != 2) {
                continue;
            }

            if (current == 1) {
                continue;
            }

            if (current == 2) {
                ans.append(current).append(" ");
                continue;
            }

            int cnt = 2;

            for (int j = 3; j <= current / 2; j++) {
                if (current % j == 0) {
                    cnt++;
                }
            }

            if (cnt == 2) {
                ans.append(current).append(" ");
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] nums = new String[N];

        for (int i = 0; i < N; i++) {
            nums[i] = in.next();
        }

        ReversedPrimeNum sol = new ReversedPrimeNum();
        sol.solution(nums);

    }

}
