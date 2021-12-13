package Java.Java_study;


public class Zoo {

    final int animal;

    {
        System.out.println("인스턴스 초기화 블록");
        animal = 100;
        System.out.println("animal : " + animal);
    }

    static {
        System.out.println("정적 초기화 블록");
    }

    public Zoo() {
        System.out.println("생성자 호출");
    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Zoo zoo1 = new Zoo();

    }
}
