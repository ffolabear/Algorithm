package lecture.hash;

import java.util.*;

public class KthNum {

    private int solution(int[] nums, int K) {

        int ans = 0;

        ArrayList<Integer> sumList = new ArrayList<>();
        Map<Integer, Integer> sumMap = new HashMap<>();

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
                    sumMap.put(tempSum, sumMap.getOrDefault(tempSum, 0) + 1);

                }
            }
        }

        for (int i : sumMap.keySet()) {
            sumList.add(i);
        }

        Collections.sort(sumList, Collections.reverseOrder());


        if (K > sumList.size()) {
            ans = -1;
        } else {
            ans = sumList.get(K - 1);
        }

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
