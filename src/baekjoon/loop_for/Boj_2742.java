package baekjoon.loop_for;

import java.util.Scanner;

public class Boj_2742 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<=100000) {
			for(int i=0 ; i < N; i++ ) {
				System.out.println(N-i);
			}
		}
	}

}
