package Algo_practice;

import java.util.Scanner;

public class Search {
	
	static int search(int[] arr, int len, int find) {
		
		int i = 0;
		
		while(true) {
			
			if(arr[i] == find) {
				break;
			}
			i++;
		}
		
		return i == len ? -1 : i;
	}
	
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값의 갯수를 입력해주세요 : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len + 1];
		System.out.print("원하는 값을 입력해주세요 : ");
		for(int i = 0 ; i < len; i++) {
			
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
			
		}
		
		
		System.out.print("찾고 싶은 값을 입력해주세요 : ");
		int find = sc.nextInt();
		arr[len] = find; 
		
		int aws = search(arr, len, find);
		if (aws == -1) {
			System.out.println("그런 요소는 존재하지 않습니다.");
		} else {
			
			System.out.println("찾는 요소는 arr[" + aws + "] 에 있습니다.");
		}
		
		
		long end = System.currentTimeMillis();
		
		long timePassed = end - start;
		System.out.println("컴파일할때 겋린 총 시간 : " + timePassed);
	}

}
