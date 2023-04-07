package codeup;

import java.util.Scanner;

public class Codeup_1068 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(90<= N && N <= 100){
            System.out.println("A");
        } else if (70<= N && N <= 89){
            System.out.println("B");
        } else if (40<= N && N <= 69){
            System.out.println("C");
        } else if (0<= N && N <= 39){
            System.out.println("D");
        }




    }
}
