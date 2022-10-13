package baekjoon.loop_for;

import java.util.*;

public class Boj_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num >= 1 && num <= 9) {
			gugudan(num);
		} else {
		}

	}

	public static void gugudan(int num) {

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
