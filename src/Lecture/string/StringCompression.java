package Lecture.string;

import java.util.Scanner;

public class StringCompression {

    private String solution(String str) {

        String[] arr = str.split("");
        StringBuilder sb = new StringBuilder();

        String last = "";
        int cnt = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                cnt++;
            } else {
                if (cnt > 1) {
                    sb.append(arr[i]).append(cnt);
                } else {
                    sb.append(arr[i]);
                }
                cnt = 1;
            }


        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringCompression sol = new StringCompression();
        System.out.println(sol.solution(str + " "));

    }

}
