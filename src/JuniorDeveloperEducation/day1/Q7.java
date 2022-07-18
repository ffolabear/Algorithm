package JuniorDeveloperEducation.day1;

public class Q7 {

    public String solution(int n) {

        StringBuilder sb = new StringBuilder();

        int count = 1;
        boolean isSoo = true;

        while (count <= n) {
            if (isSoo) {
                sb.append("수");
                isSoo = false;
            } else {
                sb.append("박");
                isSoo = true;
            }
            count++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        int n = 12;
        Q7 sol = new Q7();
        sol.solution(n);
    }

}
