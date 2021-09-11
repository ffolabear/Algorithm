package Exams.kakao_2022;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class sol3 {

    public int[] solution(int[] fees, String[] records) {

        HashMap<String, ArrayList<String>> data = new HashMap<>();

        for (int i = 0; i < records.length; i++) {

            String car = records[i].substring(6, 10);
            data.put(car, null);
            ArrayList<String> times = new ArrayList<>();

            for (int j = 0; j < records.length; j++) {

                String[] value = records[j].split(" ");



                if (value[1].equals(car)) {
                    times.add(value[0]);
                }


                data.put(car, times);
            }
        }

        System.out.println(data);

        data.forEach((key, value) -> timeCal(value));

        int[] answer = {};
        return answer;
    }

    public int timeCal(ArrayList<String> times) {

        for (int i = 0; i < times.size(); i++) {





        }

        System.out.println(1);
        return 0;
    }

    public static void main(String[] args) {

        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN",
                            "06:00 0000 IN",
                            "06:34 0000 OUT",
                            "07:59 5961 OUT",
                            "07:59 0148 IN",
                            "18:59 0000 IN",
                            "19:09 0148 OUT",
                            "22:59 5961 IN",
                            "23:00 5961 OUT"};

//        int[] fees = {120, 0, 60, 591};
//        String[] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};

//        int[] fees = {1, 461, 1, 10};
//        String[] records = {"00:00 1234 IN"};



        sol3 sol = new sol3();
        sol.solution(fees, records);

    }

}
