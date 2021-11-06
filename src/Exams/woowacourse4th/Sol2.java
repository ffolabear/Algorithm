package Exams.woowacourse4th;

public class Sol2 {

    static int time;
    static int minute;

    public String solution(String[] log) {


        for (int i = 0; i < log.length; i += 2) {

            time(log[i], log[i + 1]);

        }
        StringBuilder ans = new StringBuilder();
        int total = time * 60 + minute;

        String timeStr = String.valueOf(total / 60);
        String minStr = String.valueOf(total % 60);

        if (timeStr.length() == 1) {
            ans.append(0).append(timeStr).append(":");
        } else {
            ans.append(timeStr).append(":");
        }

        if (minStr.length() == 1) {
            ans.append(0).append(minStr);
        } else {
            ans.append(minStr);
        }


        String answer = ans.toString();
        return answer;
    }

    static void time(String str1, String str2) {

        String[] arr1 = str1.split(":");
        String[] arr2 = str2.split(":");

        int timeTemp = Integer.parseInt(arr2[0]) - Integer.parseInt(arr1[0]);
        int minuteTemp = Integer.parseInt(arr2[1]) - Integer.parseInt(arr1[1]);

        if (timeTemp == 0 && minuteTemp < 5) {
            minuteTemp = 0;
        }

        if (timeTemp >= 1 && minuteTemp > 45) {
            timeTemp = 1;
            minuteTemp = 45;
        } else if (timeTemp >= 2) {
            timeTemp = 1;
            minuteTemp = 45;
        }


        if (timeTemp > 0) {
            if (minuteTemp < 0) {
                timeTemp = 0;
                minuteTemp = Math.abs(minuteTemp);
            } else {
                minuteTemp = Math.abs(minuteTemp);

            }
        }

        time += timeTemp;
        minute += minuteTemp;


    }

    public static void main(String[] args) {

        String[] log = {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
        Sol2 sol = new Sol2();
        sol.solution(log);


    }
}
