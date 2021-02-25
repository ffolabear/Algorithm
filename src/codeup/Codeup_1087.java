package codeup;

import java.util.Scanner;

public class Codeup_1087 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        int sum=0;

        for(int i =1; i >0; i++){

            sum += i;
            if(sum >= N){
                System.out.println(sum);
                break;
            }

        }
    }
}
