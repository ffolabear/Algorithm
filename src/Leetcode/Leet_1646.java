package Leetcode;

import java.util.Scanner;

class Leet_1646 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(getMaximumGenerated(n + 1));

    }

    public static int getMaximumGenerated(int n) {

        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {

            if (i % 2 == 0) {
                arr[i] = arr[i / 2];

            } else if (i % 2 == 1) {
                arr[i] = arr[(i-1)/ 2] + arr[(i-1)/ 2 + 1];

            }

        }


        int aws = arr[0];
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
            if (aws < arr[j]) {
                aws = arr[j];
            }
        }
        System.out.println("---------------------------");
        return aws;


    }


}
