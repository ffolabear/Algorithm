package BaekJoon;

import java.util.Scanner;

public class baek_N2 {
	
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
