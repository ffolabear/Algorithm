package Programmers.level02;

import java.util.*;

public class SearchingRank {

    public int[] solution(String[] info, String[] query) {

        String[][] volunteers = new String[info.length][5];
        String[][] questions = new String[query.length][];

        int[] answer = new int[query.length];
        Map<Integer, ArrayList<String>> init = new HashMap<>();

        for (int i = 0; i < info.length; i++) {
            String[] temp = info[i].split(" ");

            ArrayList<String> list = new ArrayList<>();
            list.add(temp[0]);
            list.add(temp[1]);
            list.add(temp[2]);
            list.add(temp[3]);

            init.put(Integer.parseInt(temp[4]), list);

        }

        List<Map.Entry<Integer,  ArrayList<String>>> covt = new ArrayList<Map.Entry<Integer, ArrayList<String>>>(init.entrySet());
        covt.sort(new Comparator<Map.Entry<Integer, ArrayList<String>>>() {


            @Override
            public int compare(Map.Entry<Integer, ArrayList<String>> o1, Map.Entry<Integer, ArrayList<String>> o2) {

                return o1.getKey().compareTo(o2.getKey());
            }
        });


        System.out.println(covt);



        System.out.println();
        System.out.println();

        for (int i = 0; i < query.length; i++) {
            String temp = query[i].replaceAll(" and ", " ");
            questions[i] = temp.split(" ");
        }

        //---------------------------------------------------------------

        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length; j++) {
                System.out.print(questions[i][j] + " ");
            }
            System.out.println();
        }

        //---------------------------------------------------------------


        return answer;
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
