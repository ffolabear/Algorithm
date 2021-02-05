package Algo_practice;

import java.util.Scanner;

public class Factorial {
	
	static int Factorial(int N) {
		
		int aws = 1;
		
		while(N>1) {
			
			aws *= N--;
			
		}
		return aws;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int N = sc.nextInt();
		
		System.out.println(Factorial(N));
		
		
	}
	

}
