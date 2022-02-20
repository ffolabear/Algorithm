package baekjoon.io;

import java.util.*;

public class Boj_2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		prn(H, M);
	}

	public static void prn(int H, int M) {
		int time = (H * 60 + M);
		int hour = 0;
		int minute = 0;
		if (M < 45 && H == 0) {
			hour = 23;
			minute = 15 + M;
			System.out.println(hour + " " + minute);
		} else {
			hour = (time - 45) / 60;
			minute = (time - 45) % 60;
			System.out.println(hour + " " + minute);
		}
	}
}
