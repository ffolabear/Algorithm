package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number = bf.readLine();

        int time = 0;

        for (int i = 0; i < number.length(); i++) {

            char alphabet = number.charAt(i);
            int ascii = (int) alphabet;

            System.out.println(covt(ascii));
            time += covt(ascii);



        }

        System.out.println(time);

    }

    static int covt(int ascii){

        int time = 0;

        if (ascii >= 65 && ascii <= 67){
            time = 3;
        } else if (ascii >= 68 && ascii <= 70){
            time = 4;
        } else if (ascii >= 71 && ascii <= 73){
            time = 5;
        } else if (ascii >= 74 && ascii <= 76){
            time = 6;
        } else if (ascii >= 77 && ascii <= 79){
            time = 7;
        } else if (ascii >= 80 && ascii <= 83){
            time = 8;
        } else if (ascii >= 84 && ascii <= 86){
            time = 9;
        } else if (ascii >= 87 && ascii <= 90){
            time = 10;
        }

        return time;

    }


}
