package Lecture.greedy;

import java.util.*;

/**
 * 입력 예시
 * ex) 1번 정점에서 2번 정점으로 가는데 12의 비용이 든다.
 * 6 9
 * 1 2 12
 * 1 3 4
 * 2 1 2
 * 2 3 5
 * 2 5 5
 * 3 4 5
 * 4 2 2
 * 4 5 5
 * 6 4 5
 * <p>
 * ---------
 * <p>
 * 2 : 11
 * 3 : 4
 * 4 : 9
 * 5 : 14
 * 6 : impossible
 */

class Edge implements Comparable<Edge> {

    int vex;
    int cost;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }

}

public class Dijkstra {

    static int n, m;
    //정점과 정점의 정보를 저장할 배열
    static ArrayList<ArrayList<Edge>> graph;

    //1부터 각 정점까지의 거리의 최솟값을 저장할 배열
    static int[] dis;

    public void solution(int v) {

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(v, 0));
        dis[v] = 0;

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int now = current.vex;
            int nowCost = current.cost;

            if (nowCost > dis[now]) {
                continue;
            }

            for (Edge ob : graph.get(now)) {
                if (dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost;
                    pq.offer(new Edge(ob.vex, nowCost + ob.cost));
                }
            }
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
            System.out.println(i + " 번 노드");
            for (int j = 0; j < arr.size(); j++) {
                System.out.println(arr.get(j).vex + " : " + arr.get(j).cost);
            }
            System.out.println();
        }



        Dijkstra sol = new Dijkstra();
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
