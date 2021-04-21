package baekjoon_random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1062 {

    // convert a~b to ascii code (97 - 122)

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("단어의 갯수와 글자의 갯수를 입력하세요.");
        String str = bf.readLine();

        // 최초 단어갯수, 가르칠 글자 저장하는 배열
        String[] strarr = str.split(" ");
        // 숫자로 변환한 배열
        int[] val = new int[strarr.length];

        for (int i = 0; i < strarr.length; i++) {
            val[i] = Integer.parseInt(strarr[i]);
        }

        //-------------------------------------------------------------------------------

        // 단어를 저장할 배열

        // anta , tica 제외한 글자들
        // words[i] = word.substring(4, word.length() - 4);

        //boolean[] alphabet = new boolean[26];


        for (int i = 0; i < val[0]; i++) {

            String word = bf.readLine();

            boolean[][] chars = new boolean[val[0]][26];
            for (int j=0; j < word.length(); j++){

                chars[0][word.charAt(j) - 'a'] = true;
                System.out.println(chars[0][word.charAt(j) - 'a']);
            }



        }


    }

}
