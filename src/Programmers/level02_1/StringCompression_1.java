package Programmers.level02_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        접근 아이디어
        1. 자를수 있는 토큰의 최대길이는 문자열 길이 / 2 이다.
        2.

 */

public class StringCompression_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력해주세요.");
        String str = sc.nextLine();

        solution(str);

    }

    public static int solution(String s) {

        String answer = "";
        int init = s.length();



        // 토큰의 최대 길이는 전체 문자열 크기의 절반이다.
        for (int j = 2; j <= s.length() / 2; j++) {

            int exists = s.length()%j;
            List<String> list = new ArrayList<>();

            //토큰의 길이를 정한다음 문자열 전체에서 탐색
            for (int i = 0; i <= s.length() - j - s.length() % j; i += j) {
                list.add(s.substring(i, i + j));
            }

            int cnt = 1;

            for (int k=0; k < list.size() - 1; k ++){

                if (list.get(k).equals(list.get(k+1))){
                    cnt++;
                } else {

                    if (cnt > 1){

                        answer += answer + cnt + list.get(k);
                    } else {
                        answer += list.get(k);
                    }

                    cnt = 1;

                }
            }

            System.out.println(answer);

            if (cnt > 1) {
                answer = answer + cnt + list.get(list.size()- 1);
            } else {
                answer += list.get(list.size()-1);
            }


            System.out.println(answer.length() + exists);

            if (exists < s.length()){
                return exists;
            }
        }


        return s.length();
    }


}
