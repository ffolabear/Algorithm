package Lecture.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class SteelBar {

    private int solution(String input) {

        int ans = 0;
        char[] arr = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '(') {
                stack.add('(');
            } else {
                stack.pop();
                ans += stack.size();
            }


        }





        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans = in.next();
        SteelBar sol = new SteelBar();

        System.out.println(sol.solution(ans));

    }
}
