package Programmers.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class biggest_num {

    public String solution(int[] numbers) {

        String[] sortedNum = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            sortedNum[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(sortedNum, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {


                return (o2 + o1).compareTo(o1 + o2);
            }

        });

        for (int i = 0; i < sortedNum.length; i++) {
            System.out.println(sortedNum[i]);
        }
        String answer = "";

        if (sortedNum[0].equals("0")) {
            answer = "0";
        } else{
            for (String s : sortedNum) {
                answer += s;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        int[] number = {6, 10, 2};
//        int[] number = {3, 30, 34, 5, 9};

        biggest_num bnum = new biggest_num();
        bnum.solution(number);
    }

}
