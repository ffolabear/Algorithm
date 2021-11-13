package Programmers.level02;

import java.util.Stack;

public class StockPrice2 {

    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            stack.push(prices[i]);
            int time = 0;
            System.out.println("현재 : " + prices[i]);

            for (int j = i + 1; j < prices.length; j++) {
                System.out.println(prices[j]);

                int current = stack.peek();

                if (current <= prices[j]) {
                    time = time + 1;

                } else {
                    stack.pop();
                    if (j != prices.length - 1) {
                        time = 1;
                    }
                    answer[i] = time;
                    time = 0;
                    break;
                }
            }



        }

        for (int i : answer) {
            System.out.println("시간 : " + i);
        }

        return answer;
    }

    public static void main(String[] args) {

//        int[] prices = {1, 2, 3, 2, 3};
//        int[] prices = {3, 1, 1, 2, 1, 0};
        int[] prices = {5, 8, 6, 2, 4, 1};
        StockPrice2 sol = new StockPrice2();
        sol.solution(prices);



    }
}
