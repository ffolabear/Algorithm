package lecture.dfs;

import lecture.DirectionGraph;

public class DFS_Graph1 {

    static DirectionGraph graph = new DirectionGraph();
    static int[][] nodes;
    static boolean[] chk;
    static int ans = 0;
    static int n, m;

    private void DFS(int v) {
        if (v == n) {
            ans++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (nodes[v][i] == 1 && !chk[i]) {
                    chk[i] = true;
                    DFS(i);
                    chk[i] = false;
                }

            }
        }
    }

    public static void main(String[] args) {

        graph.graphMake();
        n = graph.n;
        m = graph.m;
        nodes = graph.graph;

        chk = new boolean[n + 1];
        chk[1] = true;

        DFS_Graph1 sol = new DFS_Graph1();
        sol.DFS(1);
        System.out.println(ans);
    }

}
