package Programmers.level02;

import java.util.Stack;

public class StockPrice2 {

    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int tmp = stack.pop();
                answer[tmp] = i - tmp;

            }
            stack.push(i);
            System.out.println(stack);
        }

        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            answer[tmp] = (prices.length - 1) - tmp;
        }

        for (int i : answer) {
            System.out.println(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] prices = {1, 2, 3, 2, 3};
//        int[] prices = {1, 2, 3, 2, 3, 3, 1};
//        int[] prices = {3, 1, 1, 2, 1, 0};
//        int[] prices = {5, 8, 6, 2, 4, 1};
        StockPrice2 sol = new StockPrice2();
        sol.solution(prices);

    }
}
