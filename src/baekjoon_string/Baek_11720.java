package baekjoon_string;

import java.util.Scanner;

public class Baek_11720 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        String str = sc.nextLine();
        String[] arr = str.split("");
        for (int i=0; i < N; i ++){

            System.out.println(arr[i]);

        }



    }
}
