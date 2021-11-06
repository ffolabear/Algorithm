package Exams.woowacourse4th;

public class Sol6 {

    public String solution(double time, String[][] plans) {

        String answer = "";

        for (int i = 0; i < plans.length; i++) {


            if (isValid(plans[i], time)) {
                answer = plans[i][0];
            }

        }

        System.out.println(answer);
        return answer;
    }

    static boolean isValid(String[] row, double time) {

        int vacation = 0;

        int depart = Integer.parseInt(row[1].replaceAll("[PM,AM]", ""));
        int arrive = Integer.parseInt(row[2].replaceAll("[PM,AM]", ""));

        //출발 시간이 오전이면 무조건 불가능
        if (row[1].contains("AM")) {
            return false;
        //출발 시간이 오후이면서 6시 이전일때는 계산 필요
        } else if (row[1].contains("PM")) {
            if (depart < 6) {
                vacation += 6 - depart;
            }
        }

        //도착시간이 오전이면 상관없음
        if (row[2].contains("PM")) {
            if (arrive > 1) {
                vacation += arrive - 1;
            }
        }


        if (vacation > time) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        double time = 3.5;
//        String[][] plans = {{"홍콩", "11PM", "9AM"},
//                            {"엘에이", "3PM", "2AM"}};

        String[][] plans = {{"홍콩", "11PM", "9AM"},
                            {"엘에이", "11PM", "9AM"}};


        Sol6 sol = new Sol6();
        sol.solution(time, plans);

    }
}
