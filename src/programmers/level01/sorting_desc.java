package programmers.level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting_desc {

    public static long solution(long n) {

        String covt = Long.toString(n);


        List<Integer> list = new ArrayList<>();

        for (int i=0; i < covt.length(); i++){
            list.add((int)covt.charAt(i) - '0');
        }

        Collections.sort(list);
        Collections.reverse(list);

        String ans = "";

        for (int i: list){
            ans += Integer.toString(i);
        }



        long answer = Long.parseLong(ans);


        return answer;
    }

    public static void main(String[] args) {

        int n = 118372;
        solution(n);

    }

}
