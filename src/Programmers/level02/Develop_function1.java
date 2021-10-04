package Programmers.level02;

import java.util.*;

public class Develop_function1 {

    public static void main(String[] args) {


        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1,1,1,1,1,1};

        solution(progresses, speeds);

    }

    public static List<Integer> solution(int[] progresses, int[] speeds) {

        List<Integer> answer = new ArrayList<>();

        double[] temp = new double[progresses.length];

        Queue<Double> queue = new LinkedList<>();




        for (int i = 0; i < temp.length; i++) {

            queue.offer(Math.ceil((double)(100 - progresses[i]) / speeds[i]));
        }


        for (double i : queue) {
            System.out.println("i = " + i);
        }

        int cnt = 1;
        double current = queue.poll();

        while (!queue.isEmpty()){

            double next = queue.poll();

            if (current >= next){
                cnt++;
            } else {

                answer.add(cnt);
                cnt = 1;
                current = next;
            }
        }
        answer.add(cnt);

        for (int i : answer){
            System.out.println(i);
        }


        return answer;
    }


}
