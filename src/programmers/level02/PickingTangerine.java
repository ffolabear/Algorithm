package programmers.level02;

import java.util.*;

public class PickingTangerine {

    public int solution(int k, int[] tangerine) {

        int answer = 0;
        int filledTangerine = 0;

        Map<Integer, Integer> tangerineMap = makeTangerineMap(tangerine);
        List<Integer> sortedTangerines = sortKeyset(tangerineMap);

        for (int currentTangerine : sortedTangerines) {
            if (filledTangerine < k) {
                filledTangerine += tangerineMap.get(currentTangerine);
                answer++;
            }
        }

        return answer;
    }

    private Map<Integer, Integer> makeTangerineMap(int[] tangerine) {
        Map<Integer, Integer> tangerineMap = new HashMap<>();
        for (int fruit : tangerine) {
            tangerineMap.put(fruit, tangerineMap.getOrDefault(fruit, 0) + 1);
        }
        return tangerineMap;
    }

    private List<Integer> sortKeyset(Map<Integer, Integer> tangerineMap) {
        List<Integer> sortedTangerines = new ArrayList<>(tangerineMap.keySet());
        sortedTangerines.sort((o1, o2) -> tangerineMap.get(o2) - tangerineMap.get(o1));
        return sortedTangerines;
    }

    public static void main(String[] args) {

        int k = 4;
//        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        PickingTangerine sol = new PickingTangerine();
        sol.solution(k, tangerine);
    }

}
