package baekjoon_stack;

import java.util.Scanner;
import java.util.Stack;

public class Baek_9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			
			String str = sc.next();
			String[] arr = str.split(str);
			
			for(int j = 0; j < arr.length; j++) {
				
				String aws = "";
				
				if(arr[i] == "(") {
					aws += arr[i]; 
				} else if (arr[i] == ")") {
					aws.replace("(", null);
				}
				
				System.out.print(aws + "/");
				
				
				
				
			}

		}
	}

}
