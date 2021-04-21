package Codeup;

import java.util.Scanner;

public class Codeup_1088 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        int sum=0;

        for(int i =1; i <= N; i++){

           if(i %3==0){
               continue;
           } else{
               System.out.print(i + " ");
           }
        }
    }
}
