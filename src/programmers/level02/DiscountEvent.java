package programmers.level02;

import java.util.HashMap;
import java.util.Map;

public class DiscountEvent {

    public int solution(String[] want, int[] number, String[] discount) {

        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        int start = 0;
        int end = 9;

        for (int i = 0; i <= discount.length - 10; i++) {

            HashMap<String, Integer> copyMap = new HashMap<>(map);

            for (int j = start; j <= end; j++) {
                if (copyMap.containsKey(discount[j])) {
                    copyMap.put(discount[j], copyMap.get(discount[j]) - 1);
                }
            }

            if (isValid(copyMap)) {
                answer++;
            }

            start++;
            end++;

        }

        return answer;
    }

    private static boolean isValid(Map<String, Integer> copyMap) {
        for (String key : copyMap.keySet()) {
            if (copyMap.get(key) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        DiscountEvent sol = new DiscountEvent();

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] numbers = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        sol.solution(want, numbers, discount);

    }
}
