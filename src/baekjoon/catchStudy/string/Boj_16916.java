package baekjoon.catchStudy.string;

import java.io.*;

public class Boj_16916 {

    static String s;
    static String p;



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        s = br.readLine();
        p = br.readLine();



    }

    private static int[] getPi() {
        int[] pi = new int[p.length()];
        int j = 0;
        for (int i = 1; i < p.length(); i++) {
            while(j>0 && p.charAt(i)!=p.charAt(j)) {
                j = pi[j-1];
            }
            if(p.charAt(i)==p.charAt(j)) {
                pi[i]=++j;
            }
        }
        return pi;
    }

}
