package swexpert;

import java.util.*;

public class sw_5658 {

    public static void main(String args[]) throws Exception {


        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        int N = sc.nextInt();
        int K = sc.nextInt();
        String input = sc.next();

        int side = N / 4;

        ArrayList<Integer> list = new ArrayList<>();

        for (int test_case = 1; test_case <= T; test_case++) {
            int index = 0;

            while (index < N) {
                String fragment = input.substring(index, index += side);

                list.add(Integer.parseInt(fragment, 16));
            }




            String remain = input.substring(0, input.length() - 1);
            String end = input.substring(input.length() - 1, input.length());
            input = end + remain;

        }

        Collections.sort(list, Collections.reverseOrder());

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                continue;
            } else {
                map.put(list.get(i), i);
            }
        }

        System.out.println(map);

    }


}
