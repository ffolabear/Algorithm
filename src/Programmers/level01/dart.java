package Programmers.level01;

public class dart {

    public int solution(String dartResult) {

        int[] result = new int[3];

        String numStr = "";
        int index = 0;

        for (int i = 0; i < dartResult.length(); i++) {

            switch (dartResult.charAt(i)) {

                case 'S':
                    result[index] = (int) Math.pow(Integer.parseInt(numStr), 1);
                    index++;
                    numStr = "";
                    break;

                case 'D':
                    result[index] = (int) Math.pow(Integer.parseInt(numStr), 2);
                    index++;
                    numStr = "";
                    break;

                case 'T':
                    result[index] = (int) Math.pow(Integer.parseInt(numStr), 3);
                    index++;
                    numStr = "";
                    break;

                case '*':    // 스타상 :  바로 전에 얻은 점수를 각 2배

                    result[index - 1] *= 2;
                    if (index > 1) {
                        result[index - 2] *= 2;
                    }

                    break;

                case '#':    // 아차상 :  해당 점수는 마이너스
                    result[index - 1] *= -1;
                    break;

                default:
                    numStr += String.valueOf(dartResult.charAt(i));
                    break;


            }
        }

        int answer = 0;

        for (int i : result) {
            answer += i;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

//        String dartResult = "1S2D*3T";
        String dartResult = "1D2S#10S";
        dart sol = new dart();
        sol.solution(dartResult);

    }
}
