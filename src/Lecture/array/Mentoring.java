package Lecture.array;

import java.util.Scanner;

public class Mentoring {

    private int solution(int N, int M, int[][] student) {

        int ans = 0;

        //멘토 찾는 반복문
        for (int i = 0; i < N; i++) {

            //멘티 찾는 반복분
            for (int j = 0; j < N; j++) {

                if (i == j) {
                    continue;
                }

                int mentor = student[0][i];
                int mentee = student[0][j];
                System.out.println("멘토 : " + mentor + " 멘티 : " + mentee);


                int mentorCompare = 0;
                int menteeCompare = 0;

                boolean isValidMentor = false;

                for (int l = 0; l < M; l++) {
                    for (int k = 0; k < N; k++) {

                        if (mentor == student[l][k]) {
                            mentorCompare = k;
                        }

                        if (mentee == student[l][k]) {
                            menteeCompare = k;
                        }

                    }
                    System.out.println(l + " 번 테스트의 멘토 : " + mentorCompare + " 멘티 : " + menteeCompare);

                    if (mentorCompare < menteeCompare) {
                        isValidMentor = true;
                    } else {
                        isValidMentor = false;
                        break;
                    }

                }

                if (isValidMentor) {
                    System.out.println("🟩 멘토 : " + mentor + " 멘티 : " + mentee + " 🟩");
                    ans++;
                }

                System.out.println();
            }
        }


        return ans;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();


        int[][] student = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                student[i][j] = in.nextInt();
            }
        }


        Mentoring sol = new Mentoring();
        System.out.println(sol.solution(N, M, student));


    }


}
