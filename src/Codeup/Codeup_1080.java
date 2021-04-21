package Codeup;

import java.util.Scanner;

public class Codeup_1080 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        int cnt = 0;

       while ( sum < N ){

           sum += ++cnt;
       }
        System.out.println(cnt);

    }
}
