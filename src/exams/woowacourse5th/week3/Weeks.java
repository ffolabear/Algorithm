package exams.woowacourse5th.week3;

public enum Weeks {

    MONDAY("mon", 10),
    TUESDAY("tue", 20),
    WEDNESDAY("wed", 30),
    THURSDAY("thu", 40),
    FRIDAY("fri", 50),
    SATURDAY("sat", 60),
    SUNDAY("sun", 70);

    private final String name;
    private final int value;

    private Weeks(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }


    public static void main(String[] args) {
        for (Weeks weeks : Weeks.values()) {
            System.out.println(weeks.getName());
        }
    }
}