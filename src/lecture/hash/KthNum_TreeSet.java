package lecture.hash;

import java.util.*;

public class KthNum_TreeSet {

    private int solution(int[] nums, int K) {

        int ans = 0;

        TreeSet<Integer> sumMap = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            int tempSum = 0;

            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                for (int k = 0; k < nums.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }

                    tempSum = nums[i] + nums[j] + nums[k];
                    sumMap.add(tempSum);
                }
            }
        }


        int cnt = K;

        if (K > sumMap.size()) {
            ans = -1;
            return ans;
        }

        while (cnt > 1) {
            sumMap.remove(sumMap.last());
            cnt--;
        }

        ans = sumMap.last();

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

        KthNum_TreeSet sol = new KthNum_TreeSet();
        System.out.println(sol.solution(nums, K));

    }


}
