package juniorDeveloperEducation.day4;

import java.io.*;

public class Boj_15904 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] arr = {'U', 'C', 'P', 'C'};

        int index = 0;

        for (int i = 0; i < input.length(); i++) {

            if (index == 4) {
                break;
            }

            if (input.charAt(i) == arr[index]) {
                index++;
            }

        }

        if (index == 4) {
            bw.append("I love UCPC");
        } else {
            bw.append("I hate UCPC");
        }
        bw.flush();
        bw.close();
    }
}
