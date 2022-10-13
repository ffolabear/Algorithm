package baekjoon.loop_for;

import java.util.Scanner;

public class Boj_10871_1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N ; i++) {
			int value = in.nextInt();
			if(value < X) {
				sb.append(value + " ");
			}
			
		}
		System.out.println(sb);
	}
}
