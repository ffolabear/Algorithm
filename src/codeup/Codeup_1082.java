package codeup;

import java.util.Locale;
import java.util.Scanner;

public class Codeup_1082 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String hexaStr = sc.next();
        int hexa = Integer.parseInt(hexaStr, 16);

        for(int i = 1; i < 16; i++){

            System.out.println(hexaStr + "*" + Integer.toHexString(i).toUpperCase() + "=" + Integer.toHexString(hexa * i).toUpperCase());
        }




    }
}
