package Programmers.level02;


import java.util.HashMap;

public class RenewingMenu{

    public String[] solution(String[] orders, int[] course) {

        String[] answer = {};

        for (int i = 0; i < orders.length; i++) {

            String current = orders[i];

            HashMap<Character, Integer> words = new HashMap<>();

            for (int j = 0; j < current.length(); j++) {
                words.put(current.charAt(j), 0);
            }

            for (int k = 0; k != i && k < orders.length; k++) {

            }

            System.out.println(words);


        }






        return answer;
    }

    public static void main(String[] args) {

        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        RenewingMenu sol = new RenewingMenu();
        sol.solution(orders, course);

    }


}
