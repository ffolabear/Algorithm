package codetree.noviceMid;

import java.util.Scanner;

public class PrintingStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i < 5; i ++){
            printStars();
        }
    }

    public static void printStars(){
        for(int i=0; i < 10; i ++){
            System.out.printf("*");
        }
        System.out.println();
    }


}
