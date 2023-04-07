package codeup;

import java.util.Scanner;

public class Codeup_1078 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum=0;
        for (int i = 0 ; i <= N; i++){

            if (i%2 == 0){
                sum += i;
            }

        }

        System.out.println(sum);

    }

}
