package Programmers.level01;

public class dart {

    public int solution(String dartResult) {

        int sum = 0;
        int lastScore = 0;
        int currentScore = 0;

        boolean multiply = false;

        for (int i = 0; i < dartResult.length(); i++) {



            //몇점인지 확인 하고 건너뛰기
            if (String.valueOf(dartResult.charAt(i)).matches("^[0-9]")) {
                currentScore = dartResult.charAt(i) - '0';
                System.out.println("현재 맞춘 점수 : " + currentScore);
                System.out.println(currentScore);
                continue;
            }

            // S or D or T
            if (String.valueOf(dartResult.charAt(i)).matches("^[A-Z]")) {

                if(String.valueOf(dartResult.charAt(i)).equals("D")){
                    System.out.println("더블");
                    currentScore = (int) Math.pow(currentScore, 2);

                } else if(String.valueOf(dartResult.charAt(i)).equals("T")){
                    System.out.println("트리플");
                    currentScore = (int) Math.pow(currentScore, 3);

                }

                lastScore = currentScore;
                System.out.println("이전 점수 : " + lastScore);
                System.out.println("현재 점수 : " + currentScore);
                System.out.println(String.valueOf(dartResult.charAt(i)) + " - " + lastScore);
                continue;
            }


            if (String.valueOf(dartResult.charAt(i)).equals("*")) {
                multiply = true;
            }

        }




        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {

        String dartResult = "10S2D*3T";
        dart sol = new dart();
        sol.solution(dartResult);

    }
}
