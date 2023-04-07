package juniorDeveloperEducation.day3;

/**
 * 하루동안 시침과 분침이 직각이 되는 순간을 hh:mm 향태로 출력
 */
public class Q21 {

    public static void main(String[] args) {

        int hour = 0;
        int min = 0;
        int countHour = 0;
        boolean isPm = false;

        //hour 가 30도 진행할 때
        //min 이 360도 진행

        while (countHour < 25) {

            if (min >= 360) {
                min = min - 360;
            }

            if (hour >= 360) {
                hour = hour - 360;
            }

            if (hour % 30 == 0) {
                countHour++;
            }

            if (countHour == 12) {
                isPm = true;
            }

            int calculateDegree = 0;

            //시침이 1 ~ 3시 분침이 45 ~ 60 사이
            if (hour <= 90 && min >= 270) {
                calculateDegree = Math.abs((360 - min) + hour);

            //시침이 9 ~ 12시 분침이 0 ~ 15 사이
            } else if (hour >= 270 && min <= 90){

                calculateDegree = Math.abs((360 - hour) + min);

            } else {
                calculateDegree = Math.abs(min - hour);
            }


            if (calculateDegree == 90) {
                convertToTime(hour, min, isPm);

            }

            min += 12;
            hour += 1;

//            System.out.println(hour + " " + min + " " + calculateDegree);
        }


    }

    private static void convertToTime(int hour, int min, boolean isPm) {

        int currentHour = hour / 30;
        int currentMin = min / 6;

        String beforeNoon = "오전";

        if (isPm) {
            beforeNoon = "오후";
        }

        System.out.println(hour + " : " + min + " | " + currentHour + " : " + currentMin);
    }


}
