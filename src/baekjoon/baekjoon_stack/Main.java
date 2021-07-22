package baekjoon.baekjoon_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int K = Integer.parseInt(bf.readLine());
		int[] arr = new int[K];
		int end = -1;

		for (int i = 0; i < K; i++) {

			int number = Integer.parseInt(bf.readLine());

			if (number == 0) {
				end--;
			} else {
				end++;
				arr[end] = number;
			}

		}

		int sum = 0;
		for(int j=0; j <= end; j++) {
			sum += arr[j];
		}
		
		System.out.println(sum);
	}
}


