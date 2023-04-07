package juniorDeveloperEducation.day6;

import java.io.*;
import java.util.Arrays;

public class Boj_10610 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i] - '0';
            sb.append(temp);
            sum += temp;
        }



        if (sb.toString().charAt(sb.length() - 1) == '0' && sum % 3 == 0) {
            bw.append(sb);
        } else {
            bw.append("-1");
        }

        bw.flush();
        bw.close();
    }

}
