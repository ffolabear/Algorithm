package Lecture.bfs;

import Lecture.DirectionArrayList;
import Lecture.DirectionGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindingShortest {

    static int n;
    static int m;
    static ArrayList<ArrayList<Integer>> list;

    //방문 여부 체크
    static boolean[] chk;
    //정점당 거리 기록
    static int[] distance;

    private void BFS(int v) {

        Queue<Integer> queue = new LinkedList<>();

        //방문 처리
        chk[v] = true;
        distance[v] = 0;

        queue.offer(v);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            for (Integer next : list.get(current)) {
                if (!chk[next]) {
                    chk[next] = true;
                    queue.offer(next);
                    distance[next] = distance[current] + 1;
                }

            }
        }


    }

    public static void main(String[] args) {

        DirectionArrayList graph = new DirectionArrayList();
        list = graph.list;
        graph.graphMake();

        n = graph.n;
        m = graph.m;

        System.out.println(n + " " + m);
        chk = new boolean[n + 1];
        distance = new int[n + 1];



        FindingShortest sol = new FindingShortest();
        sol.BFS(1);

        for (int i : distance) {
            System.out.print(i + " ");
        }

    }

}
