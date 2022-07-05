package baekjoon.catchStudy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_17413 {

    private static String withoutTag(String[] input) {

        StringBuilder ans = new StringBuilder();
        StringBuilder sb;

        for (int i = 0; i < input.length; i++) {
            sb = new StringBuilder(input[i]);
            ans.append(sb).append(" ");
        }

        return ans.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder ans = new StringBuilder();

        StringBuilder tagFront = new StringBuilder();
        StringBuilder tagBack = new StringBuilder();

        if (input.charAt(0) != '<') {
            String[] str = input.split(" ");
            ans.append(withoutTag(str));
        } else {
            for (int i = 0; i < input.length(); i++) {


            }

        }


    }

}
