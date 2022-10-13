package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_2108_statistics {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());

		int[] num = new int[N];
		int[] arr = new int[8001];
		int sum = 0;

		// 합계
		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(bf.readLine());
			sum += val;

			num[i] = val;
			arr[val + 4000]++;

		}
		
		System.out.println((int)Math.round((double)sum / N));
		
		Arrays.sort(num);
		System.out.println(num[N/2]);

		
		
		

		boolean flag = false;
		int frequent = 0;
		int maxVal = 0;

		for (int i = 0; i < arr.length; i++) {


			if (arr[i] > maxVal) {
				maxVal = arr[i];

				frequent = i - 4000;
				flag = true;
				
			} else if (arr[i] == maxVal && flag == true) {
				
				frequent = i - 4000;
				flag = false;
			}

		}
		
		
		System.out.println(frequent);
		System.out.println(num[N-1] - num[0]);
		

	}

}
