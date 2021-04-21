package Codeup;

import java.util.Scanner;

public class Codeup_1045 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");



        System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]));
        System.out.println(Integer.parseInt(arr[0]) % Integer.parseInt(arr[1]));
        System.out.println(String.format("%.2f",(Integer.parseInt(arr[0]) / Double.parseDouble(arr[1]))));

    }
}
