package programmers.level02;

import java.util.LinkedList;

public class Cache {

    public int solution(int cacheSize, String[] cities) {

        int answer = 0;

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        LinkedList<String> queue = new LinkedList<>();

        for (int i = 0; i < cities.length; i++) {
            String temp = cities[i].toUpperCase();
            if (queue.remove(temp)) {
                answer += 1;
                queue.add(temp);
            } else {
                answer += 5;
                if (queue.size() >= cacheSize) {
                    queue.remove(0);
                }
                queue.add(temp);
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        Cache sol = new Cache();
        int n = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        sol.solution(n, cities);

    }

}
