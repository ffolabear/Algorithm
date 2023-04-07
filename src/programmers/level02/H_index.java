package programmers.level02;

import java.util.Arrays;

public class H_index {

    public int solution(int[] citations) {

        int answer = 0;

        Arrays.sort(citations);


        for (int i = 0; i < citations.length; i++) {

            int n = citations.length - i;


            if (citations[i] >= n) {
                answer = n;
                break;

            }


        }



        return answer;
    }

    public static void main(String[] args) {

        int[] citation = {12, 11, 10, 9, 8, 1};

        H_index sol = new H_index();
        sol.solution(citation);

    }
}
