package juniorDeveloperEducation.day1;

import java.io.*;
import java.util.Random;

public class Q4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int game = Integer.parseInt(br.readLine());
        int count = 0;
        Random random = new Random();

        bw.append("***** 로또 번호 자동 생성기 *****").append('\n');
        bw.append("---------------------------").append('\n');
        bw.append("게임 수 : ").append(String.valueOf(game)).append('\n');


        while (count < game) {
            bw.append('[');
            for (int i = 0; i < 6; i++) {
                int num = random.nextInt(47);
                if (i == 5) {
                    bw.append(String.valueOf(num));
                } else {
                    bw.append(String.valueOf(num)).append(',').append(' ');
                }
            }

            bw.append(']').append('\n');
            count++;
        }

        bw.append("***** 로또 번호 자동 완료 *****");

        bw.flush();
        bw.close();

    }

}
