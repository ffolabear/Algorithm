package baekjoon.catch_DataStructure;

import java.io.*;
import java.util.*;

public class Boj_1764 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        Map<String, Integer> neverHeard = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            neverHeard.put(name, 0);
        }

        int ans = 0;
        ArrayList<String> nameList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (neverHeard.containsKey(name)) {
                nameList.add(name);
                ans += 1;
            }
        }

        Collections.sort(nameList);

        bw.append(String.valueOf(ans)).append('\n');
        for (String s : nameList) {
            bw.append(s).append('\n');
        }

        bw.flush();
        bw.close();

    }

}
