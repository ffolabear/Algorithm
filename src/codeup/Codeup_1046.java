package codeup;

import java.util.Scanner;

public class Codeup_1046 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        int[] nums = new int[arr.length];

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {

            nums[i] = Integer.parseInt(arr[i]);
            sum += nums[i];
        }

        double avg = (double)sum/3;

        System.out.println(sum);
        System.out.printf("%.1f",avg);


    }

}
