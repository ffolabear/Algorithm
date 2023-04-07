package lecture.stackQueue;

import java.util.*;



public class EmergencyRoom {

    static class Patient{

        int order;
        int warn;

        public Patient(int order, int warn) {
            this.order = order;
            this.warn = warn;
        }
    }

    private int solution(int[] patients, int M) {

        int ans = 0;

        Queue<Patient> queue = new LinkedList<>();

        for (int i = 0; i < patients.length; i++) {
            queue.add(new Patient(i, patients[i]));
        }

        while (!queue.isEmpty()) {

            //접수한 순서대로의 목록에서 제일 앞에 있는 환자
            Patient current = queue.poll();

            System.out.println("현재 : " + current.warn + " "  + current.order);

            //나머지 대기 목록에서 꺼낸 환자
            for (Patient rest : queue) {
                if (rest.warn > current.warn) {
                    queue.add(current);
                    current = null;
                    break;
                }
            }

            if (current != null) {
                ans++;
                if (current.order == M) {
                    return ans;
                }
            }

            for (Patient p : queue) {
                System.out.print("[" + p.order + "," + p.warn  + "]");
            }
            System.out.println();

        }


        return ans;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] patients = new int[N];
        for (int i = 0; i < patients.length; i++) {
            patients[i] = in.nextInt();
        }

        EmergencyRoom sol = new EmergencyRoom();
        System.out.println(sol.solution(patients, M));
    }
}
