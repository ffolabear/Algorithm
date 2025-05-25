package codetree.noviceMid;

import java.util.Scanner;

public class DigitRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (number >= 10) {
                    number = 1;
                }
                System.out.print(number++);
                System.out.print(' ');

            }
            System.out.println();
        }
    }

}
