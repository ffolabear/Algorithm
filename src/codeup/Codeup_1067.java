package codeup;


import java.util.Scanner;

public class Codeup_1067 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N > 0){
            System.out.println("plus");
        } else{
            System.out.println("minus");
        }


        if(N %2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
