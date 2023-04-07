package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1095 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[19][19];


        for(int i = 0; i < N; i++){
            String input = bf.readLine();
            String[] num = input.split(" ");

            if(arr[Integer.parseInt(num[0])-1][Integer.parseInt(num[1])-1] < 1){
                arr[Integer.parseInt(num[0])-1][Integer.parseInt(num[1])-1]++;

            }

        }

        for (int i = 0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
