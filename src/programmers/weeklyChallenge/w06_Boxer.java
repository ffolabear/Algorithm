package programmers.weeklyChallenge;

import java.util.*;

class Boxer implements Comparable<Boxer> {

    double win = 0;
    int bonus = 0;
    int weight = 0;
    int player;


    public Boxer(double win, int bonus, int weight, int player) {
        this.win = win;
        this.bonus = bonus;
        this.weight = weight;
        this.player = player;
    }

    @Override
    public int compareTo(Boxer o) {

        if (o.win - win > 0) {
            return 1;
        } else if (o.win - win < 0) {
            return -1;
        } else {

            if (o.bonus - bonus > 0) {
                return 1;
            } else if (o.bonus - bonus < 0) {
                return -1;
            } else {

                if (o.weight - weight > 0) {
                    return 1;
                } else if (o.weight - weight < 0) {
                    return -1;
                } else {
                    if (o.player - player <= 0) {
                        return 1;
                    } else {
                        return -1;
                    }

                }
            }

        }
    }
}

public class w06_Boxer {


    public int[] solution(int[] weights, String[] head2head) {

        int[] answer = new int[weights.length];
        ArrayList<Boxer> boxerList = new ArrayList<>();

        for (int i = 0; i < weights.length; i++) {
            // 게임을 한 횟수는 게임을 진행하지 않은 N 을 제거한 후의 문자의 길이
            int gameCount = head2head[i].replace("N", "").length();
            // 승리횟수는 게임을 진행하지 않은 N과 게임을 패배한 L을 제거한 후의 문자의 길이
            int winCount = head2head[i].replace("N", "").replace("L", "").length();


            //게임을 진행히지 않았다면 승률을 계산할때 컴파일 에러가 발생하므로 명시적으로 예외처리
            if (gameCount == 0) {
                boxerList.add(new Boxer(0, bonusCalc(weights[i], weights, head2head[i]), weights[i], i + 1));
            } else {
                double winRate = (double) winCount / (double) gameCount;
                boxerList.add(new Boxer(winRate, bonusCalc(weights[i], weights, head2head[i]), weights[i], i + 1));
            }
        }

        Collections.sort(boxerList);

        for (int j = 0; j < boxerList.size(); j++) {
            System.out.println(boxerList.get(j).player);
            System.out.println(boxerList.get(j).weight);
            System.out.println(boxerList.get(j).win);
            System.out.println(boxerList.get(j).bonus);
            System.out.println("------------------------------------\n");
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = boxerList.get(i).player;
            System.out.println(answer[i]);
        }


        return answer;
    }

    public static int bonusCalc(int playerWeight, int[] weight, String head2head) {

        int cnt = 0;

        for (int i = 0; i < head2head.length(); i++) {
            if (head2head.charAt(i) == 'W') {
                if (playerWeight < weight[i]) {
                    System.out.println("선수 : " + playerWeight);
                    System.out.println("비교 선수 : " + weight[i]);

                    cnt++;
                }
            }

        }
        return cnt;
    }


    public static void main(String[] args) {

        w06_Boxer boxer = new w06_Boxer();

        int[] weights = {50, 82, 75, 120};
        String[] head2head = {"NLWL", "WNLL", "LWNW", "WWLN"};

//        int[] weights = {145,92,86};
//        String[] head2head = {"NLW","WNL","LWN"};

//        int[] weights = {60,70,60};
//        String[] head2head = {"NNN","NNN","NNN"};

        boxer.solution(weights, head2head);

    }
}

