package juniorDeveloperEducation.day1;

public class Q5 {

    public String solution(String phone_number) {

        StringBuilder sb = new StringBuilder();
        int hideCnt = phone_number.length() - 4;

        String showNum = phone_number.substring(hideCnt);

        for (int i = 0; i < hideCnt; i++) {
            sb.append('*');
        }

        sb.append(showNum);

        return sb.toString();
    }

    public static void main(String[] args) {

        String phone_number = "01033334444";

        Q5 sol = new Q5();

        System.out.println(sol.solution(phone_number));

    }
}
