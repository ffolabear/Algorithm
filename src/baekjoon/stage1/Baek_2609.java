package baekjoon.stage1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baek_2609 {

    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int l = Integer.parseInt(bf.readLine());

        List<Integer> list_n = new ArrayList<>();

        for (int i=1; i <= n; i ++){
            if (n % i == 0){
                list_n.add(i);
            }
        }




    }
}
