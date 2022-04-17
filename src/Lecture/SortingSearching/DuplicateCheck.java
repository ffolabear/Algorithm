package Lecture.SortingSearching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCheck {

    private void solution1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 0);
        }

        if (map.size() == nums.length) {
            System.out.println("U");
        } else {
            System.out.println("D");
        }

    }

    private void solution2(int[] nums) {

        int[] arr = new int[10000000];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        boolean isValid = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("U");
        } else {
            System.out.println("D");
        }

    }

    private void solution3(int[] nums) {

        String ans = "U";

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                ans = "D";
                break;
            }

        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        DuplicateCheck sol = new DuplicateCheck();
        sol.solution1(nums);
        sol.solution2(nums);
        sol.solution3(nums);


    }

}
