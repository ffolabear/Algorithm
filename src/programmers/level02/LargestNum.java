package programmers.level02;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNum {

    public String solution(int[] numbers) {

        String answer = "";

        String[] covt = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            covt[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(covt, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }

        });


        StringBuilder sb = new StringBuilder();


        for (String s : covt) {
            sb.append(s);
        }


        answer = sb.toString();

        if (answer.charAt(0) == '0') {
            answer = "0";
        }


        return answer;
    }

    public static void main(String[] args) {


//        int[] numbers = {6, 10, 2};
        int[] numbers = {0, 0, 0, 0};

        LargestNum sol = new LargestNum();
        sol.solution(numbers);

    }

}
