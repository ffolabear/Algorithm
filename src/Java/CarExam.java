package Java;

public class CarExam {

    public static void main(String[] args) {

        //new 키워드가 생성자를 이용해서 새로운 객체를 만들었음
        //메모리에 만든 객체는 인스턴스
        //이 객체를 참조하는 변수가 c1, c2
        Car c1 = new Car();

        c1.name = "자동차";
        c1.number = 10;

        Car c2 = new Car();

        c2.name = "트럭";
        c2.number = 20;

        System.out.println(c1.name);
        System.out.println(c1.number);


    }


}
