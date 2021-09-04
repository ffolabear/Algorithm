package Programmers.Heap;

import java.util.Arrays;
import java.util.Comparator;

public class DiskController {

    public static int solution(int[][] jobs) {
        int answer = 0;

        int sum = 0;
        int passedTime = 0;
        int realTime = 0;

        Arrays.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < jobs.length; i++) {
            System.out.println(jobs[i][1]);
        }


        for (int i = 0; i < jobs.length; i++) {

            passedTime += jobs[i][1];
            System.out.println("경과시간 : " + passedTime);

            realTime = passedTime - jobs[i][0];
            System.out.println("대기시간 + 경과시간 : " + realTime);

            sum += realTime;

        }
        System.out.println(sum);
        System.out.println(jobs.length);

        answer = sum / jobs.length;

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        solution(jobs);

    }


}
