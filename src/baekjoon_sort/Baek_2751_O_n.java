package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2751_O_n {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(bf.readLine());
		
		boolean[] counting = new boolean[2000001];

		for (int i = 0; i < N; i++) {
			counting[Integer.parseInt(bf.readLine()) + 1000000 ] = true;
		}

		for (int j = 0; j < counting.length; j++) {

			if (counting[j]) {
				sb.append((j - 1000000)).append("\n");
			}
		}
		
		System.out.println(sb);

	}

}
