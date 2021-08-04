package baekjoon.string;

import java.io.*;

public class Baek_11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = bf.readLine();
        String nums = bf.readLine();

        String[] str = nums.split("");
        int sum = 0;

        for (int i=0; i <  Integer.parseInt(n); i++){

            sum += Integer.parseInt(str[i]);

        }


        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
