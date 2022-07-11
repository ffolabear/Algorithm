package baekjoon.catchStudy.string;

import java.io.*;
import java.util.Scanner;

public class Boj_17609 {

    static int t;
    static String s;
    static char[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        String word = "";
        int result = 0;

        for (int i = 0; i < t; i++) {

            word = br.readLine();
            result = check(word);

        }
    }

    private static int check(String word) {

        //투포인터 알고리즘
        int left = 0;
        int right = word.length() - 1;
        int result = 0;

        while (left <= right) {
            if (word.charAt(left) == word.charAt(right)) {
                //끝에서 비교했을때 두 문자가 같다면 중심으로 포인터를 옮겨야함
                left++;
                right--;
            } else {
                result = 1;
                //유사 회문인지 체크용 포인터
                int tempL = left + 1;
                int tempR = right;

                while (tempL <= tempR) {
                    if (word.charAt(tempL) == word.charAt(tempR)) {
                        tempL++;
                        tempR--;
                    } else {
                        //유사 회문이 아니면 탐색할 이유가 없음
                        result++;
                        break;
                    }
                }

                tempL = left;
                tempR = right - 1;

                while (tempL <= tempR) {
                    if (word.charAt(tempL) == word.charAt(tempR)) {
                        tempL++;
                        tempR--;
                    } else {
                        //유사 회문이 아니면 탐색할 이유가 없음
                        result++;
                        break;
                    }
                }

                return result;
            }
        }

        return result;
    }


}
