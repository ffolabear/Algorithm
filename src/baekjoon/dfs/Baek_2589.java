package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2589 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String wh = bf.readLine();
        String[] input = wh.split(" ");
        int height = Integer.parseInt(input[0]);
        int width = Integer.parseInt(input[1]);

        System.out.println(height);
        System.out.println(width);

        String[][] treasure = new String[height][width];




    }
}
