package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Codeup_1051 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] strarr = str.split(" ");

        int[] arr = new int[2];

        for(int i = 0; i < arr.length; i++){

            arr[i] = Integer.parseInt(strarr[i]);

        }

        if(arr[1] != arr[0]){
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
