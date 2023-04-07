package programmers.level02;

public class RecommendingNewId {

    public String solution(String new_id) {

        String answer = "";
        answer = new_id.toLowerCase();

        System.out.println("1단계 : " + answer);

        String stage2 = "[^-_.0-9a-z]";
        answer = answer.replaceAll(stage2, "");

        System.out.println("2단계 : " + answer);

        String stage3 = "[.]{2,}";
        answer = answer.replaceAll(stage3, ".");

        System.out.println("3단계 : " + answer);

        String stage4 = "^[.]|[.]$";
        answer = answer.replaceAll(stage4, "");

        System.out.println("4단계 : " + answer);

        if (answer.length() == 0) {
            answer = "a";
        }

        System.out.println("5단계 : " + answer);

        String stage5 = "[.]$";

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll(stage5, "");
        }

        System.out.println("6단계 : " + answer);

        if (answer.length() <= 2){
            char last = answer.charAt(answer.length() - 1);
            System.out.println(last);
            while (answer.length() < 3){
                answer += last;
            }
        }

        System.out.println("결과 : " + answer);
        return answer;
    }

    public static void main(String[] args) {


        String new_id = "...!@BaT#*..y.abcdefghijklm.";
        String id = "uuuuuuuuuuuuu.";
        String uu = "z-.";


        RecommendingNewId sol = new RecommendingNewId();
        sol.solution(new_id);
    }
}
