package swexpert;

import java.io.*;

public class sw_1206_2 {


    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {

            int width = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] building = new int[width];
            for (int j = 0; j < building.length; j++) {
                building[j] = Integer.parseInt(input[j]);
            }
            bw.write("#" + (i + 1) + " " + calculate(building) + "\n");

        }

        bw.flush();
        bw.close();

    }

    static int calculate(int[] building) {

        int answer = 0;

        for (int i = 2; i < building.length - 2; i++) {
            int rightSpace = Integer.max(building[i + 1], building[i + 2]);
            int leftSpace = Integer.max(building[i - 1], building[i - 2]);

            int standard = Integer.max(rightSpace, leftSpace);
            if (standard >= building[i]) {
                continue;
            } else {
                answer += building[i] - standard;
            }


        }

        return answer;
    }

}
