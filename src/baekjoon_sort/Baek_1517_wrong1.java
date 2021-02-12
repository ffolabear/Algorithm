package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1517_wrong1 {

	static int sort(int[] arrc, int N) {

		int cnt = 0;
		int k = 0;
		
		while (k < N - 1) {
			int last = N - 1;
			for (int j = N - 1; j > k; j--) {
				if (arrc[j - 1] > arrc[j]) {
					System.out.println("============================");
					
					System.out.println(arrc[j - 1]);
					System.out.println(arrc[j]);
					
					System.out.println("----------------------------");
					cnt++;

					int ptr = arrc[j - 1];
					arrc[j - 1] = arrc[j];
					arrc[j] = ptr;
					
					last = j;
				}
				k = last;
			}

		}

		return cnt;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());
		String str = bf.readLine();

		// 초기 입력 배열
		String[] arr = str.split(" ");

		// 입력한 값 형변환한 배열
		int[] arrc = new int[arr.length];
		
		System.out.println("N : " + N  );
		System.out.println("arr : " + arr.length  );
		System.out.println("arrc : " + arrc.length  );
		
		for (int i = 0; i < N; i++) {
			arrc[i] = Integer.parseInt(arr[i]);

		}
		
		
		System.out.println(sort(arrc, N));

	}

}
