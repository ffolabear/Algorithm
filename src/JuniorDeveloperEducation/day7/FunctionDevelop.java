package JuniorDeveloperEducation.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevelop {

    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> answer = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < speeds.length; i++) {
            queue.add((int) (Math.ceil((100 - progresses[i]) / (double) speeds[i])));
        }

        while (!queue.isEmpty()) {

            //기준이 되는 값하나 꺼냄
            int current = queue.poll();
            int cnt = 1;

            //만약 기준값이 다음 값보다 크다면 배포 날짜 미뤄야하므로 cnt++
            while (!queue.isEmpty() && current >= queue.peek()) {
                cnt++;
                queue.poll();
            }

            answer.add(cnt);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
//
//        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds = {1, 1, 1, 1, 1, 1};

        FunctionDevelop sol = new FunctionDevelop();
        sol.solution(progresses, speeds);

    }
}
