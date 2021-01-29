package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2750 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			;

		}

		for (int i = 0; i < arr.length - 1; i++) {
			int search;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					search = arr[j];
					arr[j] = arr[i];
					arr[i] = search;
				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}

		System.out.println(sb);
	}

}
