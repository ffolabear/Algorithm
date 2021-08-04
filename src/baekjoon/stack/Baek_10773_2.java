package baekjoon.stack;

import java.util.Scanner;

public class Baek_10773_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int[] arr = new int[K];
		int ptr = -1;
		int sum = 0;

		for (int i = 0; i < K; i++) {
			int n = sc.nextInt();

			if (n == 0) {
				ptr--;

			} else {
				ptr++;
				arr[ptr] = n;
			}
		}

		for (int i = 0; i <= ptr; i++) {
			sum += arr[i];
		}

		System.out.println(sum);

	}

}
