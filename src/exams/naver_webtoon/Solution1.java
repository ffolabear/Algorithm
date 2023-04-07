package exams.naver_webtoon;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {

        int[] prices = {13000, 88000, 10000};
        int[] discounts = {30, 20};

        System.out.println(solution(prices, discounts));


    }

    public static int solution(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int answer = 0;
        int pricesNum = discounts.length - 1;


        for (int i = prices.length - 1; i >= 0; i--) {

            if (pricesNum >= 0) {
                answer += prices[i] * (100 - discounts[pricesNum]) / 100;
                pricesNum--;
            } else {
                answer += prices[i];
            }
        }

        return answer;
    }
}
