package Programmers.Test;

public class test {

    public static void main(String[] args) {

       int num = 45;
       String cont = "";

      while (num > 0){

          cont = num%3 + cont;
          num /= 3;

      }

        System.out.println(cont);

    }

}
