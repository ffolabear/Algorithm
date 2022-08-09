package Programmers.practice.part1;

import java.util.*;

public class ParkingFee {
    public int[] solution(int[] fees, String[] records) {

        Map<String, String[]> map = new HashMap<>();

        for (int i = 0; i < records.length; i++) {

            String[] row = records[i].split(" ");
            String currentCarNum = row[1];

            if (!map.containsKey(currentCarNum)) {
                String[] info = new String[2];
                info[0] = "0";
                info[1] = row[0];
                map.put(row[1], info);

            } else {

                String[] currentInfo = map.get(currentCarNum);

                if (currentInfo[1].equals("-1")) {
                    currentInfo[1] = row[0];
                    map.put(currentCarNum, currentInfo);

                } else {

                    String t1 = currentInfo[1];
                    String t2 = row[0];

                    String time = calculateTime(t1, t2);

                    int sum = Integer.parseInt(currentInfo[0]) + Integer.parseInt(time);

                    currentInfo[0] = String.valueOf(sum);
                    currentInfo[1] = "-1";

                    map.put(currentCarNum, currentInfo);


                }

            }

        }

        for (String s : map.keySet()) {

            String[] temp = map.get(s);
            String midnight = "23:59";

            if (!temp[1].equals("-1")) {
                String currentTime = temp[0];
                String untilMidnight = calculateTime(temp[1], midnight);
                String sum = String.valueOf(Integer.parseInt(currentTime) + Integer.parseInt(untilMidnight));

                temp[0] = sum;
                temp[1] = "-1";

                map.put(s, temp);

            }

        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        int[] answer = new int[keySet.size()];

        int idx = 0;

        for (String carNum : keySet) {

            String[] temp = map.get(carNum);
            int time = Integer.parseInt(temp[0]);
            int fee = fees[1];

            if (time > fees[0]) {
                fee += Math.ceil(((time - fees[0]) / (double) fees[2])) * fees[3];
            }

            answer[idx++] = fee;
        }


        return answer;
    }


    public String calculateTime(String t1, String t2) {

        String[] t1Arr = t1.split(":");
        String[] t2Arr = t2.split(":");

        int hour = Integer.parseInt(t2Arr[0]) - Integer.parseInt(t1Arr[0]);
        int min = Integer.parseInt(t2Arr[1]) - Integer.parseInt(t1Arr[1]);

        int res = hour * 60 + min;

        return String.valueOf(res);
    }


    public static void main(String[] args) {

        ParkingFee sol = new ParkingFee();

        int[] fees = {180, 5000, 10, 600};
//        int[] fees = {120, 0, 60, 591};

        String[] records = {"05:34 5961 IN",

                "06:00 0000 IN",
                "06:34 0000 OUT",

                "07:59 5961 OUT",
                "07:59 0148 IN",
                "18:59 0000 IN",
                "19:09 0148 OUT",

                "22:59 5961 IN",
                "23:00 5961 OUT"};

//        String[] records = {"16:00 3961 IN",
//                            "16:00 0202 IN",
//                            "18:00 3961 OUT",
//                            "18:00 0202 OUT",
//                            "23:58 3961 IN"};

        sol.solution(fees, records);

    }

}
