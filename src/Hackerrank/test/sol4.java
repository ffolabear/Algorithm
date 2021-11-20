package Hackerrank.test;

import java.util.ArrayList;
import java.util.List;

public class sol4 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int time= 0;

    public static String reachTheEnd(List<String> grid, int maxTime) {

        int m = grid.size();
        int n = grid.get(0).length();

        String[][] covt = new String[grid.size()][];
        for (int i = 0; i < grid.size(); i++) {
            covt[i] = grid.get(i).split("");
        }

        boolean[][] visited = new boolean[covt.length][covt[0].length];
        dfs(0, 0, covt, visited, maxTime);
        System.out.println(time);

        if (time <= maxTime) {
            return "Yes";
        } else {
            return "No";
        }

    }

    static void dfs(int x, int y, String[][] grid, boolean[][] visited, int maxTime) {

        if (x >= grid.length && y >= grid[0].length) {
            return;
        }

        if (visited[x][y]) {
            return;
        }

        visited[x][y] = true;


        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= grid.length || ny < 0 || ny >= grid[0].length) {

                continue;
            }



            if (grid[x][y].equals(".") && grid[nx][ny].equals(".") && !visited[nx][ny]) {
                time++;
                dfs(nx, ny, grid, visited, maxTime);


            }
        }
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("..##");
        list.add("#.##");
        list.add("#...");

        int maxTime = 5;
        reachTheEnd(list, maxTime);
    }
}
