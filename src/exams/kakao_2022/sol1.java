package exams.kakao_2022;


import java.util.Arrays;
import java.util.HashMap;

public class sol1 {

    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        String[] duplicate_chk = Arrays.stream(report).distinct().toArray(String[]::new);

        HashMap<String, Integer> report_result = new HashMap<>();

        for (int i = 0; i < duplicate_chk.length; i++) {

            String name = duplicate_chk[i].substring(duplicate_chk[i].lastIndexOf(" ") + 1);
            int report_cnt = 0;

            for (int j = 0; j < duplicate_chk.length; j++) {
                if (duplicate_chk[j].substring(duplicate_chk[j].lastIndexOf(" ") + 1).equals(name)) {
                    report_cnt++;
                }
            }
            report_result.put(name, report_cnt);
        }


        for (int i = 0; i < id_list.length; i++) {

            int count = 0;


            for (int j = 0; j < duplicate_chk.length; j++) {
                String name = duplicate_chk[j].substring(0, duplicate_chk[j].lastIndexOf(" "));
                String report_name = duplicate_chk[j].substring(duplicate_chk[j].lastIndexOf(" ") + 1);

                if (id_list[i].equals(name)) {

                    if (report_result.get(report_name) >= k) {

                        count++;
                    }
                }
                System.out.println(id_list[i] + " " + count);

                answer[i] = count;

            }
        }


        return answer;
    }

    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

//        String[] id_list = {"con", "ryan"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//        int k = 3;
//


        sol1 sol = new sol1();
        sol.solution(id_list, report, k);

    }
}
