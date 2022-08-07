package baekjoon.map;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj_14425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> words = new HashMap<>();
        ArrayList<String> target = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            words.put(br.readLine(), 0);
        }

        int cnt = 0;

        for (int i = 0; i < M; i++) {

            String input = br.readLine();
            if (words.containsKey(input)) {
                cnt++;
            }
        }

        bw.append(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
