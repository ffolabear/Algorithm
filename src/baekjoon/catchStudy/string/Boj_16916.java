package baekjoon.catchStudy.string;

import java.io.*;

public class Boj_16916 {

    static String s;
    static String p;
    static int[] table;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        s = br.readLine();
        p = br.readLine();

        makeTable(p);
        bw.append(String.valueOf(search(s, p)));
        bw.flush();
        bw.close();

    }

    public static int search(String str, String pattern) {

        int sLen = str.length();
        int pLen = pattern.length();

        int index = 0;

        for (int i = 0; i < sLen; i++) {
            //패턴의 문자와 원본의 문자가 다르다면
            while (index > 0 && str.charAt(i) != pattern.charAt(index)) {
                index = table[index - 1];
            }

            //만약 두 문자열이 같을때
            if (str.charAt(i) == pattern.charAt(index)) {
                //현재 인덱스가 패턴의 길이와 같다면? -> 탐색 종료
                if (index == pLen - 1) {
                    index = table[index];
                    return 1;
                } else {
                    //만약 인덱스가 패턴보다 짧다면 탐색 더해야함
                    index++;
                }
            }

        }

        return 0;
    }

    //접두사 접미사의 일치하는 부분을 표현한 pi 배열 만들기
    static void makeTable(String pattern) {

        int len = pattern.length();
        table = new int[len];

        int index = 0;

        for (int i = 1; i < len; i++) {

            while (index > 0 && pattern.charAt(i) != pattern.charAt(index)) {
                index = table[index - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(index)) {
                index += 1;
                table[i] = index;
            }

        }

        for (int i=0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();

    }

}
