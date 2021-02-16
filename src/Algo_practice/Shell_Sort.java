package Algo_practice;

import java.util.Random;
import java.util.Scanner;

public class Shell_Sort {
	
	private static void shellsort(int[] arr, int length) {
		
		// 첫번째 시행에서 gap = 4
		for(int gap = length / 2; gap > 0; gap /= 2) {
			
			System.out.println("gap : " + gap);
			System.out.println("==============================");
			// 첫번째 시행에서 i = 4 ~ 7
			for(int i = gap; i < length; i ++) {
				int j;
				int temp = arr[i];
				
				
				System.out.println("i : " + i);
				System.out.println("temp : " + temp);
				
				// 첫번째 시행에서 j = 0 ~ 3
				for(j = i - gap; j >= 0 && arr[j] > temp;  j -= gap) {
					System.out.println("j : " + j);
					arr[j + gap] = arr[j];
				}
				arr[j + gap] = temp;
				System.out.println("--------------");
				
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(11);
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println(" ------- 정렬 전 배열 -------");
		
		shellsort(arr, N);
		
		System.out.println(" ------- 정렬 후 배열 -------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

	}
	

}
