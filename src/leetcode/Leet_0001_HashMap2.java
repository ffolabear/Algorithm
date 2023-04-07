package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leet_0001_HashMap2 {



    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();


        for(int i =0; i < nums.length; i++){
            int aws = target - nums[i];

            if(map.containsKey(aws)){
                return new int[]{map.get(aws), i};
            }
            map.put(nums[i], i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        int[] arr = {0, 4, 3, 0};
        int target = 0;
        twoSum(arr, target);

    }


}
