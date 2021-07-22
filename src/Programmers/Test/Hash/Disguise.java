package Programmers.Test.Hash;

import java.util.HashMap;
import java.util.Iterator;

public class Disguise {


    public int solution(String[][] clothes) {

        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 0)+1);
        }



        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            answer *= hashMap.get(it.next()) + 1;

        }

        System.out.println(answer);
        return answer - 1;
    }


    public static void main(String[] args) {

        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Disguise disguise = new Disguise();
        disguise.solution(clothes);

    }
}
