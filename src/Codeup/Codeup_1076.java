package Codeup;

import java.util.Scanner;

public class Codeup_1076 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String c = sc.next();


        int init = (int)'a';

        do {
            System.out.println((char)init);
            init++;
        } while(init <= (int)c.charAt(0));


    }
}
