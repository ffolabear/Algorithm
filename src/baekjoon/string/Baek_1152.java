package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1152 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();


        int answer = 0;


        if (str.equals(" ")) {
            answer = 0;

        } else {

            if (str.charAt(0) == ' ') {
                str = str.substring(1);
            }

            if (str.charAt(str.length() - 1) == ' ') {
                str = str.substring(0, str.length() - 1);
            }


            answer = str.split(" ").length;


        }


        System.out.println(answer);

    }


}
