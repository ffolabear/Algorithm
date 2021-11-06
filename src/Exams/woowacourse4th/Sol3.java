package Exams.woowacourse4th;

import java.util.HashMap;

public class Sol3 {

    static HashMap<String, Integer> ingre;
    static HashMap<String, Integer> specific;

    public int solution(String[] ings, String[] menu, String[] sell) {

        ingre = new HashMap<>();
        specific = new HashMap<>();

        for (int i = 0; i < ings.length; i++) {
            String[] row = ings[i].split(" ");
            ingre.put(row[0], Integer.parseInt(row[1]));
        }


        for (int i = 0; i < menu.length; i++) {
            calculatioin(menu[i]);
        }

        int answer = 0;

        for (int i = 0; i < sell.length; i++) {
            String[] row = sell[i].split(" ");

            answer += specific.get(row[0]) * Integer.parseInt(row[1]);

        }
        return answer;
    }

    static void calculatioin(String menu) {

        String[] temp = menu.split(" ");
        int result = 0;

        for (int i = 0; i < temp[1].length(); i++) {
            result += ingre.get(String.valueOf(temp[1].charAt(i)));
        }


        specific.put(temp[0], Integer.parseInt(temp[2]) - result);
    }

    public static void main(String[] args) {

//        String[] ings = {"r 10", "a 23", "t 124", "k 9"};
//
//        String[] menu = {"PIZZA arraak 145",
//                "HAMBURGER tkar 180",
//                "BREAD kkk 30",
//                "ICECREAM rar 50",
//                "SHAVEDICE rar 45",
//                "JUICE rra 55",
//                "WATER a 20"};
//
//        String[] sell = {"BREAD 5",
//                "ICECREAM 100",
//                "PIZZA 7",
//                "JUICE 10",
//                "WATER 1"};
//

        String[] ings = {"x 25", "y 20", "z 1000"};

        String[] menu = {"AAAA xyxy 15", "TTT yy 30", "BBBB xx 30"};

        String[] sell = {"BBBB 3", "TTT 2"};

        Sol3 sol = new Sol3();
        sol.solution(ings, menu, sell);


    }
}
