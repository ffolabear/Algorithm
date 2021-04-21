package Codeup;

import java.util.Scanner;

public class Codeup_1048 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        int[] num = new int[arr.length];

        for(int i =0; i < num.length; i++){
            num[i] = Integer.parseInt(arr[i]);

        }

        int val = (int)(Math.pow(2, num[1]));

        System.out.println(num[0] * val);

    }

}
