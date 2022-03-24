package Lecture.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseWord {

    private String solution(String word) {

        StringBuilder sb = new StringBuilder();

        char[] arr = word.toCharArray();

        int lt = 0;
        int rt = arr.length - 1;
        while (lt < rt) {
            char temp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = temp;
            lt++;
            rt--;
        }


        for (int i = 0; i < arr.length; i++) {
            sb.append(String.valueOf(arr[i]));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        ReverseWord sol = new ReverseWord();


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String word = sc.next();

            System.out.println(sol.solution(word));
        }
    }
}
