package codeup;
import java.util.Scanner;

public class Codeup_1083 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i ++){

            if(i%3 == 0){
                System.out.print("X ");
            } else{
                System.out.print(i + " ");
            }

        }

    }
}
