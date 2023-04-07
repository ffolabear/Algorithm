package leetcode;

public class Leet_0001 {
// 생각을 너무 많이하지말자
//    static int[] twosum(int[] nums, int target) {
//
//        int[] aws = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] <= target) {
//
//                for (int j = 0; j < nums.length && j != i; j++) {
//
//                    if ((nums[i] + nums[j]) == target) {
//
//                        if (i > j) {
//                            aws[0] = j;
//                            aws[1] = i;
//                        } else if (i < j) {
//                            aws[0] = i;
//                            aws[1] = j;
//                        }
//
//                    }
//
//                }
//
//            }
//        }
//        return aws;
//    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
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
