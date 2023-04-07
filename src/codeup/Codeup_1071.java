package codeup;

import java.util.Scanner;

public class Codeup_1071 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++){

            if(Integer.parseInt(arr[i]) != 0){
                System.out.println(arr[i]);
            } else {
                break;
            }


        }

    }
}
