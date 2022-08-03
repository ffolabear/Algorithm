package Leetcode;

import java.util.ArrayList;

public class Leet_1389 {

    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {

            int targetNum = nums[i];
            int targetIdx = index[i];

            list.add(targetIdx, targetNum);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        Leet_1389 sol = new Leet_1389();
        sol.createTargetArray(nums, index);

    }

}
