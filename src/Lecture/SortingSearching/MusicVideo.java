package Lecture.SortingSearching;

import java.util.Scanner;

public class MusicVideo {

    private void solution(int[] nums, int M) {

        int videoSize = 0;

        for (int i : nums) {
            videoSize += i;
        }

        videoSize /= M;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        MusicVideo sol = new MusicVideo();
        sol.solution(nums, M);

    }
}
