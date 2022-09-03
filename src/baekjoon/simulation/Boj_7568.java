package baekjoon.simulation;

import java.io.*;
import java.util.*;

class info {

    int weight;
    int height;

    public info(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}

public class Boj_7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<info> list = new ArrayList<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            list.add(new info(weight, height));
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (list.get(i).height < list.get(j).height && list.get(i).weight < list.get(j).weight) {
                    rank++;
                }

            }
            bw.append(String.valueOf(rank)).append(" ");
        }


        for (info i : list) {
            int rank = 1;
            for (info j : list) {
                if (i.height < j.weight && i.weight < j.height) {
                    rank++;
                }
            }

//            bw.append(String.valueOf(rank)).append(" ");
        }

        bw.flush();
        bw.close();

    }

}
