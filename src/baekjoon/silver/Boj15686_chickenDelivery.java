package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj15686_chickenDelivery {

    static int N, M, ans;
    static boolean[] visited;
    static ArrayList<Node> chicken;
    static ArrayList<Node> house;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        chicken = new ArrayList<>();
        house = new ArrayList<>();




        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {

                int elem = Integer.parseInt(st.nextToken());

                if (elem == 1) {
                    house.add(new Node(i, j));

                } else if (elem == 2) {
                    chicken.add(new Node(i, j));
                }
            }
        }

        ans = Integer.MAX_VALUE;
        visited = new boolean[chicken.size()];
        chickenDistance(0, 0);


        bw.write(ans);
        bw.flush();
        bw.close();

    }

    static void chickenDistance(int idx, int cnt) {

        if (cnt == M) {

            int res = 0;

            for (int i = 0; i < house.size(); i++) {
                int temp = Integer.MAX_VALUE;

                for (int j = 0; j < chicken.size(); j++) {
                    if (visited[j]) {

                        int distance = Math.abs(house.get(i).x - chicken.get(j).x) + Math.abs(house.get(i).y - chicken.get(j).y);
                        temp = Math.min(temp, distance);
                    }
                }
                res += temp;
            }
            ans = Math.min(ans, res);
            return;

        }

        for (int i = idx; i < chicken.size(); i++) {
            visited[i] = true;
            chickenDistance(idx+1, cnt+1);
            visited[i] = false;
        }
    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}


