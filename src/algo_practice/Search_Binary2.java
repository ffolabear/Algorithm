package algo_practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Search_Binary2 {

	static int searchIdx(int[] arr, int len, int find) {
		
		// 인덱스나열
		System.out.print("   |");
		for(int j = 0 ; j < len; j++) {
			System.out.printf("%4d", j);
		}
		
		System.out.println();
		System.out.print("---+");
		
		// 인덱스 바로 밑줄 생성
		for (int k = 0; k < 4 * len + 2; k++) {
			System.out.print("-");
		}
		
		System.out.println();
		
		int startPoint = 0;
		int endPoint = len-1;
		
		
//		for(int i = 0; i < len; i++) {
//			
//			int searchPoint = (startPoint + endPoint)/2;
//			System.out.print("   |");
//			System.out.printf(String.format("%%%ds<-", startPoint*3+3), "");
//			System.out.printf(String.format("%%%ds+", searchPoint * 2 + 2), "");
//			System.out.printf(String.format("%%%ds->\n",( endPoint - 1)* 2), "");
//			
//			System.out.printf("%3d|", searchPoint);
//			
//			for(int j=0; j <len ; j++) {
//				
//				System.out.printf("%4d", arr[j]);
//			}
//			System.out.println("\n   |");
//			
//			
//				if(arr[searchPoint] == find) {
//					
//					return searchPoint;
//					
//				} else if (arr[searchPoint] < find ) {
//					
//					
//					startPoint = searchPoint + 1;
//					
//				} else if (arr[searchPoint] > find ) {
//					
//					endPoint = searchPoint - 1;
//					
//				}
//		}
		
		
		do {
			
			int searchPoint = (startPoint + endPoint)/2;
			System.out.print("   |");
			
			if (startPoint != searchPoint) {
				System.out.printf(String.format("%%%ds<-%%%ds+", (startPoint * 4) + 1, (searchPoint - startPoint) * 4), "", "");
			} else {
				System.out.printf(String.format("%%%ds<-+", searchPoint * 4 + 1), "");
			}
			
			if (searchPoint != endPoint) {
				System.out.printf(String.format("%%%ds->\n", (endPoint - searchPoint) * 4 - 2), "");
			} else {
				System.out.println("->");
			}
			
			System.out.printf("%3d|", searchPoint);
			
			for (int k = 0; k < len; k++) {
				System.out.printf("%4d", arr[k]);
			}
			
			System.out.println("\n   |");
			
			if (arr[searchPoint] == find) {
				return searchPoint; // 검색성공
			} else if (arr[searchPoint] < find) {
				startPoint = searchPoint + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			} else {
				endPoint = searchPoint - 1; // 검색범위를 앞쪽 절반으로 좁힘
			}
			
			
		} while (startPoint <= endPoint);
		
		
		return -1; // 검색실패
	}

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이를 입력하세요 : ");
		int len = sc.nextInt();

		int[] arr = new int[len];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
			//System.out.println("arr[" + i + "] : " + arr[i]);
		}

		System.out.print("찾고싶은 값을 입력하세요. : ");
		int find = sc.nextInt();

		Arrays.sort(arr);
		int aws2= searchIdx(arr, len, find);
		
		if (aws2 == -1) {
			System.out.println("찾는 값이 없습니다.");
		} else {
			System.out.println("찾는 값은 arr[" + aws2 + "] 에 있습니다.");
		}
		
	}

}
