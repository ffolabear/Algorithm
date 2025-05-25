package codetree.noviceMid;

import java.util.Scanner;

public class FuncWithOneParam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printString(n);
    }

    public static void printString(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("12345^&*()_");
        }
    }

}
