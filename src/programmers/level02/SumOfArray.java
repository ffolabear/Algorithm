package programmers.level02;

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
            //부분수열의 합을 set 에 저장해서 중복체크하기
            //원형 수열을 어떻게 구현할지?

            //길이 0, 1, 2, ...
            for (int j = 0; j < i; j++) {
                //0 ~ end 까지
                int sum = 0;
                for (int k = start; k < end; k++) {
                    sum += elements[k];
                }
                start++;
//                System.out.println(sum);
                set.add(sum);
            }


        }

        System.out.println(set);
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {7, 9, 1, 1, 4};
        SumOfArray sol = new SumOfArray();
        sol.solution(arr);

    }

}
