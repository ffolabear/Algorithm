package Codeup;

import java.util.Scanner;

public class Codeup_1072 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String removespace = sc.nextLine();
        String str = sc.nextLine();


        String[] arr = str.split(" ");


        for (int i = 0; i < cnt; i++) {
            System.out.println(arr[i]);
        }

    }
}
