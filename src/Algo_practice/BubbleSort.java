package Algo_practice;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

	static void swap(int[] arr, int index1, int index2) {

		int ptr = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = ptr;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------------");

	}

	static void bubblesort(int[] arr, int length) {

		for (int i = 0; i < length; i++) {
			// System.out.println("arr[" + i + "] : " + arr[i]);
			int cnt = 0;

			for (int j = length - 1; j > i; j--) {

				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
					cnt++;
					System.out.println(cnt + "///");
				}

			}
			if (cnt == 0) {
				break;
			}
		}
	}

	static void bubblesort2(int[] arr, int length) {
		
		int k = 0;
		while(k < length - 1) {
			int last = length - 1;
			
			for(int i = length - 1 ; i > k ; i--) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i-1, i);
					last = i;
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력하세요.");

		int N = sc.nextInt();
		int[] arr = new int[N];

		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(11);
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println("==============================");
		int start = (int) System.currentTimeMillis();

		//bubblesort(arr, N);
		bubblesort2(arr, N);
		

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

	}
}
