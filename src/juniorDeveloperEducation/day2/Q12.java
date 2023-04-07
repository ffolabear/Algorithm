package juniorDeveloperEducation.day2;

import java.util.Stack;

public class Q12 {

    public int[] solution(int[] arr) {


        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (!stack.isEmpty()) {
                if (stack.peek() != i) {
                    stack.push(i);
                }
            } else {
                stack.push(i);

            }

        }

        int len = stack.size();
        int[] ans = new int[len];

        for (int i = len - 1; i >= 0 ; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
//        int[] arr = {4,4,4,3,3};

        Q12 sol = new Q12();
        sol.solution(arr);

    }

}
