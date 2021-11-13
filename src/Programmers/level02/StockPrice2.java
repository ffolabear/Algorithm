package Programmers.level02;

import java.util.Stack;

public class StockPrice2 {

    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            stack.push(prices[i]);
            int time = 0;

            for (int j = i + 1; j < prices.length; j++) {
                if (stack.peek() <= prices[j]) {
                    time++;
                } else {
                    System.out.println(time);
                    break;
                }
            }

            if (i < prices.length - 1 && time == 0) {
                answer[i] = 1;
            } else {
                answer[i] = time;

            }
        }

        for (int i : answer) {
            System.out.println(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] prices = {1, 2, 3, 2, 3};
//        int[] prices = {3, 1, 1, 2, 1, 0};
//        int[] prices = {5, 8, 6, 2, 4, 1};
        StockPrice2 sol = new StockPrice2();
        sol.solution(prices);

    }
}
