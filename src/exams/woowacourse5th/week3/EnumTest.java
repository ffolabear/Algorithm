package exams.woowacourse5th.week3;

public enum EnumTest {

    firstPrize("6개 일치 (2,000,000,000원) - ", 1),
    secondWithBonus("5개 일치, 보너스 볼 일치 (30,000,000원) - ", 2),
    secondPrize("5개 일치 (1,500,000원) - ", 3),
    third("4개 일치 (50,000원) - ", 4),
    fourth("3개 일치 (5,000원) - ", 5),
    ;


    private final String message;
    private final int rank;

    private EnumTest(String name, int value) {
        this.message = name;
        this.rank = value;
    }

    public String getMessage() {
        return this.message;
    }

    public int getRank() {
        return this.rank;
    }


    public static void main(String[] args) {
        for (EnumTest weeks : EnumTest.values()) {
            System.out.println(weeks.getMessage() + "22");
        }
    }
}