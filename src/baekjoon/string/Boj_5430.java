package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Boj_5430 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String command = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String[] arrInput = br.readLine().replaceAll("[,\\[\\]]","").split("");
            ArrayList<Integer> arr = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                arr.add(Integer.parseInt(arrInput[j]));
            }

            System.out.println(function(command, n, arr));
        }

    }

    private static String function(String command, int n, ArrayList<Integer> arr) {

        String result = "";

        int pointer = 0;
        for (int i = 0; i < command.length(); i++) {

            if (arr.size() == 0 && command.charAt(i) == 'D') {
                return "error";
            } else {
                if (command.charAt(i) == 'R') {

                    if (pointer == 0) {
                        pointer = arr.size() - 1;
                    } else {
                        pointer = 0;
                    }

                } else if (command.charAt(i) == 'D') {
                    arr.remove(pointer);
                    if (pointer != 0) {
                        pointer--;
                    }
                }
            }

        }

        result = arr.toString();

        return result;

    }

}
