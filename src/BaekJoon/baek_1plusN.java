package BaekJoon;

import java.util.*;

public class baek_1plusN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res=0;
		if (n >=1 && n<= 10000) {
			for(int i=0 ; i <=n ; i++) {
				res += i;
			}
			System.out.println(res);
		}
	}

}
