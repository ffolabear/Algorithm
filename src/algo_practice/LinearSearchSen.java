package algo_practice;

import java.util.Scanner;

public class LinearSearchSen {


    static int seqSearchSen(int[] a, int n, int key ){

        int i = 0;

        a[n] = key;
        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }

    return i == n? -1 : i;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            x[i] = (int) (Math.random() * 10);
            System.out.println("x[" + i + "] : " + x[i]);
        }

        System.out.println("검색할 값 :  ");
        int key = sc.nextInt();
        int ans = seqSearchSen(x, num, key);

        if (ans == -1) {
            System.out.println("값을 찾지 못했습니다.");
        } else {
            System.out.println(ans + "번쨰 인덱스에서 찾았습니다.");
        }

    }



}
