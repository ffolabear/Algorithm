package programmers.level01;

import java.util.ArrayList;

public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {

        ArrayList<ArrayList<Integer>> sum = new ArrayList<>(5);
        ArrayList<ArrayList<Integer>> compare = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();

            int temp1 = arr1[i];
            int temp2 = arr2[i];

            while (temp1 > 0) {

                int remainder = temp1 % 2;
                list1.add(remainder);
                temp1 /= 2;

            }

            while (temp2 > 0) {

                int remainder = temp2 % 2;
                list2.add(remainder);
                temp2 /= 2;

            }


            if (arr1[i] < (int) Math.pow(2, n)) {
                int count = list1.size();

                while (count < n) {
                    list1.add(0);
                    count++;
                }
            }

            if (arr1[i] < (int) Math.pow(2, n)) {
                int count = list2.size();

                while (count < n) {
                    list2.add(0);
                    count++;
                }
            }

            System.out.println(list1);
//            System.out.println(list2);



            for (int j = 0; j < list1.size(); j++) {

                int bigger = Math.max(list1.get(j), list1.get(j));

            }

        }

        System.out.println();

//        for (int i = 0; i < arr2.length; i++) {
//            StringBuilder sb = new StringBuilder();
//            ArrayList<Integer> list = new ArrayList<>(5);
//            int temp = arr2[i];
//
//            while (temp > 0) {
//
//                int remainder = temp % 2;
//                list.add(remainder);
//                temp /= 2;
//
//            }
//
//            if (arr1[i] < (int) Math.pow(2, n)) {
//                int count = list.size();
//
//                while (count < n) {
//                    list.add(0);
//                    count++;
//                }
//            }
//
//            System.out.println(list);
//        }


        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        SecretMap sol = new SecretMap();
        sol.solution(n, arr1, arr2);

    }

}
