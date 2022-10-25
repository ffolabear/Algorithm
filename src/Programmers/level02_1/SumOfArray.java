package Programmers.level02_1;

import java.util.HashSet;

public class SumOfArray {

    public int solution(int[] elements) {

        int answer = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {

            int start = 0;
            int end = i;

            //nCr = n!/r! * (n-r)!
            //길이가 r 인 조합을 계속 만들기?
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {7, 9, 1, 1, 4};
        SumOfArray sol = new SumOfArray();
        sol.solution(arr);

    }

}
