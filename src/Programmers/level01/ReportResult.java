package Programmers.level01;

import java.util.*;

public class ReportResult {

    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        //[신고된 ID, [신고한 ID들]]
        Map<String, HashSet<String>> reportedMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            reportedMap.put(id_list[i], new HashSet<>());
        }

        //[신고된 ID, 메일 수]
        Map<String, Integer> answerMap = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String[] temp = report[i].split(" ");
            reportedMap.get(temp[1]).add(temp[0]);
        }

        for (int i = 0; i < id_list.length; i++) {
            answerMap.put(id_list[i], 0);
        }

        for (String reportedUser : reportedMap.keySet()) {
            HashSet<String> result = reportedMap.get(reportedUser);
            if (result.size() >= k) {
                for (String reportingUser : result) {
                    answerMap.put(reportingUser, answerMap.get(reportingUser) + 1);
                }
            }
        }


        for (int i = 0; i < id_list.length; i++) {
            answer[i] = answerMap.get(id_list[i]);
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

        ReportResult sol = new ReportResult();
        sol.solution(id_list, report, k);


    }

}
