package Programmers.level02_1;

import java.util.HashMap;

public class DiscountEvent {

    public int solution(String[] want, int[] number, String[] discount) {

        int answer = 0;

        //1 ≤ want의 길이 = number의 길이 ≤ 10
        //10 ≤ discount의 길이 ≤ 100,000

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        int start = 0;
        int end = 9;

        System.out.println(map);

        for (int i = 0; i < discount.length - 10; i++) {
            for (int j = start; j <= end; j++) {
                if (map.containsKey(discount[j])) {
                    map.put(discount[j], map.get(discount[j]) - 1);
                }
            }

            start++;
            end++;

            System.out.println(map);
        }


        return answer;
    }

    public static void main(String[] args) {

        DiscountEvent sol = new DiscountEvent();

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] numbers = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        sol.solution(want, numbers, discount);

    }
}
