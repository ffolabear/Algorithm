package Leetcode;

public class Leet_1929 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};
        Leet_1929 sol = new Leet_1929();
        sol.getConcatenation(nums);

    }

    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];

        }

        return ans;
    }
}
