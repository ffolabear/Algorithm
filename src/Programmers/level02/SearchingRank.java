package Programmers.level02;

import java.util.*;

public class SearchingRank {

    static Map<String, ArrayList<Integer>> data;

    public int[] solution(String[] info, String[] query) {

        //정답
        int[] answer = new int[query.length];
        data = new HashMap<>();

        //가능한 조합수를 저장
        for (String s : info) {
            String[] raw = s.split(" ");
            dfs("", 0, raw);
        }

        //이진 탐색부분
        List<String> list = new ArrayList<>(data.keySet());
        for(int i=0; i<list.size(); i++) {
            List<Integer> scoreList = data.get(list.get(i));
            Collections.sort(scoreList);
        }


        for (int i=0; i < query.length; i++) {

            String queryRow = query[i].replaceAll(" and ", "");
            String[] queryData = queryRow.split(" ");

            int score = Integer.parseInt(queryData[1]);
            answer[i] = bns(queryData[0], score);

        }

        return answer;
    }

    static void dfs(String str, int depth, String[] raw) {

        if (depth == 4) {
            int score = Integer.parseInt(raw[4]);

            if (data.containsKey(str)) {
                data.get(str).add(score);
            } else {
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(score);
                data.put(str, tmp);
            }
            return;
        }

        //"-" 를 포함할 경우와 포함하지 않을 경우를 같이 고려해야함

        dfs(str + "-", depth + 1, raw);
        dfs(str + raw[depth], depth + 1, raw);
    }

    static int bns(String query, int score) {

        if (!data.containsKey(query)) {
            return 0;
        }

        ArrayList<Integer> scores = data.get(query);
        int start = 0, end = scores.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;


            if (score > scores.get(mid)) {
                start = mid + 1;

            } else{
                end = mid - 1;
            }
        }
        return scores.size() - start;
    }

    public static void main(String[] args) {


        String[] info = {"java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"};


        String[] query = {"java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100",
                "- and - and - and - 150"};

        SearchingRank sol = new SearchingRank();
        sol.solution(info, query);

    }

}
