package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1065 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] strarr = str.split(" ");


        for(int i = 0; i < strarr.length; i++){

            if(Integer.parseInt(strarr[i]) % 2 == 0){
                System.out.println(strarr[i]);
            }
        }




    }
}
