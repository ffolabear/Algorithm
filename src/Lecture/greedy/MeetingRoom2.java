package Lecture.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class Meeting {

    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MeetingRoom2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Meeting> meeting = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            meeting.add(new Meeting(start, end));
        }



        Collections.sort(meeting, new Comparator<Meeting>() {

            @Override
            public int compare(Meeting o1, Meeting o2) {
                if (o1.end == o2.end) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }
        });

        int cnt = 0;
        int last = 0;

        for (Meeting m : meeting) {
            if (m.start >= last) {
                cnt++;
                last = m.end;
            }
        }


        System.out.println(cnt);

    }
}
