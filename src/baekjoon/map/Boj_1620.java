package baekjoon.map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj_1620 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> pokedexA = new HashMap<>();
        Map<Integer, String> pokedexB = new HashMap<>();

        int number = 1;

        for (int i = 0; i < N; i++) {
            String name = br.readLine();

            pokedexA.put(name, number);
            pokedexB.put(number, name);

            number++;
        }

        for (int i = 0; i < M; i++) {

            String input = br.readLine();

            if (Character.isDigit(input.charAt(0))) {
                bw.append(pokedexB.get(Integer.parseInt(input))).append("\n");

            } else {
                bw.append(String.valueOf(pokedexA.get(input))).append("\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
