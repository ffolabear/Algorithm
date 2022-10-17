package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_20291 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("\\.");
            String extension = str[1];
            map.put(extension, map.getOrDefault(extension, 0) + 1);
        }

        ArrayList<String> keymap = new ArrayList<>(map.keySet());
        Collections.sort(keymap);

        StringBuilder sb = new StringBuilder();
        for (String key : keymap) {
            sb.append(key).append(" ").append(map.get(key)).append('\n');
        }
        System.out.println(sb);
    }

}
