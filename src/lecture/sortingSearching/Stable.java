package lecture.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Stable {

    static int[] nums;

    private void solution(int C) {

        int answer = 0;
        Arrays.sort(nums);

        int lt = 1;
        int rt = nums[nums.length - 1];

        while (lt <= rt) {

            int mid = (lt + rt) / 2;

            if (count(mid) >= C) {
                //말이 더 많이 들어간다면 간격을 넓혀야 함
                answer = mid;
                lt = mid + 1;

            } else {
                //말이 더 적게 들어간다면 간격을 좁혀야함
                rt = mid - 1;
            }

        }
        System.out.println(answer);

    }

    private int count(int mid) {

        int last = nums[0];
        int cnt = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - last >= mid) {
                cnt++;
                last = nums[i];
            }
        }

        return cnt;

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int C = in.nextInt();

        nums = new int[N];


        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        Stable sol = new Stable();
        sol.solution(C);


    }


}
