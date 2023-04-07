package juniorDeveloperEducation.day4;

import java.io.*;

public class Boj_1769 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        //1 2 3 4 5 6 7
        char[] arr = input.toCharArray();

        int sum = 0;
        int cnt = 0;

        String temp = "";
        String ans = "NO";

        if (input.length() == 1) {
            if (Integer.parseInt(input) % 3 == 0) {
                ans = "YES";
            }
            bw.append("0").append('\n');
            bw.append(ans);

        } else {
            while (temp.length() != 1) {

                sum = 0;

                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i] - '0';
                }

                temp = String.valueOf(sum);


                arr = temp.toCharArray();
                cnt++;
            }

            if (sum % 3 == 0) {
                ans = "YES";
            }

            bw.append(String.valueOf(cnt)).append('\n');
            bw.append(ans).append('\n');

        }

        bw.flush();
        bw.close();

    }

}
