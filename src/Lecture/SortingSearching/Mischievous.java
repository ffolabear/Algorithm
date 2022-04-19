package Lecture.SortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mischievous {

    private void solution(int[] nums) {

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sorted[i]) {
                list.add(i + 1);
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        Mischievous sol = new Mischievous();
        sol.solution(nums);

    }

}
