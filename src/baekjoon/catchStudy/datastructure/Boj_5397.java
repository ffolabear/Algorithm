package baekjoon.catchStudy.datastructure;

import java.io.*;
import java.util.Stack;

public class Boj_5397 {

    public static String solution(String str) {

        Stack<Character> preCursor = new Stack<>();
        Stack<Character> postCursor = new Stack<>();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < str.length(); j++) {

            switch (str.charAt(j)) {
                case '<':
                    if (!preCursor.isEmpty()) {
                        postCursor.push(preCursor.pop());
                    }
                    break;

                case '>':
                    if (!postCursor.isEmpty()) {
                        preCursor.push(postCursor.pop());
                    }
                    break;

                case '-':
                    if (!preCursor.isEmpty()) {
                        preCursor.pop();
                    }
                    break;

                default:
                    preCursor.push(str.charAt(j));
                    break;
            }

        }

        while (!postCursor.isEmpty()) {
            preCursor.push(postCursor.pop());
        }

        for (int k = 0; k < preCursor.size(); k++) {
            sb.append(preCursor.elementAt(k));
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            System.out.println(solution(input));
        }

    }

}
