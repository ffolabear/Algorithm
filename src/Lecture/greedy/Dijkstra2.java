package Lecture.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra2 {

    static int n, m;
    //정점과 정점의 정보를 저장할 배열
    static ArrayList<ArrayList<Edge>> graph;

    //1부터 각 인덱스에 해당하는 정점까지의 거리의 최솟값을 저장할 배열
    static int[] dis;


    public void solution(int v) {

        //최소 비용을 출력해야 하기 때문에 PriorityQueue 를 사용한다.
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        //처음 정점을 먼저 넣어준다.
        pq.offer(new Edge(v, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();


        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<ArrayList<Edge>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n + 1];
        //다익스트라 알고리즘에서 초깃값은 int 의 최댓값으로 해준다.
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }


        for (int i = 1; i < graph.size(); i++) {
            ArrayList<Edge> arr = graph.get(i);
            System.out.println(i + "번 노드");
            for (int j = 0; j < arr.size(); j++) {
                System.out.println("[" + arr.get(j).vex + "] : " + arr.get(j).cost);
            }
            System.out.println();
        }

        /**
         * 1번 노드
         * [2] : 12
         * [3] : 4
         *
         * 2번 노드
         * [1] : 2
         * [3] : 5
         * [5] : 5
         *
         * 3번 노드
         * [4] : 5
         *
         * 4번 노드
         * [2] : 2
         * [5] : 5
         *
         * 5번 노드
         *
         * 6번 노드
         * [4] : 5
         *
         */

        Dijkstra2 sol = new Dijkstra2();
        sol.solution(1);
        for (int i = 1; i < dis.length; i++) {
            System.out.print(i + " : ");

            if (dis[i] == Integer.MAX_VALUE) {
                System.out.print("impossible");
            } else {
                System.out.print(dis[i]);
            }
            System.out.println();
        }

    }

}
