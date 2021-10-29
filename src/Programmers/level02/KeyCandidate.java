package Programmers.level02;

public class KeyCandidate {

    static String[] covt;

    public int solution(String[][] relation) {

        covt = new String[relation.length];

        for (int i = 0; i < relation.length; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < relation[i].length; j++) {
                sb.append(relation[i][j]);
            }

            covt[i] = sb.toString();
        }

        dfs(relation[0], 0, "");


        int answer = 0;

        return answer;
    }

    static int dfs(String[] row, int depth, String key) {




        return 0;
    }

    public static void main(String[] args) {

        String[][] relation = {
                {"100", "ryan", "music", "2"},
                {"200","apeach","math","2"},
                {"300","tube","computer","3"},
                {"400","con","computer","4"},
                {"500","muzi","music","3"},
                {"600","apeach","music","2"}
        };

        KeyCandidate sol = new KeyCandidate();
        sol.solution(relation);

    }

}
