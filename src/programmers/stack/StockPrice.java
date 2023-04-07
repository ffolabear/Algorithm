package programmers.stack;

import java.util.*;

public class StockPrice {

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
//          현재 인덱스와 마지막으로 스택에 넣은 인덱스 비교
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                System.out.println(stack + " i : " + i);
                answer[stack.peek()] = i;
                stack.pop();
            }
//          이상없는 인덱스는 스택에 기록
            stack.push(i);
        }

        System.out.println("B : " + stack);

        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        for (int i : answer) {
            System.out.println(i);
        }
        return answer;
    }


    public static void main(String[] args) {

        int[] prices = {3, 5, 5, 4, 1};
        solution(prices);

    }

}
