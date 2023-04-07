package juniorDeveloperEducation.day3;

import java.util.Stack;

/**
 * Trapping Rain Water
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class LeetCode_42 {

    public int trap(int[] height) {

        int maxHeight = 0;
        for (int i : height) {
            maxHeight = Math.max(i, maxHeight);
        }

        System.out.println(maxHeight);


        Stack<Integer> stack = new Stack<>();

        int ans = 0;
        stack.push(height[0]);
        int top = height[0];

        // 높이의 차이가 생길때만 stack 에 넣는다????????
        for (int i = 1; i < height.length; i++) {
            int current = height[i];

            //꼭대기 값과 현재 값이 다르므로 스택에 넣어준다.
            if (top != current) {
                stack.push(current);
                if (current < top) {

                }
            }


        }

        System.out.println("ans = " + ans);
        return ans;
    }

    public static void main(String[] args) {

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        LeetCode_42 sol = new LeetCode_42();
        sol.trap(height);
//        System.out.println();

    }
}
