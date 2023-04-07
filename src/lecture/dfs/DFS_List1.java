package lecture.dfs;

import lecture.DirectionArrayList;

import java.util.ArrayList;

public class DFS_List1 {

    static DirectionArrayList dirList = new DirectionArrayList();

    static ArrayList<ArrayList<Integer>> list;
    static boolean[] chk;

    static int ans = 0;
    static int n, m;

    private void DFS(int v) {

        if (v == n) {
            ans++;
        } else {
            for (int next : list.get(v)) {
                if (!chk[next]) {
                    chk[next] = true;
                    DFS(next);
                    chk[next] = false;
                }

            }
        }
    }

    public static void main(String[] args) {

        dirList.graphMake();
        n = dirList.n;
        m = dirList.m;
        list = dirList.list;

        chk = new boolean[n + 1];
        DFS_List1 sol = new DFS_List1();
        chk[1] = true;
        sol.DFS(1);

        System.out.println(ans);
    }


}
