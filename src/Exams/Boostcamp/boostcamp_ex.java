package Exams.Boostcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class boostcamp_ex {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4};

//        Map<Integer, Integer> ans = solution(arr);

//        for (Map.Entry<Integer, Integer> elem : ans.entrySet()){
//            System.out.println("키 : " + elem.getKey() + "값 : " + elem.getValue());
//        }

        List<Integer> list = solution(arr);

        for (int i : list){
            System.out.println(i);
        }

    }

    public static List<Integer> solution(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i =0; i < arr.length; i++){

            int cnt = 0;
            int temp = arr[i];

            for (int j=0 ; j < arr.length; j ++){


                if (temp == arr[j]){
                    cnt++;
                }

            }

            if (cnt == 1){
                map.put(temp, 0);
            } else {
                map.put(temp, cnt);

            }
        }

        for (int keys : map.keySet()){

            if (map.get(keys) != 0){
                list.add(map.get(keys));
            }
        }

        if (list.size() == 0){
            list.add(-1);
            return list;
        }  else {
            return list;
        }
    }


}
