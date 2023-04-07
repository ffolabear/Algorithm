package programmers.level01;

import java.util.HashMap;

public class AddingNoneExistNum {

    public int solution(int[] numbers) {

        int answer = 0;

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, false);
        }

        for (int i : numbers) {
            map.put(i, true);
        }

        for (Integer i : map.keySet()) {
            if (!map.get(i)) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        AddingNoneExistNum sol = new AddingNoneExistNum();
        int[] numbers = {1,2,3,4,6,7,8,0};
        sol.solution(numbers);

    }

}
