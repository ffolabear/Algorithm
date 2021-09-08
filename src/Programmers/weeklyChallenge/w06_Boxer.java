package Programmers.weeklyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Boxer implements Comparable<Boxer>{

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
        } else if(o.win - win < 0){
            return -1;
        } else{

            if (o.bonus - bonus > 0) {
                return 1;
            } else if (o.bonus - bonus < 0) {
                return -1;
            } else{

                if (o.weight - weight > 0) {
                    return 1;
                } else if (o.weight - weight < 0) {
                    return -1;
                } else{
                    if (o.player - player <= 0) {
                        return 1;
                    } else{
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
            int pan = head2head[i].replace("N","").length();
            System.out.println(head2head[i]);

        }



        return answer;
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

