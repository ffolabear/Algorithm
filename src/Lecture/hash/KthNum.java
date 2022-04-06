package Lecture.hash;

import java.util.*;

public class KthNum {

    private int solution(int[] nums, int K) {

        int ans = Integer.MIN_VALUE;
        Map<Integer, Integer> sumMap = new HashMap<>();

        //window #1-------------
        int tempSum = 0;

        for (int i = 0; i < 3; i++) {
            tempSum += nums[i];
        }

        //----------------------
        int rt = 3;

        for (int i = 3; i < nums.length; i++) {
            tempSum -= nums[i - 3];
            tempSum += nums[i];
            sumMap.put(tempSum, sumMap.getOrDefault(tempSum, 0) + 1);
        }

        Object[] mapKey = sumMap.keySet().toArray();
        Arrays.sort(mapKey);

        for (Object i : mapKey) {
            System.out.println(i);

        }


        System.out.println(sumMap);

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        KthNum sol = new KthNum();
        System.out.println(sol.solution(nums, K));

    }


}
