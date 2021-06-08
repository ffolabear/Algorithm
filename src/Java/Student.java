package Java;

/*

    생성자 테스트

 */

public class Student {

    private final String name;
    private final int number;
    private final boolean isEnroll;

    //생성자
    public Student(String name, int number, boolean isEnroll) {

        //객체 자신을 참조하는 키워드
        this.name = name;
        this.number = number;
        this.isEnroll = isEnroll;


    }


}
