package baekjoon.catch_DataStructure;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Boj_1920 {

    static ArrayList<Integer> list = new ArrayList<>();

    static int find(int current) {

        int bottom = 0;
        int top = list.size() - 1;

        while (top >= bottom) {

            int mid = (bottom + top) / 2;

            if (current < list.get(mid)) {
                top = mid - 1;
            } else  if (current > list.get(mid)){
                bottom = mid + 1;
            } else {

                return mid;
            }

        }

        return -1;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] nums = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int current = Integer.parseInt(nums[i]);
            list.add(current);
        }

        Collections.sort(list);

        int M = Integer.parseInt(br.readLine());
        nums = br.readLine().split(" ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < M; i++) {

            if (find(Integer.parseInt(nums[i])) != -1) {
                bw.append('1').append("\n");
            } else {
                bw.append('0').append("\n");

            }
        }

        bw.flush();

    }

}
