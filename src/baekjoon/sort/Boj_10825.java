package baekjoon.sort;

import java.io.*;
import java.util.*;

class Info {

    String name;
    int kor;
    int eng;
    int math;

    public Info(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class Boj_10825 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        ArrayList<Info> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            list.add(new Info(name, kor, eng, math));
        }

//        for (Info i : list) {
//            System.out.println(i.name + " " + i.kor + " " + i.eng + " " + i.math);
//        }

        Collections.sort(list, new Comparator<Info>() {

            @Override
            public int compare(Info o1, Info o2) {

                if (o1.kor != o2.kor) {
                    return o2.kor - o1.kor;
                }

                if (o1.eng != o2.eng) {
                    return o1.eng - o2.eng;
                }

                if (o1.math != o2.math) {
                    return o2.math - o1.math;
                }

                return o1.name.compareTo(o2.name);
            }

        });

        for (Info i : list) {
            bw.append(String.valueOf(i.name)).append('\n');
        }

        bw.flush();
        bw.close();

    }

}
