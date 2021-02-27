package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1097 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int[][] arr = new int[19][19];


        for (int i = 0; i < arr.length; i++) {


            String line = bf.readLine();
            String[] lineStr = line.split(" ");

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = Integer.parseInt(lineStr[j]);
            }
        }


        int N = Integer.parseInt(bf.readLine());
        for (int i = 0; i < N; i++) {

            String line = bf.readLine();
            String[] lineStr = line.split(" ");
            for (int l = 0; l < arr.length; l++) {
                for (int m = 0; m < arr[l].length; m++) {


                    if (arr[Integer.parseInt(lineStr[0]) - 1][l] == 0) {
                        arr[Integer.parseInt(lineStr[0]) - 1][l] = 1;
                    } else {
                        arr[Integer.parseInt(lineStr[0]) - 1][l] = 0;
                    }

                    if (arr[m][Integer.parseInt(lineStr[1]) - 1] == 1) {

                        arr[m][Integer.parseInt(lineStr[1]) - 1] = 0;
                    } else {
                        arr[m][Integer.parseInt(lineStr[1]) - 1] = 1;
                    }

                }
            }


        }




        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
