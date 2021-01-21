package data_structure;

import java.util.Random;

public class Array_swap {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {

			arr[i] = rand.nextInt(10);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		reverse(arr);

		for (int i = 0; i < 5; i++) {

			System.out.print(arr[i] + " ");
		}

	}

	static void swap(int a[], int index1, int index2) {

		int t = a[index1];
		a[index1] = a[index2];
		a[index2] = t;
		System.out.println("a[" + index1 + "]" + "와" + "a[" + index2 + "] 를 교환합니다.");

	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			
			swap(a, i, a.length - i - 1);
			for(int j=0; j< a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}

		System.out.println("배열을 역순으로 정렬합니다.");
	}

}
