package baekjoon_string;

import java.io.*;
import java.util.*;


public class Baek_1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int[] chars = new int[26];

        for (int i =0 ; i < str.length(); i++){

            if (Character.isUpperCase(str.charAt(i))){

                chars[str.charAt(i) - 65]++;

            } else {
                chars[str.charAt(i) - 97]++;
            }
        }

        int ans = 65;
        int max = -1;

        for (int j = 0 ; j < chars.length; j ++){

            int ptr = 0;

            if (chars[j] > max){
                max = chars[j];
                ans = 65 + j;
            } else if(chars[j] == max){
                ans = 63;
            }

        }

        System.out.println((char) ans);



    }


}
