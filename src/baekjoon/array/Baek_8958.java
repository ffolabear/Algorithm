package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_8958 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(bf.readLine());
		String[] test = new String[N];

		for (int i = 0; i < N; i++) {
			test[i] = bf.readLine();
		}

		for (int i = 0; i < N; i++) {

			int cnt = 0;
			int sum = 0;

			for (int k = 0; k < test[i].length(); k++) {

				if (test[i].charAt(k) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}

				sum += cnt;
			}

			sb.append(sum).append('\n');
		}
		System.out.print(sb);
	}

}
