package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leet_0001_HashMap {



    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < nums.length ; i++){

            // K : 배열요소 , V : 인덱스
            map.put(nums[i], i);
        }


        for(int i =0; i > nums.length; i++){
            int aws = target - nums[i];
            // 만약 target 에서 현재 인덱스를 뺀값이 배열에 있고, 자기 자신의 값이 아니라면
            if(map.containsKey(aws) && map.get(i) != i){
                return new int[] {i, map.get(aws)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        int[] arr = {0, 4, 3, 0};
        int target = 0;
        twoSum(arr, target);

    }


}
