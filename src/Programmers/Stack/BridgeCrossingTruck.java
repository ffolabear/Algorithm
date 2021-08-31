package Programmers.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeCrossingTruck {

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        int answer = 0;

        //다리를 큐로 구현
        Queue<Integer> current = new LinkedList<>();

        int current_weight = 0;

        for (int truck : truck_weights) {

            while (true) {
                //다리가 비어있는 경우에는 한대를 넣어줌
                if (current.isEmpty()) {
                    current.add(truck);
                    current_weight += truck;
                    answer++;

                    System.out.println("현재 올라간 트럭 : " + current);
                    System.out.println("현재 무게 : " + current_weight);
                    System.out.println("경과 시간 : " + answer);
                    System.out.println("-----------------------------------");

                    break;
                    //큐의 사이즈는 다리의 길이보다 클수 없음 (다리 길이 이상의 트럭이 올라갈 수 없음)
                } else if (current.size() == bridge_length) {
                    //현재 수용가능한 댓수 이상의 트럭이 들어왔으므로 초과하는 트럭의 무게를 빼줌
                    current_weight -= current.poll();
                    System.out.println("현재 올라간 트럭 : " + current);
                    System.out.println("현재 무게 : " + current_weight);
                    System.out.println("경과 시간 : " + answer);
                    System.out.println("-----------------------------------");

                } else {
                    //현재 올라간 트럭 + 다음 트럭의 무게가 최대 무게를 초과한다면 올라갈수없음
                    //다리의 수용가능한 트럭이 더이상 존재하지 않으므로 그것을 명시하는 0을 더해줌
                    if (current_weight + truck > weight) {
                        current.add(0);
                        answer++;
                        System.out.println("현재 올라간 트럭 : " + current);
                        System.out.println("현재 무게 : " + current_weight);
                        System.out.println("경과 시간 : " + answer);
                        System.out.println("-----------------------------------");

                    } else {
                        //현재 올라간 트럭 + 다음 트럭의 무게가 최대 무게를 초과하지 않으므로 현재 무게에 트럭을 더해줌
                        current.add(truck);
                        current_weight += truck;
                        answer++;
                        System.out.println("현재 올라간 트럭 : " + current);
                        System.out.println("현재 무게 : " + current_weight);
                        System.out.println("경과 시간 : " + answer);
                        System.out.println("-----------------------------------");
                        break;
                    }

                }


            }

        }


        return answer + bridge_length;
    }

    public static void main(String[] args) {

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weight = {7, 4, 5, 6};

        BridgeCrossingTruck bridgeCrossingTruck = new BridgeCrossingTruck();
        bridgeCrossingTruck.solution(bridge_length, weight, truck_weight);


    }

}
