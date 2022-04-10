package Lecture.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class PostFix {

    private int solution(String input) {
        int ans = 0;
        Stack<Integer> nums = new Stack<>();
        Stack<Character> operator = new Stack<>();
        int[] calNum = new int[2];

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48 && arr[i] <= 57) {
                nums.add(arr[i] - '0');
            } else {
                int current = 0;
                int a = nums.pop();
                int b = nums.pop();

                if (arr[i] == '+') {
                    current = a + b;
                } else if (arr[i] == '-') {
                    current = b - a;
                } else if (arr[i] == '*') {
                    current = a * b;
                } else if (arr[i] == '/') {
                    current = b / a;
                }
                nums.add(current);

            }
        }
        return nums.pop();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        PostFix sol = new PostFix();
        System.out.println(sol.solution(input));

    }

}
