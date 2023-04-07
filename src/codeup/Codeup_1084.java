package codeup;

import java.io.*;

public class Codeup_1084 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = bf.readLine().split(" ");

        int cnt =0;

        for (int r=0; r < Integer.parseInt(arr[0]); r++){
            for (int g=0; g < Integer.parseInt(arr[1]); g++){
                for (int b=0; b < Integer.parseInt(arr[2]); b++){
                    cnt++;
                    //System.out.println(r + " " + g + " " + b);
                    bw.append(r + " " + g + " " + b + "\n");
                }


            }

        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();




    }
}
