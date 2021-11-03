package Programmers.level02;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeCrossingTruck2 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        int time = 0;

        for (int i = 0; i < truck_weights.length; i++) {


            //현재 다리위에있는 무게들을 구할 변수
            int sum = 0;

            if (queue.isEmpty()) {

                queue.add(truck_weights[i]);
                sum += truck_weights[i];
                System.out.println("queue가 비어있음 : " + sum);
                time++;

            } else {
                System.out.println(sum);
                //큐의 크기가 다리의 길이보다 작다 -> 무게조건만 충족하면 트럭을 더 올릴수있다.

                if (queue.size() < bridge_length) {

                    //아직 무게 괜찮음. 트럭 올라갈수있음
                    if (sum + truck_weights[i] <= weight) {
                        queue.add(truck_weights[i]);
                        sum += truck_weights[i];
                        time++;
                    } else {
                        //다른 트럭을 올릴수 없으므로 시간만 지나가므로 0을 더해줌
                        queue.add(0);

                        time++;

                    }

                } else if (queue.size() == bridge_length) {

                    sum -= queue.poll();
                }
                //큐의 사이즈 = 다리의 길이

            }


        }

        System.out.println(time);
        return answer;
    }

    public static void main(String[] args) {

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weight = {7, 4, 5, 6};

        BridgeCrossingTruck2 sol = new BridgeCrossingTruck2();
        sol.solution(bridge_length, weight, truck_weight);

    }

}
