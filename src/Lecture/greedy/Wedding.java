package Lecture.greedy;

import java.util.*;

class Time{
    int time;
    char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }
}

public class Wedding {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Time> participant = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int depart = sc.nextInt();
            int arrive = sc.nextInt();

            participant.add(new Time(depart, 's'));
            participant.add(new Time(arrive, 'e'));
        }

        Collections.sort(participant, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return o1.time - o2.time;
            }
        });

        int cnt = 0;
        int answer = Integer.MIN_VALUE;


        for (int i = 0; i < participant.size(); i++) {
            if (participant.get(i).state == 's') {
                cnt++;
            } else {
                cnt--;
            }

            answer = Math.max(answer, cnt);

        }


        System.out.println(answer);

    }

}
