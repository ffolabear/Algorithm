package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1081 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] arr = str.split(" ");

        for (int i =1; i <= Integer.parseInt(arr[0]); i++){
            for(int j=1; j <= Integer.parseInt(arr[1]); j ++){
                System.out.println(i + " " + j);

            }

        }

    }
}
