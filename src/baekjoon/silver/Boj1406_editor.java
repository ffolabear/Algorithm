package baekjoon.silver;

import java.io.*;

public class Boj1406_editor {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuffer input;
    static int cursor;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = new StringBuffer(br.readLine());

        int N = input.length();
        int M = Integer.parseInt(br.readLine());
        cursor = N;

        for (int i = 0; i < M; i++) {

            String[] command = br.readLine().split(" ");

            if (command[0].equals("L")) {

                if (cursor > 0) {
                    L();
                } else {
                    continue;
                }

            } else if (command[0].equals("D")) {
                if (cursor < N) {
                    D();
                } else {
                    continue;
                }

            } else if (command[0].equals("B")) {

                if (cursor != 0) {
                    B();
                } else {
                    continue;
                }


            } else if (command[0].equals("P")) {
                P(command[1]);
            }

        }

        System.out.println(input);


    }

    static void L() {
        cursor -= 1;
    }

    static void D() {
        cursor += 1;
    }

    static void B() {
        input.deleteCharAt(cursor - 1);
        cursor -= 1;
    }

    static void P(String element) {

        if (cursor == 0) {
            input.insert(0, element);
        } else if (cursor == input.length() + 1){
            input.append(element);
        } else {
            input.insert(cursor, element);
        }

        cursor += 1;
    }


}
