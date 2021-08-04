package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_3052 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력한 수의 나머지를 저장하는배열
		// 나머지가 1
		int[] num = new int[10];

		int[] rem = new int[42];

		for (int i = 0; i < num.length; i++) {

			num[i] = Integer.parseInt(bf.readLine()) % 42;

		}

		for (int i = 0; i < 10; i++) {

			rem[(num[i])]++;

		}

		int count = 0;
		for (int i = 0; i < rem.length; i++) {

			if (rem[i] != 0) {
				count++;
			}

		}
		System.out.println(count);

	}

}
