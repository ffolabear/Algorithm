package Lecture.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {

    static int[] nums;
    static int M;

    private void solution() {

        int answer = 0;

        //int lt = nums[nums.length - 1];
        int rt = Arrays.stream(nums).sum();
        int lt = Arrays.stream(nums).max().getAsInt() ;



        while (lt <= rt) {

            int mid = (lt + rt) / 2;

            // 미리 지정한 디스크의 갯수를 초과할 경우
            // |------ M -- cnt ---|
            if (countDisk(mid) <= M) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(answer);
    }

    private int countDisk(int disk) {

        int temp = 0;
        int cnt = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + temp > disk) {
                cnt++;
                temp = nums[i];
            } else {
                temp += nums[i];

            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        M = in.nextInt();

        nums = new int[N];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        MusicVideo sol = new MusicVideo();
        sol.solution();

    }
}
