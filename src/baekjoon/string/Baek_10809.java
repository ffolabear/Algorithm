package baekjoon.string;

import java.io.*;

public class Baek_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String s = bf.readLine();


        int[] letters = new int[26];

        for (int i=0; i < letters.length; i++){
            letters[i] = -1;
        }

        for(int i=0; i < s.length(); i++){

            letters[s.charAt(i) - 97] = s.indexOf(s.charAt(i));

        }

        for(int i : letters){
            System.out.print(i + " ");
        }



    }

}
