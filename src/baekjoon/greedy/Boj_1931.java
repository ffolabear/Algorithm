package baekjoon.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Meeting {

    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Boj_1931 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        ArrayList<Meeting> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list.add(new Meeting(start, end));

        }

        Collections.sort(list, new Comparator<Meeting>() {
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

        for (Meeting m : list) {
            if (m.start >= last) {
                cnt++;
                last = m.end;
            }
        }

        bw.append(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }

}
