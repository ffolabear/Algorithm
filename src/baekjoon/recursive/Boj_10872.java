package baekjoon.recursive;

import java.util.Scanner;

public class Boj_10872 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		System.out.println(recursive(N));
		
	}
	
	static int recursive(int N) {
		
		int aws = 1;
		if(N > 0) {
			return N * recursive(N -1 );
		} else {
			return 1;
		}
		
	}

}
