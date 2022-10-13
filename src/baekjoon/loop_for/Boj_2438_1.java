package baekjoon.loop_for;

import java.util.*;

public class Boj_2438_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N>=1 && N<=100) {
			for(int i=0 ; i<=N ; i++) {
				for(int j=1 ; j<=i ; j++) {
					if(i==j) {
						System.out.println("*");
					} else {
						System.out.print("*");
					} 
					
				}
			}
		}
	}

}
