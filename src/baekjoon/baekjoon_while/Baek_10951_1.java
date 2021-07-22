package baekjoon.baekjoon_while;

import java.util.Scanner;

public class Baek_10951_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a+b);
		}
		in.close();

	}
}
