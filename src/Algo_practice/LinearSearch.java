package Algo_practice;

import java.util.Scanner;

public class LinearSearch {

    static int seqSearch(int[] a, int n, int key) {

//        int i = 0;
//
//        while (true) {
//            if (i == n) {
//                return -1;
//            }
//            if (a[i] == key) {
//                return i;
//            }
//            i++;
//        }
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];


        for (int i = 0; i < num; i++) {
            x[i] = (int) (Math.random() * 10);
            System.out.println("x[" + i + "] : " + x[i]);
        }

        System.out.println("검색할 값 :  ");
        int key = sc.nextInt();
        int ans = seqSearch(x, num, key);

        if (ans == -1) {
            System.out.println("값을 찾지 못했습니다.");
        } else {
            System.out.println(ans + "번쨰 인덱스에서 찾았습니다.");
        }

    }
}
