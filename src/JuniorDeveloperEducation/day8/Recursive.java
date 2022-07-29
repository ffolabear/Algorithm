package JuniorDeveloperEducation.day8;

public class Recursive {

    static int i = 1;

    public static void main(String[] args) {

        recur();

    }

    private static void recur() {
        System.out.println("재귀함수 호출 - " + i++ + "번째");
        if (i > 100) {
            return;
        }

        recur();

    }

}
