package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Codeup_1091 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = (bf.readLine()).split(" ");
        int[] arr = new int[str.length];

        for(int i =0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        long[] array = new long[arr[3]];
        array[0] = arr[0];
        DecimalFormat df = new DecimalFormat("#.#");


        for(int i =1; i < array.length; i++){

            array[i] = (array[i-1] * arr[1]) + arr[2];
        }

        System.out.println(df.format(array[array.length-1]));

    }
}
