package swexpert;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class sw_5658 {

    static Scanner sc = new Scanner(System.in);
    static int T;
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {


        T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            calculation(i);

        }
        System.out.println(sb);

    }

    static void calculation(int testcase) {

        int N = sc.nextInt();
        int K = sc.nextInt();

        String input = sc.next();

        int side = N / 4;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            int index = 0;

            while (index < N) {
                String fragment = input.substring(index, index += side);
                int convert = Integer.parseInt(fragment, 16);
                list.add(convert);
            }

            System.out.println(input);

            String remain = input.substring(0, input.length() - 1);
            String end = input.substring(input.length() - 1, input.length());
            input = end + remain;

        }

        System.out.println();
        list.sort(Collections.reverseOrder());
        System.out.println(list);

        int prev = -1;
        int count = 0;


        for (int i = 0; i < list.size(); i++) {
            if (prev != list.get(i)) {
                count++;
            } else {
                continue;
            }

            if (count == K) {
                sb.append("#").append(testcase).append(" ").append(list.get(i)).append("\n");
            }

            prev = list.get(i);
        }

    }


}
