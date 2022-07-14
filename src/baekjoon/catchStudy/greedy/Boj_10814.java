package baekjoon.catchStudy.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Boj_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String[]> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {

            String[] input = br.readLine().split(" ");
            list.add(input);
        }

        list.sort(new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {

                int age1 = Integer.parseInt(o1[0]);
                int age2 = Integer.parseInt(o2[0]);

                return age1 - age2;
            }

        });

        for (String[] str : list) {
            bw.append(str[0]).append(' ').append(str[1]).append('\n');
        }

        bw.flush();
        bw.close();

    }
}
