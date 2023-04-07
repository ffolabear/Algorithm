package programmers.jetBrainsChallenge;

import java.util.ArrayList;

class city {

    int gold = 0;
    int silver = 0;
    int time = 0;
    int truckWeight = 0;

    public city(int gold, int silver, int time, int truckWeight) {
        this.gold = gold;
        this.silver = silver;
        this.time = time;
        this.truckWeight = truckWeight;
    }

}


public class sol3 {

    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = -1;

        ArrayList<city> cityList = new ArrayList<>();

        int cityNum = g.length;

        for (int i = 0; i < cityNum; i++) {
            cityList.add(new city(g[i], s[i], w[i], t[i]));
        }

        for (int i = 0; i < cityNum; i++) {

            int remainGold = cityList.get(i).gold;
            int remainSilver = cityList.get(i).silver;


        }


        return answer;
    }

    public static void main(String[] args) {

//        int a = 10;
//        int b = 10;
//        int[] g = {100};
//        int[] s = {100};
//        int[] w = {7};
//        int[] t = {10};

        int a = 90;
        int b = 500;
        int[] g = {70, 70, 0};
        int[] s = {0, 0, 500};
        int[] w = {100, 100, 2};
        int[] t = {4,8,1};
        sol3 sol = new sol3();
        sol.solution(a, b, g, s, w, t);

    }
}
