package baekjoon_stage1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baek_2309 {


    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        int n = 9;


        for (int i = 0; i < n; i++) {
            int dwarf = Integer.parseInt(bf.readLine());
            list.add(dwarf);
            sum += dwarf;
        }

        Collections.sort(list);


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (sum - list.get(i) - list.get(j) == 100) {

                    for (int k = 0; k < n; k++) {

                        if (k == i || k == j) {
                            continue;
                        }
                        System.out.println(list.get(k));

                    }


                    System.exit(0);
                }

            }

        }

    }

}

