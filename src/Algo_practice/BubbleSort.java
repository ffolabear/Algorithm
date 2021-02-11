package Algo_practice;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

	static void swap(int[] arr, int index1, int index2) {
		
		int ptr = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = ptr;

	}

	static void bubblesort(int[] arr, int length) {
		
		
		
		// 뒤에 있는 원소들부터 패스를 진행
		// 패스가 끝날때마다 정렬이 더이상 필요없는 원소들이 뒤에있음
		for (int i = length -1 ; i > 0; i--) {
			
			// 이미 비교가 끝난 원소들을 건너뛰기 위한 변수
			int cnt = 0;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j + 1]) {
					
					swap(arr, j, j+1);
					cnt++;
				}
			}
			if(cnt ==0) {
				break;
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
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		System.out.println("==============================");
		int start = (int) System.currentTimeMillis();
		
		bubblesort(arr, N);
			
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		
		
	}
}
