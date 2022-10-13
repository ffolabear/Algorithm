package baekjoon.lecture.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_16947 {

    static int N;
    static ArrayList<Integer>[] nodes;
    static boolean[] isCycle;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        nodes = new ArrayList[N + 1];
        isCycle = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            nodes[i] = new ArrayList<>();
        }

        StringTokenizer st;


        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            st = new StringTokenizer(row);
            int current = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());

            nodes[current].add(next);
            nodes[next].add(current);
        }

        for (int i = 1; i <= N; i++) {
            if (checkCycle(i, i, i)) {
                break;
            }
            isCycle = new boolean[N + 1];
        }

        int[] result = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            if (!isCycle[i]) {
                result[i] = bfs(i);
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(result[i] + " ");
        }

    }

    static int bfs(int node) {

        Queue<Node> q = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        q.add(new Node(node, 0));
        visited[node] = true;

        while (!q.isEmpty()) {
            Node current = q.poll();
            if (isCycle[current.current]) {
                return current.count;
            }

            for (int i = 0; i < nodes[current.current].size(); i++) {
                int next = nodes[current.count].get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(new Node(next, current.count + 1));
                }
            }
        }
        return 0;
    }


    static boolean checkCycle(int prev, int node, int start) {

        isCycle[node] = true;
        for (int i = 0; i < nodes[node].size(); i++) {
            int next = nodes[node].get(i);

            if (!isCycle[next]) {
                if (checkCycle(node, next, start)) {
                    return true;
                }
            } else if (next != prev && next == start) {
                return true;
            }
        }
        isCycle[node] = false;

        return false;
    }

}

class Node{

    int current;
    int count;

    public Node(int i, int j) {
        this.current = i;
        this.count = j;
    }
}
